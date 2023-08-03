package estancias;

import estancias.servicios.CasasServicio;
import estancias.servicios.ComentariosServicio;
import estancias.servicios.EstanciasServicio;
import estancias.servicios.FamiliasServicio;
import java.sql.SQLException;
import java.util.Scanner;

public class Estancias {

    public static void main(String[] args) throws SQLException, ClassNotFoundException, Exception {
        CasasServicio casasServ = new CasasServicio();
        ComentariosServicio comentariosServ = new ComentariosServicio();
        EstanciasServicio estanciasServ = new EstanciasServicio();
        FamiliasServicio familiasServ = new FamiliasServicio();
        Scanner leer = new Scanner(System.in);
        int opc;
        do {
            System.out.println("Ingrese una opción:\n1 - Consultar Familias de 3 Hijos\n2 - Consultar Disponibilidad de Casas en Reino Unido para Agosto\n3 - Buscar Email\n4 - Consultar Disponibilidad Específica\n5 - Mostrar Calificaciones por Comentarios\n6 - Mostrar Estancias Reservadas\n7 - Mostrar Precios de las Casas en Reino Unido\n8 - Mostrar la Cantidad de Casas por País\n9 - Mostrar Casas Limpias en Reino Unido\n10 - Ingresar Clientes que Reservan Estancias según Disponibilidad\n11 - Salir");
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    familiasServ.mostrarFamilias();
                    System.out.println("");
                    break;
                case 2:
                    casasServ.mostrarCasas();
                    System.out.println("");
                    break;
                case 3:
                    familiasServ.mostrarEmail();
                    System.out.println("");
                    break;
                case 4:
                    casasServ.mostrarDisponibilidadXFechas();
                    System.out.println("");
                    break;
                case 5:
                    comentariosServ.verCalificacionXComentarios();
                    System.out.println("");
                    break;
                case 6:
                    estanciasServ.verEstanciasReservadas();
                    System.out.println("");
                    break;
                case 7:
                    casasServ.verPrecioFinalCasasUK();
                    System.out.println("");
                    break;
                case 8:
                    casasServ.contarCasasXPais();
                    System.out.println("");
                    break;
                case 9:
                    casasServ.verCasasLimpiasEnUK();
                    System.out.println("");
                    break;
                case 10:
                    estanciasServ.ingresarReservas();
                    System.out.println("");
                    break;
                case 11:
                    System.out.println("Gracias por usar el servicio, hasta la próxima!");
                    break;
                default:
                    System.out.println("La opción ingresada no existe");
            }
        } while (opc != 11);
    }

}
