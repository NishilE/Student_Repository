/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OperationsPackage;

import DataPackage.StudentClass;
import DbConnectionPackage.DbConnectionClass;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Rishad Kavad
 */
public class StudentUpdateClass {
 DbConnectionClass connectionClass = new DbConnectionClass();//Database Connection class object initialization
    String query = "";
    Connection con;//Database Connection object declaration
    Statement statement;
    StudentClass studentClass;
    public StudentUpdateClass() {
        con = connectionClass.ConnectDB();
        studentClass = new StudentClass();
    }
    // Function to update student starts
    public void updateStudent(StudentClass studentClass){
         try {
          
             statement = con.createStatement();
            query = "update student_table set student_name='"+studentClass.getStudentName()+"', gender='"+studentClass.getStudentGender()+"', "
                    + "student_address='"+studentClass.getStudentAddress()+"', student_place='"+studentClass.getStudentPlace()+"',"
                    + " student_class='"+studentClass.getStudentClass()+"', student_division='"+studentClass.getStudentDivision()+"',"
                    + " student_pcnt="+studentClass.getStudentPercentage()+" where id="+studentClass.getRegN0()+";";
            
            statement.executeUpdate(query);
           
        } catch (SQLException ex) {
            Logger.getLogger(StudentRegisterClass.class.getName()).log(Level.SEVERE, null, ex);
        
        }
    }
    // Function to update student ends
    
}
