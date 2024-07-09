package com.scm20.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;



@Controller

public class pagecontrollers {
    @RequestMapping("/home")  
    public String home()
    {
        System.out.println("home page handler");
        // model.addAttribute("name","Substring technology");
        // model.addAttribute("youtubechannel","BHARAT SACHDEVA");
        // model.addAttribute("link","https://www.youtube.com/watch?v=3p__WB2Kuls&list=PL0zysOflRCemNS641tpw66bcaFylyIGsA&index=3");
        return "home";

    }

    //about
  
  @RequestMapping("/about")
    public String aboutpage(){
        System.out.println("about page loading");
        return "about";
    }
    
    //services
    @RequestMapping("/services")
    public String servicespage(){
        System.out.println("services page loading");
        return "services";
    }

    //contact
    @RequestMapping("/contact")
    public String contactpage(){
        System.out.println("contact page loading");
        return "contact";
    }

    //login
    @RequestMapping("/login")
    public String loginpage(){
        System.out.println("login page loading");
        return "login";
    }

    //register
    @RequestMapping("/register")
    public String registerpage(){
        System.out.println("register page loading");
        return "register";
    }


}
