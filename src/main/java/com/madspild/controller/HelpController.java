package com.madspild.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelpController {
    @GetMapping("/hjælp")
    public String getHjælp(){
        return "home/help";
    }
}
