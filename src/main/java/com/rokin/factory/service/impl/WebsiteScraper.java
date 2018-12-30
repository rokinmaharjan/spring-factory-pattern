package com.rokin.factory.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rokin.factory.service.ScraperFactory;
import com.rokin.factory.service.ScraperService;

@Service
public class WebsiteScraper {
	@Autowired
	private ScraperFactory scraperFactory;
	
	public void scrapeData(String website) {
		ScraperService scraper = this.scraperFactory.getScraper(website);
		scraper.scrape();
	}
}
