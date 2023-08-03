package tienda.persistencia;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public abstract class DAO {

    protected Connection conexion = null;
    protected ResultSet resultado = null;
    protected Statement sentencia = null;
    private final String DB_URL = "jdbc:mysql://localhost:3306/tienda?useSSL=false";
    private final String DB_USER = "root";
    private final String DB_PASSWORD = "root";

    public DAO() {

    }

    public ResultSet sqlAccess(String query) throws SQLException {
        conexion = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
        PreparedStatement statement = conexion.prepareStatement(query);
        ResultSet resultset = statement.executeQuery();
        return resultset;
    }

    public void sqlAccess2(String query) throws SQLException {
        sentencia = conexion.createStatement();
        sentencia.executeUpdate(query);
    }

}
