package org.marketing.newsletter;

import org.junit.jupiter.api.Test;
import org.marketing.newsletter.model.Subscription;
import org.marketing.newsletter.service.SubscriptionService;
import org.marketing.newsletter.service.exception.SubscriptionAlreadyExistsException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class NewsletterApplicationTests {
	
	@Autowired
	private SubscriptionService service;
	
	@Test
	void test_registrationWithValidSubscription_succesful() throws SubscriptionAlreadyExistsException{
		service.register(new Subscription("Emily Blunt", "emily@hollywood.com"));
	}

}
/*
 * ez integrációs teszt(komponensek összjátéka), 
 * NEM UNIT TESZT! (az csak 1 classos)
 */