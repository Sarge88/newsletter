package org.marketing.newsletter.model;

public class Subscription {
	
	private String fullName;
	private String emailAddress;
	
	
	public Subscription() {
		
	}
	
	public Subscription(String fullName, String emailAddress) {
		super();
		this.fullName = fullName;
		this.emailAddress = emailAddress;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	@Override
	public String toString() {
		return "Subscription [fullName=" + fullName + ", emailAddress=" + emailAddress + "]";
	}
	
	
}
