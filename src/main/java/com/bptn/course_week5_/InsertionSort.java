package com.bptn.course_week5_;

public class InsertionSort {
    // This method sorts an array in ascending order using insertion sort algorithm
    public static void insertionSort(int[] arr) {
    	
    	// Check if the array is null or has less than 1 element
      //This checks if arr is null or less than 1, which means it is empty. 
      //If either of these conditions is true the "return" statement exits the method.
      
        if (arr == null || arr.length < 1) {
            // Return if the array is null or has less than 1 element
          return;  
        }
        // Loop through the array starting from index 1 to length of the array
        //Meaning the loop will run as long as "i" is less than the length of the array.
        //and increases by 1 while running
        for (int i = 1; i < arr.length; i++) {
            // Store the current element
      // the current variable will be used to compare and insert the current element into its correct position in the sorted array.
            int current = arr[i];
            // Initialize j with i - 1
      // The variable "j" will traverse the sorted array backwards to find the correct position for the "current" element.
            int j = i - 1;

      // Inner loop to compare current element with elements before it in the array
      // The loop will continue as long as the two conditions "j >=0" & "current < arr[j];

            while (j >= 0 && current < arr[j]) {
                // Shift the element to the right
              arr[j + 1] = arr[j];
                // Decrement j to compare with next element
          //Decrement j-- allows the loop to compare the "current" element with the next element to the left in the array.
               j--;
            }
            // Insert the current element at its correct position
        //By setting "arr[j + 1]" to "current", the "current" element is placed in its correct position within the sorted portion of the array.    
            arr[j + 1] = current;
        }

    }
  //Do not modify below code
    public static void main(String[] args) {
        // Initialize the array
        int[] arr = {3, 4, 1, -2, 4, 8};
        // Call the sort method to sort the array
        insertionSort(arr);
        // Print the sorted array
        System.out.print("Sorted array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

//Summary, what was new to me was checking the array elements with null or <1 to see if the array is empty. 
// Insert the current element at its correct position, was also new for me kind of.
//What i will remember in the future is to always check the array if its empty or null before working with it.
