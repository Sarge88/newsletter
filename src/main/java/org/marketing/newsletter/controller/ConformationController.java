package org.marketing.newsletter.controller;

import java.util.Arrays;
import java.util.List;

import org.marketing.newsletter.model.Newsletter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ConformationController {
	
	private final List<Newsletter> recentNewsletters = Arrays.asList(
			new Newsletter("Extreme price cut! 20-30-40% OFF!", "..."),
			new Newsletter("New store in W-London", "..."));
	
	@GetMapping("/thank-you")
	public String getConformation(Model model) {
		model.addAttribute("numberOfNewsletterSubscriptions", 234234); //Dont hardcode this
		model.addAttribute("newsletterHighlights", recentNewsletters); //Dont hardcode this
		return "conformation";
	}
}
