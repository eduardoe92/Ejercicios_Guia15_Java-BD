package tienda.servicios;

import java.util.*;
import tienda.entidades.Producto;
import tienda.persistencia.ProductoDAO;

public class ProductoService {

    private Scanner in;
    private ProductoDAO dao;

    public ProductoService() {
        this.dao = new ProductoDAO();
    }

    // a) Lista el nombre de todos los productos que hay en la tabla producto.        
    public void imprimirNombreProductos() throws Exception {

        try {
            Collection<Producto> productos = dao.listarProductos();
            if (productos.isEmpty()) {
                throw new Exception("No existen productos para imprimir");
            } else {
                for (Producto p : productos) {
                    System.out.println(p.getNombre());
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }

    // b) Lista los nombres y los precios de todos los productos de la tabla producto.
    public void imprimirNombrePrecioProductos() throws Exception {

        try {
            Collection<Producto> productos = dao.listarProductos();
            if (productos.isEmpty()) {
                throw new Exception("No existen productos para imprimir");
            } else {
                for (Producto p : productos) {
                    System.out.println("Nombre = " + p.getNombre() + " Precio = " + p.getPrecio());
                }
            }
        } catch (Exception e) {
            throw e;
        }
    }

    // c) Listar aquellos productos que su precio esté entre 120 y 202
    public void productosEntre120Y202() throws Exception {
        try {
            Collection<Producto> productos = dao.listarProductos();
            if (productos.isEmpty()) {
                throw new Exception("No existen productos para imprimir");
            } else {
                for (Producto p : productos) {
                    if (p.getPrecio() >= 120 && p.getPrecio() <= 202 ) {
                        System.out.println("Nombre = " + p.getNombre() + " Precio = " + p.getPrecio());
                    }

                }
            }
        } catch (Exception e) {
            throw e;
        }
    }
    
    // d) Buscar y listar todos los Portátiles de la tabla producto
    public void listarPortatiles() throws Exception{
        try{
            String sql = "SELECT * FROM producto WHERE nombre LIKE '%Portátil%';";
            Collection <Producto> portatiles = dao.listarProductosPorQuery(sql);
            if(portatiles.isEmpty()){
                throw new Exception("No hay portatiles");
            }else{
                for (Producto portatil : portatiles) {
                    System.out.println("Nombre = " + portatil.getNombre()+ " Precio = " + portatil.getPrecio());
                }
            }
        }catch(Exception e){
            throw e;
        }
    }
    
    //e) Listar el nombre y el precio del producto más barato.
    public void nombreYPrecioMasBarato () throws Exception{
        try{
            String sql = "SELECT * FROM producto ORDER BY precio LIMIT 1;";
            Collection<Producto> p = dao.listarProductosPorQuery(sql);
            for(Producto product: p){
                System.out.println(product);
            }
            
        }catch(Exception e){
            throw e;
        }
    }
    
    // f) Ingresar un producto a la base de datos.
    public void ingresarProducto() throws Exception {
        in = new Scanner(System.in);
        Producto p = new Producto();
        System.out.print("nombre -> ");
        p.setNombre(in.nextLine());
        System.out.print("Precio ->  ");
        p.setPrecio(in.nextDouble());
        System.out.println("Codigo del Fabricante -> ");
        p.setCodigo_fabricante(in.nextInt());

        try {
            dao.guardarProducto(p);
        } catch (Exception e) {
            throw new Exception("Error al guadar producto");
        }

    }
    
    // G) Se encuentra en FabricanteService
    
    // h) Editar un producto con datos a elección.
    public void editarProducto() throws Exception{
        in = new Scanner(System.in);
        Producto p = new Producto();
        System.out.print("Ingrese el codigo del producto a modificar -> ");
        p.setCodigo(in.nextInt());
        in.nextLine();
        System.out.print("Nuevo nombre del producto -> ");
        p.setNombre(in.nextLine());
        System.out.print("Nuevo precio del producto -> ");
        p.setPrecio(in.nextDouble());
        System.out.print("Nuevo codigo fabricante del producto -> ");
        p.setCodigo_fabricante(in.nextInt());
        in.nextLine();
        
        try {
            dao.modificarProducto(p);
        } catch (Exception ex) {
            throw ex;
        }
        
    }
}
