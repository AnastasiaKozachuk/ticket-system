package com.spring.exp.ticketsystem.facade.impl;

import com.spring.exp.ticketsystem.converter.TicketToTicketDtoConverter;
import com.spring.exp.ticketsystem.dto.TicketDto;
import com.spring.exp.ticketsystem.facade.TicketFacade;
import com.spring.exp.ticketsystem.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TicketFacadeImpl implements TicketFacade {

    @Autowired
    private TicketService ticketService;

    @Autowired
    private TicketToTicketDtoConverter toTicketDtoConverter;

    @Override
    public List<TicketDto> getAllTickets() {
        return toTicketDtoConverter.convertAll(ticketService.findAllTickets());
    }
}
