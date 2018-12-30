package com.rokin.factory.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.rokin.factory.service.impl.WebsiteScraper;

@RestController
public class ScraperController {

	@Autowired
	private WebsiteScraper websiteScraper;

	@GetMapping("/scrape")
	@ResponseStatus(HttpStatus.OK)
	public void scrape(@RequestParam(required = true) String website) {
		this.websiteScraper.scrapeData(website);
	}

}
