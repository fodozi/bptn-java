package com.bptn.course_Week3_;


import java.util.ArrayList;

public class Test5ArrayList {
    public static String findLongest(ArrayList<String> list) {
        //code here

        // Initialize an empty string in place of the longest string
String longest = "";

// Loop through the ArrayList for longest string
for (String str : list) {
if (str.length() > longest.length()) {
longest = str;

}
}
return longest;

    }

    public static void main(String[] args) {
        //instantiate ArrayList and fill with Strings
        ArrayList<String> values = new ArrayList<String>();
        String[] words = {"singapore", "cattle", "metropolitan", "turnstile"};
        for (int i = 0; i < words.length; i ++) {
            values.add(words[i]);
        }
        System.out.println("Expected Result:\t metropolitan");
        System.out.println("Your Result:\t\t " + findLongest(values) );
        
    }
}
