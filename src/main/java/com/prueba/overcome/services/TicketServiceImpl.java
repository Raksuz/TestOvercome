package com.prueba.overcome.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.prueba.overcome.dao.TicketDao;
import com.prueba.overcome.entities.Ticket;

@Service
public class TicketServiceImpl implements ITicketService{

	@Autowired
	private TicketDao ticketDao;
	
	@Override
	@Transactional(readOnly = true)
	public List<Ticket> listarP() {
		return (List<Ticket>) ticketDao.findAll();
	}

	@Override
	@Transactional
	public void guardar(Ticket p) {
		ticketDao.save(p);
	}

	@Override
	@Transactional(readOnly = true)
	public Ticket buscarP(Ticket p) {
		return ticketDao.findById(p.getId()).orElse(null);
	}

}
