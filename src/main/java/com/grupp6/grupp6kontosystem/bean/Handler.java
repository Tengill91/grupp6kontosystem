package com.grupp6.grupp6kontosystem.bean;


import com.grupp6.grupp6kontosystem.model.Customer;
import com.grupp6.grupp6kontosystem.model.CustomerRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;


public class Handler {

    @Bean
    CommandLineRunner commandLineRunner (CustomerRepo customerRepo) {
        return args -> {
            Customer test = new Customer("Jonte","Efternamn", "jonte@efter.com");
            customerRepo.save(test);
        };
    }
}
