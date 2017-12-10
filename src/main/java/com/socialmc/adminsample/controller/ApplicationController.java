package com.socialmc.adminsample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ApplicationController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }
    @RequestMapping("/news")
    public String news(Model model) {
    	return "news";
    }
    @RequestMapping("/admin")
    public String admin() {
    	return "admin";
    }
}
