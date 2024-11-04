package com.bptn.course_week5_ConvertListofStudenttoMap;

//Import all necessary packages here
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.stream.Collectors;
public class ListToMap {

 // create static method "convertStudentListToMap"
 //In this method we Convert a list of "Student" objects into a map where the keys are the student IDs and the values are the corresponding "Student" objects.

public static Map<Integer, Student> convertStudentListToMap(List<Student> students) {
     // Convert the List to a Map
     Map<Integer, Student> studentMap = students.stream()
             .collect(Collectors.toMap(Student::getId, student -> student));

     return studentMap;
 }


 // Complete the main method
 public static void main(String[] args) {

     // Create a list of students
 List<Student> students = new ArrayList<>();    
     
     //add student objects to this list
     students.add(new Student(1, "Alice", 20));
     students.add(new Student(2, "Bob", 22));
     students.add(new Student(3, "Charlie", 21)); 

     // Call "convertStudentListToMap" method and hold the returned value in "studentMap" variable.
    // Here the convertSttudentListToMap method call is stored in the studentMap variable, thereby making the result reusable later in the program for printing.

    Map<Integer, Student> studentMap = convertStudentListToMap(students);

     // Print the map
     System.out.println("Students Map: "+ studentMap);
 }
}

//Summary, what was new for me is converting studentlist to a map.
//An issue i ran into was how to structure the body of the convertStudentListToMap method.
//What i will like to remember in the future is to store a method in a variable in order to use it later on in your program.