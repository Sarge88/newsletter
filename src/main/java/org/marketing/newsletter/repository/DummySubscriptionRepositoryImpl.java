package org.marketing.newsletter.repository;

import org.marketing.newsletter.model.Subscription;
import org.springframework.stereotype.Repository;


@Repository
public class DummySubscriptionRepositoryImpl implements SubscriptionRepository{

	@Override
	public void save(Subscription subscription) {
		System.out.println("DummySubscriptionImpl 'saves' " + subscription);
	}

}
