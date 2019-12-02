package com.testab.es31;

public class Main {

	public void main() {
		
		UserElement userE = new UserElement();
		Profile profile = new Profile();
		Post post = new Post();
		Link link = new Link();
		PhotoLink phLink = new PhotoLink();
		
		userE = new Link();
		userE = new Post();
		userE = new PhotoLink();
		
		link.hide();
		
		something(post, link, phLink);
		
	}
	
	public <T extends Printable> void something (T uno, T due, T tre)  {
		uno.hide();
		due.hide();
		tre.hide();
	}
	
}
