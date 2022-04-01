package com.madspild.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ContactController {
    @GetMapping("/kontakt")
    public String getLæsMere(){
        return "home/contact";
    }
}
