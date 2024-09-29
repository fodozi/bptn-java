package com.bptn.course.fridaybigcode;

import java.util.Scanner;

public class CalculatorCode {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continueCalculation = true;

        while (continueCalculation) {  
        	
            System.out.println("Calculator Menu:");
            System.out.println("Press 1 for addition");
            System.out.println("Press 2 for subtraction");
            System.out.println("Press 3 for multiplication");
            System.out.println("Press 4 for division");
            System.out.println("Press 5 to square a number");
            System.out.println("Press 6 to find a square root");
            System.out.println("Press 7 to find the reciprocal");
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();

         // Initialize numbers 
            double num1 = 0, num2 = 0;   

            // Users input and choice
            if (choice == 1) {
                System.out.print("Enter first number: ");
                num1 = sc.nextDouble();  
                System.out.print("Enter second number: ");
                num2 = sc.nextDouble();
                System.out.println("The sum is: " + (num1 + num2));
            } else if (choice == 2) {
                System.out.print("Enter first number: ");
                num1 = sc.nextDouble();
                System.out.print("Enter second number: ");
                num2 = sc.nextDouble();
                System.out.println("The difference is: " + (num1 - num2));
            } else if (choice == 3) {
                System.out.print("Enter first number: ");
                num1 = sc.nextDouble();
                System.out.print("Enter second number: ");
                num2 = sc.nextDouble();
                System.out.println("The product is: " + (num1 * num2));
            } else if (choice == 4) {  
                System.out.print("Enter first number: ");
                num1 = sc.nextDouble();
                System.out.print("Enter second number: ");
                num2 = sc.nextDouble();

                
                if (num2 != 0) {
                    double quotient = num1 / num2;
                    double remainder = num1 % num2;
                    System.out.println("Dividing " + num1 + " by " + num2 + " :");
                    System.out.println("The quotient is " + quotient);
                    System.out.println("The remainder is " + remainder);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                } 
            } else if (choice == 5) {
                System.out.print("Enter number: ");
                num1 = sc.nextDouble();
                System.out.println("The square is: " + (num1 * num1));
            } else if (choice == 6) {
                System.out.print("Enter number: ");
                num1 = sc.nextDouble();
                System.out.println("The square root is: " + Math.sqrt(num1));
            } else if (choice == 7) {
                System.out.print("Enter number: ");
                num1 = sc.nextDouble();
                if (num1 != 0) {
                    System.out.println("The reciprocal is: " + (1 / num1));
                } else {
                    System.out.println("Error: Cannot find reciprocal of zero.");
                }
            } else {
                System.out.println("Invalid choice. Please choose from the menu.");
            }

            System.out.println("Press 1 to continue or any Key to Exit");
            int nextChoice = sc.nextInt();
            if (nextChoice != 1) {
                continueCalculation = false;
            }
        }

        sc.close();
    }
}
