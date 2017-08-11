package com.oracle.consultas.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Dao {

    // Son privados por encapsulación. Así protejemos nuestros datos.
    private Connection connection;

    public Connection getConnection() {
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }
    
    // metodo para conectar
    public void conectar() {
        
        String url = "jdbc:derby://localhost:1527/";
        String dbName = "Consultas";
        String driver = "org.apache.derby.jdbc.ClientDriver";
        String userName = "root";
        String password = "root";
            
        // Excepción
        try {    
            Class.forName( driver ).newInstance();
            connection = DriverManager.getConnection( url + dbName, userName, password );
            System.out.println( "Conexion Exitosa" );
        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | SQLException ex) {
            if( ex instanceof SQLException ){
                Logger.getLogger(Dao.class.getName()).log(Level.SEVERE, null, ex);
            } else if( ex instanceof InstantiationException ){
                
            } else if( ex instanceof IllegalAccessException ){
                
            } else{
                
            }
        } 
       
    }
    
    public void cerrarConexion() {
        try{
            if ( connection != null ){
                if ( !connection.isClosed() ){
                    connection.close();
                }
            }
        } catch( Exception e ){
            e.printStackTrace();
        }
    }
    
    
}
