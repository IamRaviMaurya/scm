package com.scm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class PageController {

    @RequestMapping("/home")
    public String home(Model model) {
        model.addAttribute("heading", "Welcome to home");
        model.addAttribute("paragraph", "lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod,llamcorper, vel, sed diam nonum, sed diam nonum, sed diam nonum, sed diam nonum,   sed diam nonum, sed diam nonum, sed diam, sed diam nonum, sed diam nonum, sed diam nonum, sed diam nonum, sed diam nonum, sed diam nonum,"
        +"lorem ipsum dolor sit am,   consectetur adipiscing elit, sed do e,  sed");
        return "home";
    }
    
}
