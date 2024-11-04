package com.bptn_28_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.bptn.bean.Student;

public class _01_StmtSelect {

	public static void main(String[] args) {
	String dbURL = "";	
	String dbUsername = "";
	String dbPassword = "";
	
	List<Student> students = new ArrayList<>();
	
	String sql = "SELECT * FROM students ORDER BY \"studentId\"";
	
	// Try with resources, resources are automatically closed
	try(Connection con = DriverManager.getConnection(dbURL, dbUsername, dbPassword);
		    Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
		    ) {
		while (rs.next()) {
			int studentId = rs.getInt("studentId");
			int courseId = rs.getInt("courseId");
			String studentName = rs.getString("studentName");
//			System.out.println("The student name is: " + studentName);
			
			String studentEmail = rs.getString("studentEmail");
			String studentPhone = rs.getString("studentPhone");
			
			Student student = new Student();
			
			student.setStudentId(studentId);
			student.setCourseId(courseId);
			student.setStudentName(studentName);
			student.setStudentEmail(studentEmail);
			student.setStudentPhone(studentPhone);
			
			students.add(student);
		}
		
		students.forEach(System.out::println);
		
		
		
	} catch (SQLException e) {
		    e.printStackTrace();
	}
	
	}

}
