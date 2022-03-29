package com.madspild.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InfoController {


    @GetMapping("/aboutus")
    public String getOmOs(){
        return "aboutus";
    }
}
