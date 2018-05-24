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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rishad Kavad
 */
public class StudentViewClass {
    DbConnectionClass connectionClass = new DbConnectionClass();
    String query = "";
    Connection con;
    PreparedStatement  preparedStatement;
    StudentClass studentClass;
    ResultSet studentResultSet;
  
    public StudentViewClass() {
        con = connectionClass.ConnectDB();
        studentClass = new StudentClass();
        
    }
    public ResultSet viewStudents(){
        try {
            query = "select * from student_table";
            preparedStatement = con.prepareStatement(query);
            studentResultSet = preparedStatement.executeQuery();
            
        } catch (SQLException ex) {
            Logger.getLogger(StudentViewClass.class.getName()).log(Level.SEVERE, null, ex);
        }
      return studentResultSet;  
    }
    public StudentClass viewStudent(int id){
        try {
            studentClass = new StudentClass();                 
            query = "select * from student_table where id = ?";
            preparedStatement = con.prepareStatement(query);
            preparedStatement.setInt(1, id);
            studentResultSet = preparedStatement.executeQuery();
            if(studentResultSet.next()){
                studentClass.setStudentName(studentResultSet.getString("student_name"));
                studentClass.setStudentGender(studentResultSet.getString("gender"));
                studentClass.setStudentAddress(studentResultSet.getString("student_address"));
                studentClass.setStudentPlace(studentResultSet.getString("student_place"));
                studentClass.setStudentClass(studentResultSet.getString("student_class"));
                studentClass.setStudentDivision(studentResultSet.getString("student_division"));
                studentClass.setStudentPercentage(studentResultSet.getFloat("student_pcnt"));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(StudentViewClass.class.getName()).log(Level.SEVERE, null, ex);
        }
      return studentClass;  
    }
}
