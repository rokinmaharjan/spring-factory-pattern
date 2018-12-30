package com.rokin.factory.service.impl;

import org.springframework.stereotype.Service;

import com.rokin.factory.service.ScraperService;

@Service
public class LinkedInScraper implements ScraperService {

	@Override
	public void scrape() {
		System.err.println("LinkedIn scraper called");
	}

}
