package tienda.persistencia;

import java.sql.ResultSet;
import java.sql.SQLException;
import tienda.entidades.Fabricante;

public final class FabricanteDAO extends DAO {

    public ResultSet select(String query) throws SQLException {
        ResultSet resultset = super.sqlAccess(query);
        return resultset;
    }

    public void calito(Fabricante f1) throws SQLException {
        String query = "INSERT INTO fabricante VALUES(" + " '" + f1.getCodigo() + "', '" + f1.getNombre() + "' " + ")";
        super.sqlAccess2(query);
    }
    
}
