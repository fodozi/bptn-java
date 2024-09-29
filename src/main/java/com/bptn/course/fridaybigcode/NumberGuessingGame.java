package com.bptn.course.fridaybigcode;
import java.util.Scanner;

public class NumberGuessingGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		
		// Initiating target number	
		int targetNumber = 23;
		
		//Variable for user guessing input
		int guess = 0;

		 // Welcome String
		 System.out.println("Guess a Number between 1 to 100");
		 
		 //Loop until user matches the targetNumber
		 while (guess != targetNumber) {
	            System.out.print("Enter your guess: ");
	            guess = sc.nextInt();
	            
	     // Out-of-range guess
	            if (guess < 1 || guess > 100) {
	                System.out.println("Please enter a number between 1 and 100.");
	                
	     // Guess is too low
	            } else if (guess < targetNumber) {
	                System.out.println("Too low! Try again.");
	                
	     // Guess is too high
	            } else if (guess > targetNumber) {                
	                System.out.println("Too high! Try again.");
	                
	     // Any other Guess will be the Correct guess
	            } else {
	                System.out.println("Congratulations! You guessed the number correctly.");
	            }
	        }
	        sc.close();

	}

}
            //Issues I ran into and what to remember in the future.
//While creating the loop, I just jumped into starting the if loop condition without creating a while condition line
//that starts the loop and prints "enter your guess: ") whenever the guess is not equal to the target number.