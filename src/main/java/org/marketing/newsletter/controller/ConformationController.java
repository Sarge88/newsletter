package org.marketing.newsletter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ConformationController {
	
	@GetMapping("/thank-you")
	public String getConformation() {
		return "conformation";
	}
}
