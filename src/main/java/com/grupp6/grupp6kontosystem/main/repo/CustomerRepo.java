package com.grupp6.grupp6kontosystem.main.repo;

import com.grupp6.grupp6kontosystem.model.Customer;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.persistence.Entity;

//  extendar JpaRepository som ger oss olika crudd operationer
// lägger in <Customer(objektet mall),Long(för id)>  i JpaRepositority så att vi kan använda den på våran customer

public interface CustomerRepo extends JpaRepository<Customer, Long> {


    // lägger in customer objektet i JpaRepositorys save metod
    /*@Override
    public void saveCustomer(Customer customer) {
        this.CustomerRepo.save(customer);
    }*/




}