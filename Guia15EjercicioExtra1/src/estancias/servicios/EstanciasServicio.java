package estancias.servicios;

import estancias.entidades.Estancias;
import estancias.persistencia.EstanciasDAO;
import java.sql.SQLException;

public class EstanciasServicio {

    EstanciasDAO daoEstancias = new EstanciasDAO();

//F.
    public void verEstanciasReservadas() throws Exception {
        for (Estancias lista : daoEstancias.listaReservas()) {
            System.out.println(lista);
        }
    }

//J.
    public void ingresarReservas() throws SQLException, ClassNotFoundException, Exception {
        for (Estancias lista : daoEstancias.insertarReservasDeEstancias()) {
            System.out.println(lista);
        }
    }

}
