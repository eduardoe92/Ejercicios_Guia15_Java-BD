package tienda.servicios;

import java.sql.ResultSet;
import java.sql.SQLException;
import tienda.entidades.Fabricante;
import tienda.persistencia.FabricanteDAO;

public class FabricanteServicio {

    FabricanteDAO daofabr = new FabricanteDAO();

    public void consultarFabricante() throws SQLException {
        ResultSet rs1 = daofabr.select("SELECT nombre FROM fabricante");
        while (rs1.next()) {
            String nombre = rs1.getString("nombre");
            System.out.println("El fabricante " + nombre);
        }
    }

    //G.
    public void ingresarFabricante() throws SQLException {
        Fabricante fabricante1 = new Fabricante(10, "Acer");
        daofabr.calito(fabricante1);
    }

}
