package com.grupp6.grupp6kontosystem.model;

import org.springframework.data.jpa.repository.JpaRepository;

public interface KontoRepo extends JpaRepository<Customer, Long> {
}