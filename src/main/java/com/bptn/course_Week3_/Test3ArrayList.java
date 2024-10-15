package com.bptn.course_Week3_;

import java.util.ArrayList;

public class Test3ArrayList {
    public static int sumNegValues(ArrayList<Integer> list) {
        //code here
        int sum = 0;

        //Using a for each loop to go through the elements checking for negative elements
        for (Integer num : list) {

            // check for negative values
        if (num < 0) {

            //sum the negative values
            sum+= num;

            
        }
        }
        return sum;
    }
        
    
    

    public static void main(String[] args) {
        //instantiate ArrayList and fill with Integers
        ArrayList<Integer> values = new ArrayList<Integer>();
        int[] nums = {-2, 34, -11, 9, -6, 3};
        for (int i = 0; i < nums.length; i ++) {
            values.add(nums[i]);
        }
        System.out.println("Expected Result:\t -19");
        System.out.print("Your Result:\t\t ");
        System.out.println(sumNegValues(values));
    }
}
