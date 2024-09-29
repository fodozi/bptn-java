package com.bptn.course.fridaybigcode;

import java.util.Scanner;

public class WordEncryption {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// Ask the user for string input
        System.out.println ("Enter a string for encrypting");
        String input = sc.nextLine();
        
        // Declaring the shift space for encryption
        int shift = 1;
		
        
        String encryptedString = encrypt(input, shift);
        
        // Print of encrypted string
        
        System.out.println ("Encrypted string is: " + encryptedString);
        
        sc.close();

	}
	
	  // Implementing the Ceasar Cipher that helps shift plain text by 1

	public static String encrypt(String text, int shift) {
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            
            // Checking if String is Upper or Lower Case
            if (Character.isLetter(ch)) {
            	
            	// Shift lowercase letters and wrap from 'z' to 'a'
                if (Character.isLowerCase(ch)) {
                	
                    char shiftedChar = (char) ((ch - 'a' + 1) % 26 + 'a');
                    result.append(shiftedChar);
                    
                 // Shift uppercase letters and wrap from 'Z' to 'A'
                } else if (Character.isUpperCase(ch)) {
                    
                    char shiftedChar = (char) ((ch - 'A' + 1) % 26 + 'A');
                    result.append(shiftedChar);
                }


            } else {
                // When user inputs non text characters, append as imputed
                result.append(ch);
            }
        }
        
        return result.toString();
}
}


// Issue I Ran into and What was New
//Tried encrypting the string using,  String encryptedString = encrypt(input, shift);
//but it threw an error saying "The method is underfined for the type WordEncryption.
//So I followed the quick fix and it imported "private static String encrypt(String input, int shift) {
//return null;
//}" 
//then i used it in implementing the Ceasar cypher
//
//Question
//Could I change the non text characters to text characters as a way to encrypt them?



