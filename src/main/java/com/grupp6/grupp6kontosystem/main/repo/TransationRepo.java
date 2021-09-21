package com.grupp6.grupp6kontosystem.main.repo;

import com.grupp6.grupp6kontosystem.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransationRepo extends JpaRepository<Transaction, Long> {
}
