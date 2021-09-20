package com.grupp6.grupp6kontosystem.service;

import com.grupp6.grupp6kontosystem.bean.Handler;
import com.grupp6.grupp6kontosystem.model.Customer;
import com.grupp6.grupp6kontosystem.model.CustomerRepo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController // skriver ut "metoden" med @GetMapping
public class UserService {



    @GetMapping("/user")
    public String user(){
        return "<h1>User page!</h1>";
    }

    /*@GetMapping("/hello/{name}")
    public String welcomeName(@PathVariable("name") String name) {
        return "welcome " + name;
    }*/





}
