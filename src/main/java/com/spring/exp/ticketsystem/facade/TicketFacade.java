package com.spring.exp.ticketsystem.facade;

import com.spring.exp.ticketsystem.dto.TicketDto;

import java.util.List;

public interface TicketFacade {
    List<TicketDto> getAllTickets();
}
