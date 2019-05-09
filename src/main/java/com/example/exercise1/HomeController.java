package com.example.exercise1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class HomeController {
    @RequestMapping("/")
    public String homepage() {
        return "index";
    }
    @RequestMapping("/crabcakes")
    public String crabcakes(){
        return "crabcakes";
        }
    @RequestMapping("/cinnamonrolls")
    public String cinnamonrolls() {
        return "cinnamonrolls";
    }
    @RequestMapping("/shrimpalfredo")
    public String shrimpalfredo() {
        return "shrimpalfredo";
    }
    @RequestMapping("/bootstrap")
    public String bootstrap(){
        return "bootstrap";
    }
    }


