package com.madspild.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MadspildController {

    @GetMapping("/madspild")
    public String getMadspild(){
        return "home/madspild";
    }
}
