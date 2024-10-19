package com.bptn.course.junit_books;

//define two private instance variables: title and price to store the title and price of the book, respectively.

public class Book {
private String title;
private double price;

//Define a constructor that takes two parameters: title and price. 

public Book(String title, double price) {
     this.title = title;
     this.price = price;
 }

//Define a getter method named getTitle that returns the value of the title instance variable in the Book class.

public String getTitle() {
     return title;
 }

//Define a method named getBookInfo that returns a string by combining the title and price properties of the current object into a single string.

public String getBookInfo() {
     return title + "-" + price;
 }

}