package com.prueba.overcome.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.prueba.overcome.entities.Ticket;
import com.prueba.overcome.services.ITicketService;

@Controller
public class ControladorInicio {
	
	@Autowired
	private ITicketService ticketService;
	
	@GetMapping("/")
	private String inicio(Model m) {
		var tickets = ticketService.listarP();
		m.addAttribute("tickets", tickets);
		return "index";
	}
	
	@GetMapping("/agregar")
	private String agregar(Ticket ticket) {
		return "modificar";
	}
	
	@PostMapping("/guardar")
	private String guardar(@Valid Ticket ticket, Errors errores) {
		if(errores.hasErrors()) {
			return "modificar";
		}
		ticketService.guardar(ticket);
		return "redirect:/";
	}
	
	@GetMapping("/editar/{id}")
	private String editar(Ticket ticket, Model m) {
		ticket = ticketService.buscarP(ticket);
		m.addAttribute("ticket", ticket);
		return "modificar";
	}
	
	@GetMapping("/detalles/{id}")
	private String detalle(Ticket ticket, Model m) {
		ticket = ticketService.buscarP(ticket);
		m.addAttribute("ticket", ticket);
		return "detalle";
	}
}
