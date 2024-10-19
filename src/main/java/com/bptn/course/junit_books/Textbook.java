package com.bptn.course.junit_books;

//textbook class extending book class
public class Textbook extends Book {

	//Define a private int instance variable edition
	private int edition;

	//Define a constructor for Textbook that takes three parameters: a string title, a double price, and an int edition

	public Textbook(String title, double price, int edition) {
	        super(title, price);  // Call the constructor of the superclass (Book)
	        this.edition = edition;
	    }

	//Define a method called getBookInfo that overrides the getBookInfo method in the superclass

	@Override
	    public String getBookInfo() {
		return super.getBookInfo() + "-" + edition;
	    }

	//Define a method calledgetEdition that returns the value of edition.

	public int getEdition() {
	        return edition;
	    }

	//Define a method calledcanSubstituteFor that takes a Textbook object other as parameter. It should return a boolean value indicating whether the current textbook can substitute for the other textbook

	public boolean canSubstituteFor(Textbook other) {
	    return this.getTitle().equals(other.getTitle()) && this.edition >= other.getEdition();
	}

}
	
