package com.bptn.course_Week3_;

import java.util.HashMap;
import java.util.Map;
public class MapDemo {

    public static void main(String[] args) {

    //Creating a HashMap object called numbers
    HashMap<Integer, String> numbers = new HashMap<>();

    // Adding key-value pairs to the map using the put method

        numbers.put(1, "one");
        numbers.put(2, "two");
        numbers.put(3, "three");
        numbers.put(4, "four");
        numbers.put(5, "five");
        numbers.put(6, "six");
        numbers.put(7, "seven");
        numbers.put(8, "eight");
        numbers.put(9, "nine");
        numbers.put(10, "ten");

    // Print out the map generated in the previous step
    
    System.out.println("Initial Map:");
    for (Map.Entry<Integer, String> entry : numbers.entrySet()) {
    System.out.println(entry.getKey() + " : " + entry.getValue());
    }

    //Use the remove() method to remove the value whose key is 7

    numbers.remove(7);

    //Add another key-value pair for eleven: key:11, value:eleven.

    numbers.put(11, "eleven");

    // Print out the map to verify that the entry for 7 is now gone, and 11 has been added to the map.
     
     
     for (Map.Entry<Integer, String> entry : numbers.entrySet()) {
     System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}