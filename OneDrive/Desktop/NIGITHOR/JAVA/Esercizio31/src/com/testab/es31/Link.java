package com.testab.es31;

public class Link extends Post{

	private String URL;

	
	public Link(String uRL) {
		super();
		URL = uRL;
	}

	public Link() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getURL() {
		return URL;
	}

	public void setURL(String uRL) {
		URL = uRL;
	}
	
	
}
