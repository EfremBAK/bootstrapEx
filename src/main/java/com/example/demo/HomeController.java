package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String index(Model model){
        model.addAttribute("myvar", "Say hello to my lil friend");
        return "index";
    }

    @GetMapping("/git")
    public String git(){
        return "git";
    }

    @GetMapping("/oop")
    public String oop(){
        return "oop";
    }
    @GetMapping("/about")
    public String about(){
        return "about";
    }
    @GetMapping("/profile")
    public String profile(){
        return "profile";
    }
//    @RequestMapping
//    @PostMapping
}
