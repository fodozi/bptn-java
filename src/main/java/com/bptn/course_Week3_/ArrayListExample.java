package com.bptn.course_Week3_;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		
		ArrayList <Integer> arrayListExample = new ArrayList(3);
		
		arrayListExample.add(10);
		
		arrayListExample.add(20);
		
		arrayListExample.add(30);
		
		arrayListExample.add(40);
		
		arrayListExample.set(2, 35);
		
		arrayListExample.remove(1);
		
		for (Integer number : arrayListExample) {
			System.out.println(number);
			}
		

	}

}
