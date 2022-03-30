package com.madspild.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ReadMoreController {
    @GetMapping("/læs-mere")
    public String getLæsMere(){
        return "readmore";
    }
}
