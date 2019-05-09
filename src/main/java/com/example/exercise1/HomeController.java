package com.example.exercise1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class HomeController {
    @RequestMapping("/")
    public String homePage() {
        return "index";
    }
    @RequestMapping("/crabcakes")
    public String crabCakes(){
        return "crabcakes";
        }
    }


