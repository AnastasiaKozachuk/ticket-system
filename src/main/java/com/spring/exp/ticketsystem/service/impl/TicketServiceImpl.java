package com.spring.exp.ticketsystem.service.impl;

import com.spring.exp.ticketsystem.domain.Ticket;
import com.spring.exp.ticketsystem.repository.TicketRepository;
import com.spring.exp.ticketsystem.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TicketServiceImpl implements TicketService {

    @Autowired
    private TicketRepository ticketRepository;

    @Override
    public List<Ticket> findAllTickets() {
        return ticketRepository.findAll();
    }
}
