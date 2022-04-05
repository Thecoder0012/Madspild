package com.madspild.controller;

import com.madspild.Model.Beregn;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

    @RequestMapping(path = "/startside", method = RequestMethod.GET)
    public String getIndex() {
        return "home/index";
    }

    @RequestMapping(path = "/hvad-er-madspild", method = RequestMethod.GET)
    public String getMadspild() {
        return "home/what_is_madspild";
    }

    @RequestMapping(path = "/statistik",method = RequestMethod.GET)
    public String getStatistics(){
        return "home/statistics";
    }

    @RequestMapping(path = "/stop-madspild",method = RequestMethod.GET)
    public String getStopMadspild(){
        return "home/stop_madspild";
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

    @RequestMapping(path = "/beregn-madspild", method = RequestMethod.GET)
    public String getBeregnMadspild() {
        return "home/beregn_madspild";
    }

    @RequestMapping(path = "/beregn-data",method = RequestMethod.POST)
    public String personData(@ModelAttribute Beregn beregn, Model model){
        model.addAttribute("MadspildBeregner", beregn);
        return "home/beregn_data";
    }
}

