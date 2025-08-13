package com.kozao.model.access;

import java.sql.*;

import com.kozao.util.Constante;

public class ConnexionDB {
	
	private static Connection connection;

    public static Connection getConnection() {
    	
        if (connection == null) {
            
        	try {
        		
                Class.forName(Constante.DRIVER); 
                connection = DriverManager.getConnection(Constante.URL, Constante.USER, Constante.PASSWORD);
                
                // System.out.println("Connexion réussie à la base de données !!");
                
            } catch (ClassNotFoundException e) {
                System.out.println(Constante.JDBC_IS_NULL + e.getMessage());
                
            } catch (SQLException e) {
                System.out.println(Constante.CONNEXION_ERROR + e.getMessage());
            }
            
        }   
        
        return connection;
    }

}
