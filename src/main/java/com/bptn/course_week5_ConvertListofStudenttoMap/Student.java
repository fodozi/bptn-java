package com.bptn.course_week5_ConvertListofStudenttoMap;

public class Student {

    // Create instance variables int id, String name, and int age
    private int id;
    private String name;
    private int age;

    //Define a constructor that takes three arguments (id, name, and age)
    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    //The getter methods which are implemented to make it possible for listtomap class to access the private instance variable from outside.
  
    // Define a getter method for the id field
    public int getId() {
        return id;
    } 
    // Define a getter method for the name field
    public String getName() {
        return name;
    }

   // Define a getter method for the age field
   public int getAge() {
        return age;
    } 
   
    //toString() method
    //The toString() is overridden from the object class and thereby deleting any hashcode that might be printed, thereby making the code readable.
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

