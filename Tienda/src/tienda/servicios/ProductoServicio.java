package tienda.servicios;

import java.sql.ResultSet;
import java.sql.SQLException;
import tienda.entidades.Producto;
import tienda.persistencia.ProductoDAO;

public class ProductoServicio {

    ProductoDAO daoprod = new ProductoDAO();

//A.
    public void consultarProducto() throws SQLException {
        ResultSet rs1 = daoprod.select("SELECT nombre FROM producto");
        while (rs1.next()) {
            String nombre = rs1.getString("nombre");
            System.out.println("El producto " + nombre);
        }
    }

//B.
    public void mostrarPrecio() throws SQLException {
        ResultSet rs1 = daoprod.select("SELECT nombre, precio FROM producto");
        while (rs1.next()) {
            String nombre = rs1.getString("nombre");
            String precio = rs1.getString("precio");
            System.out.println("El producto " + nombre + " cuesta $" + precio);
        }
    }

//C.
    public void mostrar120_202() throws SQLException {
        ResultSet rs1 = daoprod.select("SELECT * FROM producto WHERE precio BETWEEN 120 AND 202 ORDER BY nombre ASC");
        while (rs1.next()) {
            String nombre = rs1.getString("nombre");
            String precio = rs1.getString("precio");
            System.out.println("El producto " + nombre + " cuesta $" + precio);
        }
    }

//D.
    public void mostrarPortatiles() throws SQLException {
        ResultSet rs1 = daoprod.select("SELECT * FROM producto WHERE nombre LIKE '%Portátil%' ");
        while (rs1.next()) {
            String nombre = rs1.getString("nombre");
            String precio = rs1.getString("precio");
            System.out.println("El producto " + nombre + " cuesta $" + precio);
        }
    }

//E.
    public void productoBarato() throws SQLException {
        ResultSet rs1 = daoprod.select("SELECT nombre, precio FROM producto ORDER BY precio ASC LIMIT 1");
        while (rs1.next()) {
            String nombre = rs1.getString("nombre");
            String precio = rs1.getString("precio");
            System.out.println("El producto mas barato es: " + nombre + " cuesta $" + precio);
        }
    }

//F.
    public void ingresarProducto() throws SQLException {
        Producto producto1 = new Producto(12, "Impresora HP Laserjet Pro Z", 250, 3);
        daoprod.manolito(producto1);
    }

//H.
    public void modificarProducto() throws SQLException {
        Producto producto2 = new Producto(5, "Smartphone Xiaomi 11T Pro 8GB RAM 256GB ROM", 394, 9);
        daoprod.modificarProd(producto2);
    }

}
