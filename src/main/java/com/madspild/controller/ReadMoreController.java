package com.madspild.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ReadMoreController {
    @GetMapping("/læsmere")
    public String getLæsMere(){
        return "readmore";
    }
}
