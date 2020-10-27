package org.marketing.newsletter.controller;

import java.util.Arrays;
import java.util.List;

import org.marketing.newsletter.model.Newsletter;
import org.marketing.newsletter.repository.NewsletterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ConformationController {
	
	@Value("${subscription.numberOfNewsletterSubscription}") //application.properties-ből jön
	private long numberOfNewsletterSubscriptions;
	
	private final List<Newsletter> recentNewsletters = Arrays.asList(
			new Newsletter("Extreme price cut! 20-30-40% OFF!", "..."),
			new Newsletter("New store in W-London", "..."));
	
	@Autowired
	private NewsletterRepository newsletterRepository;
	
	@GetMapping("/thank-you")
	public String getConformation(Model model) {
		model.addAttribute("numberOfNewsletterSubscriptions", numberOfNewsletterSubscriptions); //Dont hardcode this
		model.addAttribute("newsletterHighlights", newsletterRepository.getRecentNewsletters()); //Dont hardcode this
		return "conformation";
	}
}
