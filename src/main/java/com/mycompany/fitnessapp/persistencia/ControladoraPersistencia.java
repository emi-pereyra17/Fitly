package com.mycompany.fitnessapp.persistencia;

import com.mycompany.fitnessapp.logica.Usuario;
import com.mycompany.fitnessapp.persistencia.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ControladoraPersistencia {

    UsuarioJpaController usuJpa = new UsuarioJpaController();
    
    public void agregarUsuario(Usuario usu) {
        usuJpa.create(usu);
    }
    
    public List<Usuario> traerUsuarios() {
        return usuJpa.findUsuarioEntities();
    }
    
    public void borrarUsuario(int idUsu) {
        try {
            usuJpa.destroy(idUsu);
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Usuario traerUsuario(int idUsu) {
       return usuJpa.findUsuario(idUsu);
    }

    public void modificarUsuario(Usuario usu) {
        try {
            usuJpa.edit(usu);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
