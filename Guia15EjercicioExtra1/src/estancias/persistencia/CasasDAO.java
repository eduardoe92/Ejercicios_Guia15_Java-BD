package estancias.persistencia;

import estancias.entidades.Casas;
import estancias.entidades.Comentarios;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public final class CasasDAO extends DAO {

//B.
    public Collection<Casas> listaCasas() throws Exception {
        try {
            String sql = "SELECT * FROM casas WHERE fecha_desde = '2020-08-01' AND fecha_hasta = '2020-08-31' AND pais LIKE 'Reino Unido'";
            consultarBase(sql);
            Casas casa = null;
            Collection<Casas> lista = new ArrayList<>();
            while (resultado.next()) {
                casa = new Casas();
                casa.setId(resultado.getInt(1));
                casa.setCalle(resultado.getString(2));
                casa.setAltura(resultado.getInt(3));
                casa.setCodigoPostal(resultado.getString(4));
                casa.setCiudad(resultado.getString(5));
                casa.setPais(resultado.getString(6));
                casa.setFechaDesde(resultado.getDate("fecha_desde"));
                casa.setFechaHasta(resultado.getDate("fecha_hasta"));
                casa.setTiempoMin(resultado.getInt("tiempo_minimo"));
                casa.setTiempoMax(resultado.getInt("tiempo_maximo"));
                casa.setPrecioHabitacion(resultado.getDouble("precio_habitacion"));
                casa.setTipoVivienda(resultado.getString("tipo_vivienda"));
                lista.add(casa);
            }
            desconectarBase();
            return lista;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error de Sistema");
        }
    }

//D.
    public Collection<Casas> listaDisponibilidad() throws Exception {
        try {
            Scanner leer = new Scanner(System.in);
            System.out.println("Ingrese las fechas de inicio y de fin de la estadía (AAAA-MM-DD)");
            String fechaInicio = leer.next();
            String fechaFin = leer.next();
            String sql = "SELECT * FROM casas WHERE fecha_desde <= '" + fechaInicio + "' AND fecha_hasta >= '" + fechaFin + "'";
            consultarBase(sql);
            Casas casa = null;
            Collection<Casas> lista = new ArrayList<>();
            while (resultado.next()) {
                casa = new Casas();
                casa.setId(resultado.getInt(1));
                casa.setCalle(resultado.getString(2));
                casa.setAltura(resultado.getInt(3));
                casa.setCodigoPostal(resultado.getString(4));
                casa.setCiudad(resultado.getString(5));
                casa.setPais(resultado.getString(6));
                casa.setFechaDesde(resultado.getDate("fecha_desde"));
                casa.setFechaHasta(resultado.getDate("fecha_hasta"));
                casa.setTiempoMin(resultado.getInt("tiempo_minimo"));
                casa.setTiempoMax(resultado.getInt("tiempo_maximo"));
                casa.setPrecioHabitacion(resultado.getDouble("precio_habitacion"));
                casa.setTipoVivienda(resultado.getString("tipo_vivienda"));

                lista.add(casa);
            }
            desconectarBase();
            return lista;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error de Sistema");
        }
    }

//G
    public Collection<Casas> listaPrecioFinalDeCasasEnUK() throws Exception {
        try {
            String sql = "SELECT id_casa, calle, numero, codigo_postal, ciudad, pais, fecha_desde, fecha_hasta, tiempo_minimo, tiempo_maximo, tipo_vivienda, (precio_habitacion*1.05) AS Precio_Final FROM casas WHERE pais LIKE 'Reino Unido'";
            consultarBase(sql);
            Casas casa = null;
            Collection<Casas> lista = new ArrayList<>();
            while (resultado.next()) {
                casa = new Casas();
                casa.setId(resultado.getInt(1));
                casa.setCalle(resultado.getString(2));
                casa.setAltura(resultado.getInt(3));
                casa.setCodigoPostal(resultado.getString(4));
                casa.setCiudad(resultado.getString(5));
                casa.setPais(resultado.getString(6));
                casa.setFechaDesde(resultado.getDate("fecha_desde"));
                casa.setFechaHasta(resultado.getDate("fecha_hasta"));
                casa.setTiempoMin(resultado.getInt("tiempo_minimo"));
                casa.setTiempoMax(resultado.getInt("tiempo_maximo"));
                casa.setTipoVivienda(resultado.getString("tipo_vivienda"));
                casa.setPrecioHabitacion(resultado.getDouble("Precio_Final"));
                lista.add(casa);
            }
            desconectarBase();
            return lista;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error de Sistema");
        }
    }

//H.
    public Collection<Casas> listaCantCasasXPais() throws Exception {
        try {
            String sql = "SELECT COUNT(id_casa) AS Cant_Casas, pais FROM casas GROUP BY pais";
            consultarBase(sql);
            Casas casa = null;
            Collection<Casas> lista = new ArrayList<>();
            while (resultado.next()) {
                casa = new Casas();
                casa.setId(resultado.getInt("Cant_Casas"));
                casa.setPais(resultado.getString(2));
                lista.add(casa);
            }
            desconectarBase();
            return lista;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error de Sistema");
        }
    }

//I.
    public Collection<Casas> listaCasasLimpiasEnUK() throws Exception {
        try {
            String sql = "SELECT * FROM casas LEFT JOIN comentarios ON casas.id_casa = comentarios.id_casa WHERE pais = 'Reino Unido' AND comentario LIKE '%limpia%'";
            consultarBase(sql);
            Casas casa = null;
            Comentarios comentarios = null;
            Collection<Casas> lista1 = new ArrayList<>();
            Collection<Comentarios> lista2 = new ArrayList<>();
            while (resultado.next()) {
                casa = new Casas();
                comentarios = new Comentarios();
                casa.setId(resultado.getInt(1));
                casa.setCalle(resultado.getString(2));
                casa.setAltura(resultado.getInt(3));
                casa.setCodigoPostal(resultado.getString(4));
                casa.setCiudad(resultado.getString(5));
                casa.setPais(resultado.getString(6));
                casa.setFechaDesde(resultado.getDate("fecha_desde"));
                casa.setFechaHasta(resultado.getDate("fecha_hasta"));
                casa.setTiempoMin(resultado.getInt("tiempo_minimo"));
                casa.setTiempoMax(resultado.getInt("tiempo_maximo"));
                casa.setPrecioHabitacion(resultado.getDouble("precio_habitacion"));
                casa.setTipoVivienda(resultado.getString("tipo_vivienda"));
                comentarios.setIdComentario(resultado.getInt(13));
                comentarios.setComentario(resultado.getString(14));
                lista1.add(casa);
                lista2.add(comentarios);
            }
            desconectarBase();
            return lista1;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error de Sistema");
        }
    }

}
