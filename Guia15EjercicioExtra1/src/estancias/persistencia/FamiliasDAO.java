package estancias.persistencia;

import estancias.entidades.Familias;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;

public final class FamiliasDAO extends DAO {

//A.
    public Collection<Familias> listaFamilias() throws SQLException, Exception {
        try {
            String query = "SELECT * FROM familias WHERE num_hijos >= 3 AND edad_maxima < 10";
            consultarBase(query);
            Familias familias = null;
            Collection<Familias> lista = new ArrayList<>();
            while (resultado.next()) {
                familias = new Familias();
                familias.setId(resultado.getInt(1));
                familias.setNombre(resultado.getString(2));
                familias.setEdad_minima(resultado.getInt(3));
                familias.setEdad_maxima(resultado.getInt(4));
                familias.setNum_hijos(resultado.getInt(5));
                familias.setEmail(resultado.getString(6));
                familias.setId_casa_familia(resultado.getInt(7));
                lista.add(familias);
            }
            desconectarBase();
            return lista;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error de Sistema");
        }
    }

//C.
    public Collection<Familias> listaEmails() throws Exception {
        try {
            String query = "SELECT nombre, email FROM familias WHERE email LIKE '%@hotmail.com'";
            consultarBase(query);
            Familias familias = null;
            Collection<Familias> lista = new ArrayList<>();
            while (resultado.next()) {
                familias = new Familias();
//                familias.setId(resultado.getInt(1));
                familias.setNombre(resultado.getString(1));
//                familias.setEdad_minima(resultado.getInt(3));
//                familias.setEdad_maxima(resultado.getInt(4));
//                familias.setNum_hijos(resultado.getInt(5));
                familias.setEmail(resultado.getString(2));
//                familias.setId_casa_familia(resultado.getInt(7));
                lista.add(familias);
            }
            desconectarBase();
            return lista;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            desconectarBase();
            throw new Exception("Error de Sistema");
        }
    }

}
