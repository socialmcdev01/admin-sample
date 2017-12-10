package com.socialmc.adminsample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.socialmc.adminsample.service.NewsService;
import com.socialmc.adminsample.service.data.News;

@RestController
public class ApplicationRestController {
	@Autowired
	private NewsService newsService;
	@RequestMapping(value="/api/news", method= RequestMethod.GET, produces="application/json; charset=UTF-8")
	public List<News> news() {
		return this.newsService.findAll();
	}
}
