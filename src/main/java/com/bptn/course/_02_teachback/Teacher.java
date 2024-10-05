package com.bptn.course._02_teachback;

public class Teacher extends Person{

	String subject;
	 double salary;

	 // Constructor
	 public Teacher(String name, int age, String subject, double salary) {

	 super(name, age); // Call the Person constructor
	 this.subject = subject;
	 this.salary = salary;
	 }
	 
	 
	 public void displayTeacherDetails() {
	 System.out.println("Student ID: " + subject + ", Grade: " + salary);
	 }
	 

	 
	 @Override
	 public void displayInfo() {
	 super.displayInfo(); // Display Person's info
	 System.out.println("Subject: " + subject + ", Salary: " + salary);
	 }
	}
