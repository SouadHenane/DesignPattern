/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author User
 */
public class Connecter{

    /**
     *
     */
    public static Connection con;

    /**
     *
     */
    public Connecter(){
  
   try{

     Class.forName("com.mysql.jdbc.Driver");

    }catch(ClassNotFoundException e){
     
     System.err.println(e);

   }


   try{
      
    con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bd","root","");
    System.out.println("création d'une connection");
    }catch(SQLException e){ System.err.println(e);}
}

    /**
     *
     * @return
     */
    public static Connection obtenirconnexion(){return con;}
}

