package com.grupp6.grupp6kontosystem.main.repo;

import com.grupp6.grupp6kontosystem.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KontoRepo extends JpaRepository<Customer, Long> {
}