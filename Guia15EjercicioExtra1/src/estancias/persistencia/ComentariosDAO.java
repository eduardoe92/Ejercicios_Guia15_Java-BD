package estancias.persistencia;

import estancias.entidades.Comentarios;
import estancias.entidades.Estancias;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

public final class ComentariosDAO extends DAO {

//E.
    public Collection<Comentarios> listaComentarios() throws Exception {
        try {
            String sql = "SELECT nombre_huesped, comentarios.id_casa, comentario FROM comentarios LEFT JOIN estancias ON estancias.id_casa = comentarios.id_casa";
            consultarBase(sql);
            Comentarios comentarios = null;
            Estancias estancias = null;
            Collection<Comentarios> lista1 = new ArrayList<>();
            Collection<Estancias> lista2 = new ArrayList<>();
            while (resultado.next()) {                
                comentarios = new Comentarios();
                estancias = new Estancias();
                estancias.setNombreHuesped(resultado.getString(1));
                comentarios.setIdCasa(resultado.getInt(2));
                comentarios.setComentario(resultado.getString(3));
                lista1.add(comentarios);
                lista2.add(estancias);
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
