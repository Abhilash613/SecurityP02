package com.cfs.SecurityP02.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BankController {


    @GetMapping("/contact")
    public String ContactUs(){
        return "Contact us at:646466546";
    }
    @GetMapping("/transfer")
    public String transfer(){
        return "Your money transfer ";
    }
    @GetMapping("/admin")
    public String admin(){
        return "Welcome admin";
    }
    @GetMapping("/about")
    public String about(){
        return "Suresh Founder of SBI";
    }
}
