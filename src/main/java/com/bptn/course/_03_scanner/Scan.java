package com.bptn.course._03_scanner;

import java.util.Scanner;

public class Scan {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter an Integer:");
		int num = scan.nextInt();
		scan.nextLine();

		System.out.println("Please enter an String:");
		String str = scan.nextLine();

		System.out.println("Num is: " + num);
		System.out.println("Str is: " + str);

		scan.close();

	}

}




