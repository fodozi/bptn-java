package com.bptn.course_Week3_;

//Import the HashMap class
import java.util.HashMap;

public class HashMapDemo {

 public static void main(String[] args) {

//Creating Hashmap Object

HashMap<String, Integer> people = new HashMap<>();

//Add key-key value pairs
 
 people.put("Angie", 33);
 people.put("Steve", 30);
 people.put("John", 32);

// Using a for loop to print out the key value pairs

 for (String name : people.keySet()) {

// Using keySet() method, to return key objects

 Integer age = people.get(name);
         System.out.println("Name: " + name + ", Age: " + age);
     }

 }
}
