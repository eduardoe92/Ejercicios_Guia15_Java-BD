package tienda.persistencia;

import java.sql.ResultSet;
import java.sql.SQLException;
import tienda.entidades.Producto;

public final class ProductoDAO extends DAO {

    public ResultSet select(String query) throws SQLException {
        ResultSet resultset = super.sqlAccess(query);
        return resultset;
    }

    public void manolito(Producto p1) throws SQLException {
        String query = "INSERT INTO producto VALUES(" + " '" + p1.getCodigo() + "', '" + p1.getNombre() + "', '" + p1.getPrecio() + "', '" + p1.getCodigoFabricante() + "' " + ")";
        super.sqlAccess2(query);
    }

    public void modificarProd(Producto p1) throws SQLException {
        String query2 = "UPDATE producto SET nombre = '" + p1.getNombre() + "', precio = " + p1.getPrecio() + ", codigo_fabricante = " + p1.getCodigoFabricante() + " WHERE codigo = " + p1.getCodigo() + ";";
        super.sqlAccess2(query2);
    }

}
