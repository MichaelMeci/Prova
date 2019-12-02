package com.testab.es31;

public class Post extends UserElement implements Printable{

	private String body;
	
	@Override
	public void hide() {
		
		this.setVisible(false);
		
	}

}
