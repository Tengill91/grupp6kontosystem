package com.grupp6.grupp6kontosystem.main.repo;

import com.grupp6.grupp6kontosystem.main.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer, Long> {
}