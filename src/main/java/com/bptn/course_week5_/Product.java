package com.bptn.course_week5_;

import java.util.ArrayList;
import java.util.List;

public class Product {
    
    // Create your instance variables
    private int id;
    private String name;
    private double price;

    // Create a constructor to initialize the product properties
    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    // Getter method for price
    // Since we cannot access the price variable which is private, we create a getter method
    public double getPrice() {
        return price;
    }

    // Create a static method "countProducts"
    //Here we are creating a method to count the number of products in a list whose price is < 30000.

    public static long countProducts(List<Product> productsList) {
    // Filter products based on the price and get the count of products
   List<Product> filteredProducts = productsList.stream()
 .filter(product -> product.getPrice() < 30000)
 .toList();

 long count = filteredProducts.stream().count();

 return count;

 }


    public static void main(String[] args) {
        // Create a list of products
        //The array list holds all product added and can be retrieved when needed
        List<Product> productsList = new ArrayList<Product>();

        // Add products to the list
        productsList.add(new Product(1, "HP Laptop", 25000));
        productsList.add(new Product(2, "Dell Laptop", 30000));
        productsList.add(new Product(3, "Lenevo Laptop", 28000));
        productsList.add(new Product(4, "Sony Laptop", 28000));
        productsList.add(new Product(5, "Apple Laptop", 90000));
  
        // Call "countProducts" method and hold return type in "count" variable 
        // The result of the countProducts method call is stored in the count variable. This allows us to use the result whenever we want.

        long count = countProducts(productsList);

        // Print the count of products whose price is less than 30000
        System.out.println("Number of products with price less than 30000: " + count);
    }
}

// In summary, nothing was so new to me but what I ran into issues with
//Filtering products based on the price and get the count of products.
//In future, I will always check if the variables are private first or make them accessible before coding.