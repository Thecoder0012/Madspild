package com.madspild.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LogoController {

    @GetMapping("/logo")
    public String getLogo(){
        return"logo";
    }
}
