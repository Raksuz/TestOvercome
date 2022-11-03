package com.prueba.overcome.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prueba.overcome.entities.Ticket;

public interface TicketDao extends JpaRepository<Ticket, Long>{

}
