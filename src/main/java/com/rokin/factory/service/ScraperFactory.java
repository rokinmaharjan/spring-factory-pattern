package com.rokin.factory.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rokin.factory.service.impl.FacebookScraper;
import com.rokin.factory.service.impl.InstagramScraper;
import com.rokin.factory.service.impl.LinkedInScraper;

@Service
public class ScraperFactory {

	@Autowired
	private LinkedInScraper linkedInScraper;

	@Autowired
	private FacebookScraper facebookScraper;

	@Autowired
	private InstagramScraper instagramScraper;

	public ScraperService getScraper(String website) {
		if (website.equalsIgnoreCase("linkedin")) {
			return this.linkedInScraper;
		} else if (website.equalsIgnoreCase("facebook")) {
			return this.facebookScraper;
		} else if (website.equalsIgnoreCase("instagram")) {
			return this.instagramScraper;
		} else {
			return null;
		}
	}

}
