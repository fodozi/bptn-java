package com.bptn.course._week2_bigfridaycode;

public class Triangle {
	// Method to calculate the perimeter of the triangle
    public int perimeterCalculator(int a, int b, int c) {
        return a + b + c;  // Sum of all three sides
    }

    // Method to calculate the area of the triangle
    public int areaCalculator(int base, int height) {

         // Area = (base * height) / 2
        return (base * height) / 2;  
    }

	
	
	public static void main(String[] args) {
		
		// Creating an object of the Triangle class
        Triangle triangle = new Triangle();

        // Declaring and initializing variables for the sides of the triangle
        int a = 7;
        int b = 10;
        int c = 35;

        // Calculate the perimeter
        int perimeter = triangle.perimeterCalculator(a, b, c);

        // Declare and initialize variables for the base and height of the triangle
        int base = 7;
        int height = 10;

        // Calculate the area
        int area = triangle.areaCalculator(base, height);

        // Print the results
        System.out.println("Perimeter of the triangle is: " + perimeter);
        System.out.println("The Area of the Triangle is: " + area);
		

	}

}
