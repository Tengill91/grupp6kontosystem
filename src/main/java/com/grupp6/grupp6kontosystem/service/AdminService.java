package com.grupp6.grupp6kontosystem.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController    // skriver ut "metoden" med @GetMapping
public class AdminService {



    @GetMapping("/admin")
    public String user(){
        return "<h1>Admin page!</h1>";
    }



    /*@GetMapping("/hello/{name}")
    public String welcomeName(@PathVariable("name") String name) {
        return "welcome " + name;
    }*/

}
