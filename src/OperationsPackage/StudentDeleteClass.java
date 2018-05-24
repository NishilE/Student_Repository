/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OperationsPackage;

import DataPackage.StudentClass;
import DbConnectionPackage.DbConnectionClass;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rishad Kavad
 */
public class StudentDeleteClass {
 DbConnectionClass connectionClass = new DbConnectionClass(); //Database Connection class object initialization
    String query = "";
    Connection con;//Database Connection object declaration
    PreparedStatement  preparedStatement;
    public StudentDeleteClass() {
        con = connectionClass.ConnectDB();
    }
    // Function to delete student details starts
    public void deleteStudent(int id){
        try {
            query = "delete from student_table where id = ?";
            preparedStatement = con.prepareStatement(query);
            
            preparedStatement.setFloat(1,id);
            preparedStatement.executeUpdate();
   
        } catch (SQLException ex) {
            Logger.getLogger(StudentRegisterClass.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    // Function to delete student details ends
}
