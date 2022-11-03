package com.prueba.overcome.services;

import java.util.List;

import com.prueba.overcome.entities.Ticket;

public interface ITicketService {

public List<Ticket> listarP();
	
	public void guardar(Ticket p);
		
	public Ticket buscarP(Ticket p);
}
