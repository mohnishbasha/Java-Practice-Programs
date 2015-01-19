package com.tests;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//import com.


/**
 *
 * @author mohnish
 */
public class FirstJdbc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Connection con = null;

        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/","root", "master");

            if (!con.isClosed()) {
                System.out.println("Successfully connected to " +  "MySQL server using TCP/IP...");
            }
        } catch (Exception e) {
            System.err.println("Exception: " + e.getMessage());
        } finally {
            try {
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
            }
        }
    }
}
