package tienda.persistencia;

import java.sql.*;

public abstract class DAO {

    protected Connection conexion;
    protected ResultSet resultado;
    protected Statement sentencia;    
    private final String USER = "root";
    private final String PASSWORD = "root";
    private final String DATABASE = "tienda";
    private final String URL = "jdbc:mysql://localhost:3306/" + DATABASE /*+ "?useSSL=false"*/;
    //private final String DRIVER = "com.mysql.cj.jdbc.Driver";

    protected void conectarBase() throws SQLException {       
            conexion = DriverManager.getConnection(URL, USER, PASSWORD);        
    }

    protected void desconectarBase() throws SQLException {
            if (resultado != null) {
                resultado.close();
            }
            if (sentencia != null) {
                sentencia.close();
            }
            if (conexion != null) {
                conexion.close();
            }
    }

    protected void insertarModificarEliminar(String sql) throws SQLException {
        try {
            conectarBase();
            sentencia = conexion.createStatement();
            sentencia.executeUpdate(sql);
        } catch (SQLException ex) {
            //conexion.rollback();
            throw ex;
        } finally {
            desconectarBase();
        }
    }

    protected void consultarBase(String sql) throws SQLException {        
            conectarBase();
            sentencia = conexion.createStatement();
            resultado = sentencia.executeQuery(sql);        
    }
}
