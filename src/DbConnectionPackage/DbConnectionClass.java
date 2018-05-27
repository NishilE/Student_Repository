/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DbConnectionPackage;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Nishil E
 */
public class DbConnectionClass {
    public Connection ConnectDB(){
        Connection c = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
              c = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_repository","root","");
        
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
        return c;
    }
}
