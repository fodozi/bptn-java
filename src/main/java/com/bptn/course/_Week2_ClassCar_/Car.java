package com.bptn.course._Week2_ClassCar_;

public class Car {
	// Declaring instance variables
    private String color;
    private String brand;
    private int price;

    // Parameterized constructor
    public Car(String color, String brand, int price) {
        // Assign constructor parameters to class variables using 'this' keyword
        this.color = color;
        this.brand = brand;
        this.price = price;
    }
      
  //Create a default constructor
    public Car() {
        // Call the parameterized constructor with default values
        this("Unknown", "Unknown", 0); 
      // Default values for color, brand, and price

    }
    
    // Method to print car details
    public void printCarDetails() {
        this.print();
    }

    // Private method to print the output
    private void print() {
        System.out.println("Car{color='" + color + "', brand='" + brand + "', price=" + price + '}');
    }
}
//Challenges was faced in creating the private method to print the output


