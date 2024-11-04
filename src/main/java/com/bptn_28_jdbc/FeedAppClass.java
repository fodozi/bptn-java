package com.bptn_28_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class FeedAppClass {

    // Database connection info
    private static final String userName = "";
    private static final String password = "";
    private static final String dbName = "";
    private static final String port = "";
    private static final String dbUrl = "";

    // Method to establishing connection to database
    public Connection createConnection() {
        Connection conn = null;
        try {
            conn = DriverManager.getConnection(dbUrl, userName, password);
            System.out.println("Opened database successfully");
        } catch (SQLException e) {
            System.out.println(e.getClass().getName() + ": " + e.getMessage());
            System.exit(0);
        }
        return conn;
    }

    // Method to insert data into the User table
    public void addUser(Connection conn, String firstName, String lastName, String username, String phone, String emailId, String password, boolean emailVerified) {
        PreparedStatement stmt = null;
        try {
            String sql = "INSERT INTO \"User\" (\"firstName\", \"lastName\", \"username\", \"phone\", \"emailId\", \"password\", \"emailVerified\", \"createdOn\") VALUES (?, ?, ?, ?, ?, ?, ?, CURRENT_TIMESTAMP)";
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, firstName);
            stmt.setString(2, lastName);
            stmt.setString(3, username);
            stmt.setString(4, phone);
            stmt.setString(5, emailId);
            stmt.setString(6, password);
            stmt.setBoolean(7, emailVerified);

            int resultCount = stmt.executeUpdate();
            System.out.println(resultCount + " record(s) inserted");
        } catch (SQLException ex) {
        	//Exception Handling
            System.out.println("Exception: " + ex.getMessage());
        }
    }

    public void closeConnection(Connection conn) {
    boolean flag = true;

    try{
    conn.close();
    }catch(SQLException ex){
    flag = false;
    // handle exception

    System.out.println("Exception:" + ex.getMessage());
    }
    }
   }
