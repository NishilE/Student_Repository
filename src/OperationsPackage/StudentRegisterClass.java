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
 * @author Nishil E
 */
public class StudentRegisterClass {
    DbConnectionClass connectionClass = new DbConnectionClass();//Database Connection class object initialization
    String query = "";
    Connection con;//Database Connection object declaration
    PreparedStatement  preparedStatement;
    StudentClass studentClass;
    public StudentRegisterClass() {   
        con = connectionClass.ConnectDB();
        studentClass = new StudentClass();
    }
    // Function to register student starts
    public void registerStudent(StudentClass studentClass){
        try {
            query = "insert into student_table values(?,?,?,?,?,?,?,?)";
            preparedStatement = con.prepareStatement(query);
            preparedStatement.setInt(1,studentClass.getRegN0());
            preparedStatement.setString(2,studentClass.getStudentName());
            preparedStatement.setString(3,studentClass.getStudentGender());
            preparedStatement.setString(4,studentClass.getStudentAddress());
            preparedStatement.setString(5,studentClass.getStudentPlace());
            preparedStatement.setString(6,studentClass.getStudentClass());
            preparedStatement.setString(7,studentClass.getStudentDivision());
            preparedStatement.setFloat(8,studentClass.getStudentPercentage());
            preparedStatement.executeUpdate();
   
        } catch (SQLException ex) {
            Logger.getLogger(StudentRegisterClass.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    // Function to register student ends
}
