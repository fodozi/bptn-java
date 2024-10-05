package com.bptn.course._02_teachback;

//Parent class: Person
public class Person {

//Declare instance variables
private String name;
private int age;


//Constructor
public Person(String name, int age) {
this.name = name;
this.age = age;

}


//Getters and setters
public String getName() {
return name;
}


public void setName(String name) {
this.name = name;
}


public int getAge() {
return age;
}


public void setAge(int age) {
this.age = age;
}


public void displayInfo() {
System.out.println("Name: " + name);
System.out.println("Age: " + age);

}



 

    public static void main(String[] args) {

        // Create a Teacher object
        Teacher teacher = new Teacher("Ms. Smith", 35, "Mathematics", 50000);
        teacher.displayInfo();  // Display Teacher information

    }


}


