package com.spring.exp.ticketsystem.repository;

import com.spring.exp.ticketsystem.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;


public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByEmail(String email);
}
