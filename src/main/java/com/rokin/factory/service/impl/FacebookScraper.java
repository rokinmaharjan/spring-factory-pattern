package com.rokin.factory.service.impl;

import org.springframework.stereotype.Service;

import com.rokin.factory.service.ScraperService;

@Service
public class FacebookScraper implements ScraperService {

	@Override
	public void scrape() {
		System.err.println("Facebook scraper called");
	}

}
