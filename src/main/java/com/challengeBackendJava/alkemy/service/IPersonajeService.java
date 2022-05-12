
package com.challengeBackendJava.alkemy.service;

import com.challengeBackendJava.alkemy.entity.Personaje;
import java.util.List;


public interface IPersonajeService {
         
    public Personaje verPersonaje (Long id);
    
    public void crearPersonaje (Personaje personaje);
    
    public void borrarPersonaje (Long id);
      
    public void actualizarPersonaje (Personaje personaje);
    
}
