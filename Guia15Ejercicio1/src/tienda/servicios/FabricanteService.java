package tienda.servicios;

import java.util.*;

import tienda.entidades.Fabricante;
import tienda.persistencia.FabricanteDAO;

public class FabricanteService {
    
    private Scanner in;
    private FabricanteDAO dao;

    public FabricanteService() {
        this.in = new Scanner(System.in);
        this.dao = new FabricanteDAO();
    }
    
    // g) Ingresar un fabricante a la base de datos
    public void ingresarFabricante ()throws Exception{
        Fabricante f = new Fabricante();
        System.out.print("Nombre fabricante -> ");
        f.setNombre(in.nextLine());
        
        try {
            dao.guardarFabricante(f);
        } catch (Exception e) {
            throw e;
        }
    }
}
