package com.spring.exp.ticketsystem.converter;

import com.spring.exp.ticketsystem.domain.Ticket;
import com.spring.exp.ticketsystem.dto.TicketDto;
import org.springframework.stereotype.Component;

@Component
public class TicketToTicketDtoConverter implements Converter<Ticket, TicketDto> {

    @Override
    public TicketDto convert(Ticket ticket) {
        return TicketDto.builder()
                .id(ticket.getId())
                .title(ticket.getTitle())
                .build();
    }
}
