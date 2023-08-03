package estancias.servicios;

import estancias.entidades.Casas;
import estancias.persistencia.CasasDAO;

public class CasasServicio {

    CasasDAO daoCasas = new CasasDAO();

//B.
    public void mostrarCasas() throws Exception {
        for (Casas lista : daoCasas.listaCasas()) {
            System.out.println(lista);
        }
    }

//    public void buscarCasas() throws SQLException {
//        ResultSet rs1 = daoCasas.select("SELECT * FROM casas WHERE fecha_desde = '2020-08-01' AND fecha_hasta = '2020-08-31' AND pais LIKE 'Reino Unido'");
//        while (rs1.next()) {
//            String id_casa = rs1.getString("id_casa");
//            String calle = rs1.getString("calle");
//            String numero = rs1.getString("numero");
//            String codigo_postal = rs1.getString("codigo_postal");
//            String ciudad = rs1.getString("ciudad");
//            String pais = rs1.getString("pais");
//            String fecha_desde = rs1.getString("fecha_desde");
//            String fecha_hasta = rs1.getString("fecha_hasta");
//            System.out.println("La casa n° " + id_casa + " ubicada en la calle " + calle + " n° " + numero + " en la ciudad de " + ciudad + ", " + pais + ", CP n° " + codigo_postal + ", está disponible desde " + fecha_desde + " hasta " + fecha_hasta);
//        }
//    }
//D.
    public void mostrarDisponibilidadXFechas() throws Exception {
        for (Casas lista : daoCasas.listaDisponibilidad()) {
            System.out.println(lista);
        }
    }

//    public void disponibilidadEspecifica() throws SQLException {
//        Scanner leer = new Scanner(System.in);
//        System.out.println("Ingrese las fechas de inicio y de fin de la estadía (AAAA-MM-DD)");
//        String fechaInicio = leer.next();
//        String fechaFin = leer.next();
//        ResultSet rs1 = daoCasas.select("SELECT * FROM casas WHERE fecha_desde <= '" + fechaInicio + "' AND fecha_hasta >= '" + fechaFin + "'");
//        while (rs1.next()) {
//            String precio_habitacion = rs1.getString("precio_habitacion");
//            String fecha_desde = rs1.getString("fecha_desde");
//            String fecha_hasta = rs1.getString("fecha_hasta");
//            String tipo_vivienda = rs1.getString("tipo_vivienda");
//            String ciudad = rs1.getString("ciudad");
//            String pais = rs1.getString("pais");
//            System.out.println("El/la " + tipo_vivienda + " ubicado/a en " + ciudad + ", " + pais + " está disponible desde el " + fecha_desde + " hasta el " + fecha_hasta + " con un costo de $" + precio_habitacion + "/día");
//        }
//    }
//G.
    public void verPrecioFinalCasasUK() throws Exception {
        for (Casas lista : daoCasas.listaPrecioFinalDeCasasEnUK()) {
            System.out.println(lista);
        }
    }

//    public void aumentoCasasEnUK() throws SQLException {
//        ResultSet rs1 = daoCasas.select("SELECT id_casa, calle, numero, codigo_postal, ciudad, pais, fecha_desde, fecha_hasta, tiempo_minimo, tiempo_maximo, tipo_vivienda, (precio_habitacion*1.05) AS Precio_Final FROM casas WHERE pais LIKE 'Reino Unido'");
//        while (rs1.next()) {
//            String id_casa = rs1.getString("id_casa");
//            String calle = rs1.getString("calle");
//            String numero = rs1.getString("numero");
//            String ciudad = rs1.getString("ciudad");
//            String pais = rs1.getString("pais");
//            String Precio_Final = rs1.getString("Precio_Final");
//            System.out.println("La casa n° " + id_casa + " ubicada en la calle " + calle + " n°" + numero + ", en " + ciudad + ", " + pais + " ha sufrido un aumento del 5% y su precio final es de £" + Precio_Final);
//        }
//    }
//H.
    public void contarCasasXPais() throws Exception {
        for (Casas lista : daoCasas.listaCantCasasXPais()) {
            System.out.println(lista);
        }
    }

//    public void contarCasasXPais() throws SQLException {
//        ResultSet rs1 = daoCasas.select("SELECT COUNT(id_casa) AS Cant_Casas, pais FROM casas GROUP BY pais");
//        while (rs1.next()) {
//            String Cant_Casas = rs1.getString("Cant_Casas");
//            String pais = rs1.getString("pais");
//            System.out.println(pais + " tiene " + Cant_Casas + " casa/s en total");
//        }
//    }
//I.
    public void verCasasLimpiasEnUK() throws Exception {
        for (Casas lista : daoCasas.listaCasasLimpiasEnUK()) {
            System.out.println(lista);
        }
    }

//    public void casasLimpiasEnUK() throws SQLException {
//        ResultSet rs1 = daoCasas.select("SELECT * FROM casas LEFT JOIN comentarios ON casas.id_casa = comentarios.id_casa WHERE pais = 'Reino Unido' AND comentario LIKE '%limpia%'");
//        while (rs1.next()) {
//            String id_casa = rs1.getString("id_casa");
//            String comentario = rs1.getString("comentario");
//            System.out.println("Un/a huesped de la casa n° " + id_casa + " comentó sobre su estadía: '" + comentario + "'");
//        }
//    }
}
