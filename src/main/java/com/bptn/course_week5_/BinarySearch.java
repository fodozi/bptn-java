package com.bptn.course_week5_;

import java.util.Arrays;

public class BinarySearch {

	// Binary search method that takes an unsorted array and a key element to search for
	public static int binarySearch(int[] arr, int key) {
		// Sort the array before applying binary search
		// Sorting the array helps to ensure that the binary search will search accurately, if not it will not find the correct element.
		Arrays.sort(arr);
		
		// Initialize low and high pointers for the start and end of the array respectively
		// from my understanding low pointers are the least idex starting the array, while high pointers ends it
	  int low = 0;
    int high = arr.length - 1;

		// Keep looping until the high pointer is greater than or equal to the low pointer
	//The low and high pointers help specify the current range within the array. Thereby ensuring the loop continues to run as long as the search range continues to be maintained.
		while (low <= high) {
			// Calculate the middle index
	// Dividing the search range by 2 helps the binary search algorithm to know which half to search next.
			int mid = (low + high) / 2;
			
			// If the element at the middle index is equal to the key, return the index
			if (arr[mid] == key) {
				return mid;
				
			}
			// If the element at the middle index is less than the key, move the low pointer to the middle + 1
	// This helps to move the element to the other half of the range if the element is initially less than the key.
			else if (arr[mid] < key) {
				low = mid + 1;
			}
			// If the element at the middle index is greater than the key, move the high pointer to the middle - 1
	//Basically, we are trying to move the element backward to the lower half if the middle index is greater than the key.
			else {
				high = mid - 1;
			}
		}
		// If the key is not found, return -1
		return -1;
	}

    //Do not modify the code below
	public static void main(String[] args) {

		// Create an Array of integers
		int[] arr = { 64, 34, 25, 12, 22, 11, 90 };
		// Key to be searched for:
		int key = 22;

		// Perform binary search on the Array
		int result = binarySearch(arr, key);

		// Print the result
		if (result == -1) {
			System.out.println("Element not found in the array");
		} else {
			System.out.println("Element found at index " + result);
		}
	}
}

// What was new to me on this task was dividing the search range into 2 halves in oder for the binary search algorithm to be efficient.
//In the future, I will always remember to sort the array first before carrying out a binary search.