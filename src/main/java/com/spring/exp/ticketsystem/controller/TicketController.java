package com.spring.exp.ticketsystem.controller;

import com.spring.exp.ticketsystem.dto.TicketDto;
import com.spring.exp.ticketsystem.facade.TicketFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tickets")
public class TicketController {

    @Autowired
    private TicketFacade ticketFacade;

    @GetMapping
    public List<TicketDto> getAllTickets(){
        return ticketFacade.getAllTickets();
    }
}
