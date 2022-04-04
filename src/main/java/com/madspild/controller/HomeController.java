package com.madspild.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

    @RequestMapping(value = "/startside", method = RequestMethod.GET)
    public String getIndex() {
        return "home/index";
    }

    @RequestMapping(path = "/hvad-er-madspild", method = RequestMethod.GET)
    public String getMadspild() {
        return "home/what_is_madspild";
    }

    @RequestMapping(path = "/om-os", method = RequestMethod.GET)
    public String getAboutUs() {
        return "home/aboutus";
    }

    @RequestMapping(path = "/kontakt", method = RequestMethod.GET)
    public String getReadMore() {
        return "home/contact";
    }

    @RequestMapping(path = "/hjælp", method = RequestMethod.GET)
    public String getHelp() {
        return "home/help";
    }

    @RequestMapping(path = "/logo", method = RequestMethod.GET)
    public String getLogo() {
        return "home/logo";
    }
}
