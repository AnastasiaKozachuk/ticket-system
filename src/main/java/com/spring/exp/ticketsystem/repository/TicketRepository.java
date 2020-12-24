package com.spring.exp.ticketsystem.repository;

import com.spring.exp.ticketsystem.domain.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket, Integer> {
}
