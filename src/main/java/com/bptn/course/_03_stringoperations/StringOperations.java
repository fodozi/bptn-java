package com.bptn.course._03_stringoperations;

import java.util.Scanner;

public class StringOperations {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continueOperations = true;

        while (continueOperations) { 
            
            // String Menu
            System.out.println("String Operations Menu");
            System.out.println("Press 1 for Palindrome Check");
            System.out.println("Press 2 to Reverse a String");
            System.out.println("Press 3 to Concatenate two Strings"); 
            System.out.println("Press 4 for String Comparison"); 
            System.out.println("Press 5 to Calculate the Length of a String");
            System.out.println("Press 6 to Exit");

            int choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) { 
                case 1: // Palindrome Check
                    System.out.print("Enter a string to check if it's a palindrome: ");
                    String palindromeInput = sc.nextLine();
                    boolean isPalindrome = true;
                    int start = 0, end = palindromeInput.length() - 1;

                    while (start < end) {
                        if (palindromeInput.charAt(start) != palindromeInput.charAt(end)) {
                            isPalindrome = false;
                            break;
                        }
                        start++;
                        end--;
                    }

                    if (isPalindrome) {
                        System.out.println(palindromeInput + " is a palindrome.");
                    } else {
                        System.out.println(palindromeInput + " is not a palindrome.");
                    }
                    break;

                case 2: // Reverse a String
                    System.out.print("Enter a string to reverse: ");
                    String reverseInput = sc.nextLine(); 
                    System.out.println("Reversed string: " + new StringBuilder(reverseInput).reverse().toString());
                    break;

                case 3: // Concatenate two Strings
                    System.out.print("Enter the first string: ");
                    String str1 = sc.nextLine();
                    System.out.print("Enter the second string: ");
                    String str2 = sc.nextLine();
                    System.out.println("Concatenated string: " + str1 + str2);
                    break;

                case 4: // String Comparison
                    System.out.print("Enter the first string to compare: ");
                    String compStr1 = sc.nextLine();
                    System.out.print("Enter the second string to compare: ");
                    String compStr2 = sc.nextLine();
                    if (compStr1.equals(compStr2)) {
                        System.out.println("The entered strings are equal.");
                    } else {
                        System.out.println("The entered strings are not equal.");
                    }
                    break;

                case 5: // Calculate the Length of a String
                    System.out.print("Enter a string to calculate its length: ");
                    String lengthInput = sc.nextLine();
                    System.out.println("The length of the string is: " + lengthInput.length());
                    break;

                case 6: // Exit
                    continueOperations = false;
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }

        sc.close(); 
    }
}
