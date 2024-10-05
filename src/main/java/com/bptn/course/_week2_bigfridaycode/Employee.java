package com.bptn.course._week2_bigfridaycode;

public class Employee {
	
	// Private instance variables
    private int salary;
    private int hoursPerDay;

    // Constructor to set the initial salary and hoursPerDay
    public Employee(int salary, int hoursPerDay) {
    	
    	// setSalary method
        setSalary(salary);        
        
      //setHoursPerDay method
        setHoursPerDay(hoursPerDay); 
    }

    // Method to set the salary conditions
    public void setSalary(int salary) {
     
    // Increase by 10 if salary is less than 500
        if (salary < 500) {
            this.salary = salary + 10;  

    // No change if salary is 500 or more
        } else {
            this.salary = salary;  
        }
    }

	

 // Method to update the hoursPerDay conditions for salary adjustment
    public void setHoursPerDay(int hoursPerDay) {
        this.hoursPerDay = hoursPerDay;
        if (hoursPerDay > 6) {

      // Increase salary by 5 if hours worked per day is greater than 6
            this.salary += 5;  
        }
    }

    // Method to update salary
    public int getSalary() {
        return this.salary;
    }

    // Main method to create an Employee object and print the salary
    public static void main(String[] args) {

        Employee employee = new Employee(100, 8);

        // Print the salary of the employee
        System.out.println(employee.getSalary());  
    }
}
