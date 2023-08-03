package estancias.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class DAO {

    protected Connection conexion;
    protected ResultSet resultado;
    protected Statement sentencia;
    private final String DATABASE = "estancias_exterior";
    private final String USER = "root";
    private final String PASSWORD = "root";
    private final String DRIVER = "com.mysql.jdbc.Driver";

    public DAO() {

    }

    public ResultSet sqlAccess(String query) throws SQLException {
        PreparedStatement statement = conexion.prepareStatement(query);
        return statement.executeQuery();
    }

    protected void conectarBase() throws SQLException, ClassNotFoundException {
        try {
            Class.forName(DRIVER);
            String URL = "jdbc:mysql://localhost:3306/" + DATABASE + "?useSSL=false";
            conexion = DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            throw e;
        }
    }

    protected void desconectarBase() throws SQLException {
        try {
            if (resultado != null) {
                resultado.close();
            }
            if (sentencia != null) {
                sentencia.close();
            }
            if (conexion != null) {
                conexion.close();
            }
        } catch (SQLException e) {
            throw e;
        }
    }

    protected void insertarModificarEliminar(String query) throws SQLException, ClassNotFoundException {
        try {
            conectarBase();
            sentencia = conexion.createStatement();
            sentencia.executeUpdate(query);
        } catch (SQLException e) {
//            conexion.rollback();
            throw e;
        } finally {
            desconectarBase();
        }
    }

    protected void consultarBase(String query) throws SQLException, ClassNotFoundException {
        try {
            conectarBase();
            sentencia = conexion.createStatement();
            resultado = sentencia.executeQuery(query);
        } catch (SQLException e) {
            throw e;
        }
    }

}
