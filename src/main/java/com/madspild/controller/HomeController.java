package com.madspild.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/startside")
    public String getIndex(){
        return "home/index";
    }
}
