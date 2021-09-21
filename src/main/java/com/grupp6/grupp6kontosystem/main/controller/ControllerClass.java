package com.grupp6.grupp6kontosystem.main.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller   // returnerar filer med @GetMapping. Why? i dont know.
public class ControllerClass {

    @GetMapping("/")
    public String sayHello(){

        return "home";       // returnerar home.html
    }


}
