package com.bptn.course.fridaybigcode;

import java.util.Scanner;

public class PluralForm {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Input for number
		System.out.print("Enter the number: ");
		int amt = sc.nextInt();

		// To consume the newline character
		sc.nextLine();

		// Input and word
		System.out.print("Enter the word: ");
		String word = sc.nextLine();

		// Print the result
		System.out.println(amt + " " + pluralize(word, amt));

		sc.close(); // Close the scanner
	}

	// Declaration of the plural method
	public static String pluralize(String word, int amt) {
		
		//for single form
		if (amt == 1) {
            return word;
            
         // Special cases for certain words with irregular pluralization
		 } else {
		            switch (word.toLowerCase()) {
		                case "hippopotamus":
		                	return (amt == 1) ? "hippopotamus" : ((amt > 1) ? "hippopotamuses" : "hippopotami");  
		                case "cactus":
		                    return "cacti";
		                case "octopus":
		                    return "octopuses";  
		                case "focus":
		                    return "foci";
		                case "syllabus":
		                    return "syllabi";
		                default:
		                    break; 
		            }
            
         // For Words ending in "us" -> "uses" (simplified rule)   
		
		            } if (word.endsWith("us")) {
            return word + "es";
            
         // Accounting for Words ending in "fe" -> "ves"
		} else 
            if (word.endsWith("fe")) {
                return word.substring(0, word.length() - 2) + "ves";
                
        // For Words ending in "ch", "sh", "s", "x", "z" -> add "es"
            }else  if (word.endsWith("ch") || word.endsWith("sh") || word.endsWith("s")
                         || word.endsWith("x") || word.endsWith("z")) {
                    return word + "es";
         
      // Handling special case where word ends with "y" but not "ay", "ey", "iy", "oy", or "uy"
        
		} else 
            if (word.endsWith("y") && !word.endsWith("ay") && !word.endsWith("ey") 
    && !word.endsWith("iy") && !word.endsWith("oy") && !word.endsWith("uy")) {
    return word.substring(0, word.length() - 1) + "ies"; 
    
           
    
    //Every other word add s at the end
            } else {
                return word + "s";

	}
		}
	}

	
