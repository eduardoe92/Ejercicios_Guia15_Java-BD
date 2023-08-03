package tienda;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import tienda.servicios.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        ProductoService ps = new ProductoService();
        FabricanteService fs = new FabricanteService();
        int opc = 0;
        menu();
        while (opc != 9) {            
            opc = in.nextInt();
            in.nextLine();
            switch (opc) {
                case 1 -> {
                    ps.imprimirNombreProductos();
                    System.out.println("Presion ENTER para continuar...");
                    in.nextLine();
                    limpiarPantalla();
                    menu();
                }
                case 2 -> {
                    ps.imprimirNombrePrecioProductos();
                    System.out.println("Presion ENTER para continuar...");
                    in.nextLine();
                    limpiarPantalla();
                    menu();
                }
                case 3 -> {
                    ps.productosEntre120Y202();
                    System.out.println("Presion ENTER para continuar...");
                    in.nextLine();
                    limpiarPantalla();
                    menu();
                }
                case 4 -> {
                    ps.listarPortatiles();
                    System.out.println("Presion ENTER para continuar...");
                    in.nextLine();
                    limpiarPantalla();
                    menu();
                }
                case 5 -> {
                    ps.nombreYPrecioMasBarato();
                    System.out.println("Presion ENTER para continuar...");
                    in.nextLine();
                    limpiarPantalla();
                    menu();
                }
                case 6 -> {
                    ps.ingresarProducto();
                    System.out.println("Presion ENTER para continuar...");
                    in.nextLine();
                    limpiarPantalla();
                    menu();
                }
                case 7 -> {
                    fs.ingresarFabricante();
                    System.out.println("Presion ENTER para continuar...");
                    in.nextLine();
                    limpiarPantalla();
                    menu();
                }
                case 8 -> {
                    ps.editarProducto();
                    System.out.println("Presion ENTER para continuar...");
                    in.nextLine();
                    limpiarPantalla();
                    menu();
                }
                case 9 -> System.out.println("Saliendo...");
                default -> {
                    System.out.println("Opcion invalida");
                    System.out.println("Presion ENTER para continuar...");
                    in.nextLine();
                    limpiarPantalla();
                    menu();
                }
            }
        }
    }

    //Metodos adicionales
    public static void limpiarPantalla() throws Exception {
        Robot robot = new Robot();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_L);
        robot.keyRelease(KeyEvent.VK_L);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(200);
    }
    
    public static void menu(){
        System.out.println("------------------------------- Menu -------------------------------------");
            System.out.println("1. Lista el nombre de todos los productos que hay en la tabla producto");
            System.out.println("2. Lista los nombres y los precios de todos los productos de la tabla producto.");
            System.out.println("3. Listar aquellos productos que su precio esté entre 120 y 202.");
            System.out.println("4. Buscar y listar todos los Portátiles de la tabla producto.");
            System.out.println("5. Listar el nombre y el precio del producto más barato.");
            System.out.println("6. Ingresar un producto a la base de datos.");
            System.out.println("7. Ingresar un fabricante a la base de datos");
            System.out.println("8. Editar un producto con datos a elección");
            System.out.println("9. Salir.");
            System.out.print("Ingrese una opcion -> ");
    }
}