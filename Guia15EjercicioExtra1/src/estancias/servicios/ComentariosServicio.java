package estancias.servicios;

import estancias.entidades.Comentarios;
import estancias.persistencia.ComentariosDAO;

public class ComentariosServicio {

    ComentariosDAO daoComentarios = new ComentariosDAO();

//E.
    public void verCalificacionXComentarios() throws Exception {
        for (Comentarios lista : daoComentarios.listaComentarios()) {
            System.out.println(lista);
        }
    }
    
}
