/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OperationsPackage;

import DbConnectionPackage.DbConnectionClass;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nishil E
 */
public class DivisionClass {
   
   DbConnectionClass connectionClass = new DbConnectionClass(); //Database Connection class object initialization
    String query = "";
    Connection con; //Database Connection object declaration
    PreparedStatement  preparedStatement;
    ResultSet studentResultSet;
    public DivisionClass() {
        this.con = connectionClass.ConnectDB();
    }
     // Function for view divisions starts
       public ResultSet viewDivisions(){
        try {
            query = "select * from division_table";
            preparedStatement = con.prepareStatement(query);
            studentResultSet = preparedStatement.executeQuery();
            
        } catch (SQLException ex) {
            Logger.getLogger(StudentViewClass.class.getName()).log(Level.SEVERE, null, ex);
        }
      return studentResultSet;  
    }
       // Function for view divisions ends
}
