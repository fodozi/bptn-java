package com.bptn_28_jdbc;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        // Creating an instance of FeedAppClass
        FeedAppClass jdbc = new FeedAppClass();

        // Establishing a database connection
        Connection conn = jdbc.createConnection();

        // Inserting a new user into the User table
        jdbc.addUser(conn, "Ray", "Mist", "raymist", "18292831", "ray@mist.com", "Ray@22", true);

        // Close the database connection
        jdbc.closeConnection(conn);
    }
}