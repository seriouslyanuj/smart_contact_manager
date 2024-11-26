package com.scm.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestMethod;
// import org.springframework.web.bind.annotation.RequestParam;




@Controller
public class PageController {
    @RequestMapping("/home")
    public String home(Model model) {
        model.addAttribute("name","Substring Technologies");
        model.addAttribute("id","2125it1096");
        model.addAttribute("username","seriously_anuj");
        System.out.println("Home Page Controller");
        return "home";
    }

    //about
    @RequestMapping("/about")
    public String aboutPage() {
        return "about";
    }

    //services
    @RequestMapping("/services")
    public String servicesPage() {
        return "services";
    }

    //services
    @RequestMapping("/contact")
    public String contactPage() {
        return "contact";
    }

    //login
    @RequestMapping("/login")
    public String loginPage() {
        return "login";
    }
    
    //signup
    //login
    @RequestMapping("/register")
    public String registerPage() {
        return "register";
    }
    
}
