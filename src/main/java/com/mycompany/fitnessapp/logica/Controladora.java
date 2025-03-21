
package com.mycompany.fitnessapp.logica;

import com.mycompany.fitnessapp.persistencia.ControladoraPersistencia;
import java.util.List;


public class Controladora {
ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    public void agregarUsuario(Usuario usu, String nombre, int edad, int estatura, int peso, String sexo, String actividad, String objetivo,String calorias,  String imc) {
        usu.setNombre(nombre);
        usu.setEdad(edad);
        usu.setEstatura(estatura);
        usu.setPeso(peso);
        usu.setSexo(sexo);
        usu.setActividad(actividad);
        usu.setObjetivo(objetivo);
        usu.setCalorias(calorias);
        usu.setImc(imc);
        
        controlPersis.agregarUsuario(usu);
        
    }

    public List<Usuario> traerUsuarios() {
        return controlPersis.traerUsuarios();
    }

    public void borrarUsuario(int idUsu) {
        controlPersis.borrarUsuario(idUsu);
    }

    public Usuario traerUsuario(int idUsu) {
        return controlPersis.traerUsuario(idUsu);
    }

    public void modificarUsuario(Usuario usu, String nombre, int edad, int estatura, int peso, String sexo, String actividad, String objetivo, String calorias, String imc) {
        usu.setNombre(nombre);
        usu.setEdad(edad);
        usu.setEstatura(estatura);
        usu.setPeso(peso);
        usu.setSexo(sexo);
        usu.setActividad(actividad);
        usu.setObjetivo(objetivo);
        usu.setCalorias(calorias);
        usu.setImc(imc);
        controlPersis.modificarUsuario(usu);
    }
    
}
