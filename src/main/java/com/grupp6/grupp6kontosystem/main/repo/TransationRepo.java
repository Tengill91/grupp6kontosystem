package com.grupp6.grupp6kontosystem.main.repo;

import com.grupp6.grupp6kontosystem.model.transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransationRepo extends JpaRepository<transaction, Long> {
}
