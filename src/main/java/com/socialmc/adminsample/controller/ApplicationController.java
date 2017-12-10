package com.socialmc.adminsample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.socialmc.adminsample.service.NewsService;
import com.socialmc.adminsample.service.data.News;

@Controller
public class ApplicationController {

	@Autowired
	private NewsService newsService;
    @RequestMapping("/")
    public String index() {
        return "index";
    }
    @RequestMapping("/news")
    public String news(Model model) {
    	List<News> newsList = this.newsService.findAll();
    	model.addAttribute("newslist", newsList);
    	return "news";
    }
    @RequestMapping("/admin")
    public String admin() {
    	return "admin";
    }
}
