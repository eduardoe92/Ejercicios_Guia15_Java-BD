package tienda;

import java.sql.SQLException;
import java.util.Scanner;
import tienda.servicios.FabricanteServicio;
import tienda.servicios.ProductoServicio;

public class Tienda {

    public static void main(String[] args) throws SQLException {
        ProductoServicio prodServ = new ProductoServicio();
        FabricanteServicio fabrServ = new FabricanteServicio();
        Scanner leer = new Scanner(System.in);
        int opc;
        do {
            System.out.println("Ingrese una opción:\n1 - Consultar Producto\n2 - Consultar Fabricante\n3 - Mostrar Precio\n4 - Mostrar Precios entre $120 y $202\n5 - Mostrar Productos Portátiles\n6 - Mostrar el Producto más Barato\n7 - Ingresar un Producto\n8 - Ingresar un Fabricante\n9 - Modificar un Producto de la Lista\n10 - Salir");
            opc = leer.nextInt();
            switch (opc) {
                case 1:
                    prodServ.consultarProducto();
                    System.out.println("");
                    break;
                case 2:
                    fabrServ.consultarFabricante();
                    System.out.println("");
                    break;
                case 3:
                    prodServ.mostrarPrecio();
                    System.out.println("");
                    break;
                case 4:
                    prodServ.mostrar120_202();
                    System.out.println("");
                    break;
                case 5:
                    prodServ.mostrarPortatiles();
                    System.out.println("");
                    break;
                case 6:
                    prodServ.productoBarato();
                    System.out.println("");
                    break;
                case 7:
                    prodServ.ingresarProducto();
                    System.out.println("");
                    break;
                case 8:
                    fabrServ.ingresarFabricante();
                    System.out.println("");
                    break;
                case 9:
                    prodServ.modificarProducto();
                    System.out.println("");
                    break;
                case 10:
                    System.out.println("Gracias por usar el servicio, hasta la próxima!");
                    break;
                default:
                    System.out.println("La opción ingresada no existe");
            }
        } while (opc != 10);
    }

}
