package com.socialmc.adminsample.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.socialmc.adminsample.service.data.News;
import com.socialmc.adminsample.service.data.NewsRepository;

@Service
public class NewsService {

	@Autowired
	private NewsRepository newsRepository;
	
	public List<News> findAll() {
		return this.newsRepository.findAll();
	}
}
