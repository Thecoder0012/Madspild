package com.madspild.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InfoController {


    @GetMapping("/om-os")
    public String getOmOs(){
        return "home/aboutus";
    }
}
