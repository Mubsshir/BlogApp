package com.example.controller;

/**
 *
 * @author Mubasshir
 */

import java.sql.*;

public class DataTransaction {

        // Read database credentials from environment variables
        static final String DBURL = System.getenv("DBURL");
        static final String DBUSER = System.getenv("DBUSER");
        static final String DBPASS = System.getenv("DB_PASS");

        public static Connection getDBConnection(){
          System.out.println(DBPASS);
            try{
                 Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            }
            catch(ClassNotFoundException cnfe){
                System.out.println("Driver not found: "+cnfe.getMessage());
                return null;
            }
            try(Connection conn=DriverManager.getConnection(DBURL, DBUSER, DBPASS) ){
                if(conn!=null){
                    System.out.println("Connection Successfull");
                     return  conn;
                }
               return null;
            }
            catch(SQLException sqlex){
                System.out.println("Connection failed: "+sqlex.getMessage());
                return null;}
        }


}
