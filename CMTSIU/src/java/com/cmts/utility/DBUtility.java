/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cmts.utility;
import java.sql.Connection;
import java.sql.DriverManager;
public class DBUtility {
      public static Connection getConnection() {
          try  {
              Class.forName("com.mysql.jdbc.Driver");
              Connection connection = DriverManager.getConnection
                      ("jdbc:mysql://localhost:3307/cmts",
                      "root","prad");
              return connection;
          }
          catch(Exception ex) {
              System.out.println("Database.getConnection() Error -->" + ex.getMessage());
              return null;
          }
      }
 
       public static void close(Connection con) {
          try  {
              con.close();
          }
          catch(Exception ex) {
          }
      }
}
