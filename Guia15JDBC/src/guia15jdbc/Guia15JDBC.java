package guia15jdbc;

import java.sql.*;
//import javax.xml.bind.DatatypeConverter;
//import java.util.*;
import java.security.*;

public class Guia15JDBC {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/pruebajdbc";
    private static final String DB_USER = "usuariojdbc";
    private static final String DB_PASSWORD = "contrasena1234";

    public static void main(String[] args) throws NoSuchAlgorithmException, SQLException {

        Connection conn = null;

        conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);

        System.out.println("Conexion a base de datos exitosa");
        
        String query = "SELECT * FROM usuario";
        
        PreparedStatement statement = conn.prepareStatement(query);
        
        ResultSet resultset = statement.executeQuery();
        
        while (resultset.next()) {
            
            String codigo = resultset.getString("codigo");
            String nombre = resultset.getString("nombre");
            System.out.println("Codigo: " + codigo +"\nNombre: "+ nombre);
            
        }
    }
}
