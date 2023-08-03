package estancias.servicios;

import estancias.entidades.Familias;
import estancias.persistencia.FamiliasDAO;

public class FamiliasServicio {

    FamiliasDAO daoFamilias = new FamiliasDAO();

//A.
    public void mostrarFamilias() throws Exception {
        for (Familias lista : daoFamilias.listaFamilias()) {
            System.out.println(lista);
        }
    }

//C.
    public void mostrarEmail() throws Exception {
        for (Familias lista : daoFamilias.listaEmails()) {
            System.out.println(lista);
        }
    }

}
