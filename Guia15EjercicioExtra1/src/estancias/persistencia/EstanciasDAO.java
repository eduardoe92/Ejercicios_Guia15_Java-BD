package estancias.persistencia;

import estancias.entidades.Clientes;
import estancias.entidades.Estancias;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public final class EstanciasDAO extends DAO {

    public ResultSet select(String query) throws SQLException {
        ResultSet resultset = super.sqlAccess(query);
        return resultset;
    }

//F.
    public Collection<Estancias> listaReservas() throws Exception {
        try {
            String query = "SELECT id_estancia, nombre_huesped, ciudad, pais FROM estancias INNER JOIN clientes ON estancias.id_cliente = clientes.id_cliente WHERE estancias.nombre_huesped = clientes.nombre";
            consultarBase(query);
            Estancias estancias = null;
            Clientes clientes = null;
            Collection<Estancias> lista1 = new ArrayList<>();
            Collection<Clientes> lista2 = new ArrayList<>();
            while (resultado.next()) {
                clientes = new Clientes();
                estancias = new Estancias();
                estancias.setIdEstancia(resultado.getInt(1));
                estancias.setNombreHuesped(resultado.getString(2));
                clientes.setCiudad(resultado.getString(3));
                clientes.setPais(resultado.getString(4));
                lista1.add(estancias);
                lista2.add(clientes);
            }
            desconectarBase();
            return lista1;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error de Sistema");
        }
    }

    /*for (Map<String, Object> mapa : lista_mapas){ // recorrer cada fila de la tabla respuesta
        for (Map.Entry<String, Object> entry : mapa.entrySet()) { // recorrer cada columna de la tabla
                    String llave = entry.getKey();    // nombre de la columna 
                    Object valor = entry.getValue(); // valor de la columna
                    System.out.println(llave + " - " + valor);
                }
        }*/
    
//J.
    public Collection<Estancias> insertarReservasDeEstancias() throws Exception {
        try {
            String query = "INSERT INTO estancias VALUES( 'id_estancia', 'id_cliente', 'id_casa', 'nombre_huesped', 'fecha_desde', 'fecha_hasta')";
            consultarBase(query);
            Estancias estancias = null;
            Collection<Estancias> lista = new ArrayList<>();
            while (resultado.next()) {
                estancias.setIdEstancia(9);
                estancias.setIdCliente(8);
                estancias.setIdCasa(8);
                estancias.setNombreHuesped("Andrés Cannoli");
                int diaInicio1 = 1;
                int mesInicio1 = 9;
                int anioInicio1 = 2023;
                Date fechaInicio1 = new Date(anioInicio1, mesInicio1, diaInicio1);
                estancias.setFechaDesde(fechaInicio1);
                int diaFin1 = 30;
                int mesFin1 = 9;
                int anioFin1 = 2023;
                Date fechaFin1 = new Date(anioFin1, mesFin1, diaFin1);
                estancias.setFechaHasta(fechaFin1);
                estancias.setIdEstancia(10);
                estancias.setIdCliente(9);
                estancias.setIdCasa(5);
                estancias.setNombreHuesped("Ángeles Yardman");
                int diaInicio2 = 15;
                int mesInicio2 = 9;
                int anioInicio2 = 2023;
                Date fechaInicio2 = new Date(anioInicio2, mesInicio2, diaInicio2);
                estancias.setFechaDesde(fechaInicio2);
                int diaFin2 = 31;
                int mesFin2 = 10;
                int anioFin2 = 2023;
                Date fechaFin2 = new Date(anioFin2, mesFin2, diaFin2);
                estancias.setFechaHasta(fechaFin2);
                lista.add(estancias);
            }
            desconectarBase();
            return lista;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error de Sistema");
        }
    }

}
