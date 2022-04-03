package com.madspild.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping(value = "/startside")
    public String getIndex() {
        return "home/index";
    }

    @GetMapping(value = "/hvad-er-madspild")
    public String getMadspild() {
        return "home/what_is_madspild";
    }

    @GetMapping(value ="/om-os")
    public String getAboutUs() {
        return "home/aboutus";
    }

    @GetMapping(value ="/kontakt")
    public String getReadMore() {
        return "home/contact";
    }

    @GetMapping(value ="/hjælp")
    public String getHelp() {
        return "home/help";
    }

    @GetMapping(value ="/logo")
    public String getLogo() {
        return "home/logo";
    }
}
