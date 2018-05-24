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
 * @author Rishad Kavad
 */
public class StandardsClass {
DbConnectionClass connectionClass = new DbConnectionClass();
    String query = "";
    Connection con;
    PreparedStatement  preparedStatement;
    ResultSet studentResultSet;
    public StandardsClass() {
        this.con = connectionClass.ConnectDB();
    }
    public ResultSet viewClasses(){
        try {
            query = "select * from class_table";
            preparedStatement = con.prepareStatement(query);
            studentResultSet = preparedStatement.executeQuery();
            
        } catch (SQLException ex) {
            Logger.getLogger(StudentViewClass.class.getName()).log(Level.SEVERE, null, ex);
        }
      return studentResultSet;  
    }
    
}
