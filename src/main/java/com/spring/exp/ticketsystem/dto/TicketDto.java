package com.spring.exp.ticketsystem.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class TicketDto {
    private Integer id;
    private String title;
}
