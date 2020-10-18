package org.marketing.newsletter.repository;

import org.marketing.newsletter.model.Subscription;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;


@Repository
public class DummySubscriptionRepositoryImpl implements SubscriptionRepository{

	private Logger logger = LoggerFactory.getLogger(getClass());
	
	@Override
	public void save(Subscription subscription) {
		//System.out.println("DummySubscriptionImpl 'saves' " + subscription);
		logger.info("'save' {} now...", subscription);
		
	}

}
