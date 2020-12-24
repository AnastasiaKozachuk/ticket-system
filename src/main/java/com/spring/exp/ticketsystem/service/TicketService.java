package com.spring.exp.ticketsystem.service;

import com.spring.exp.ticketsystem.domain.Ticket;

import java.util.List;

public interface TicketService {
    List<Ticket> findAllTickets();
}
