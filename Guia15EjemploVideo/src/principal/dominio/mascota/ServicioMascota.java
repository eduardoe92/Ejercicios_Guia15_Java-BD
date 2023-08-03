package com.redsocial.dominio.mascota;

import com.redsocial.dominio.mascota.Mascota;
import com.redsocial.dominio.usuario.Usuario;
import com.redsocial.persistencia.MascotaDAO;
import java.util.Collection;

public class MascotaService {

    private MascotaDAO dao;

    public MascotaService() {
        this.dao = new MascotaDAO();
    }

    public void crearMascota(String apodo, String raza, Usuario usuario) throws Exception {

        try {
            //Validamos
            if (apodo == null || apodo.trim().isEmpty()) {
                throw new Exception("Debe indicar el apodo");
            }

            if (raza == null || raza.trim().isEmpty()) {
                throw new Exception("Debe indicar la raza");
            }

            if (usuario == null) {
                throw new Exception("Debe indicar el Usuario");
            }

            //Creamos el mascota
            Mascota mascota = new Mascota();
            mascota.setApodo(apodo);
            mascota.setRaza(raza);
            mascota.setUsuario(usuario);

            dao.guardarMascota(mascota);

        } catch (Exception e) {
            throw e;
        }
    }