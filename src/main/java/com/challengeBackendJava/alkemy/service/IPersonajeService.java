
package com.challengeBackendJava.alkemy.service;

import com.challengeBackendJava.alkemy.dto.PersonajeDto;
import com.challengeBackendJava.alkemy.entity.Pelicula;
import com.challengeBackendJava.alkemy.entity.Personaje;
import java.util.List;


public interface IPersonajeService {
    
    public List<Personaje> verListaPersonaje();
         
    public Personaje verPersonaje (Long idPersonaje);
    
    public Personaje crearPersonaje (Personaje personaje);
    
    public void borrarPersonaje (Long idPersonaje);
      
    public Personaje actualizarPersonaje (Personaje personaje);     
      
    public PersonajeDto findByNombre(String nombre);
      
    public PersonajeDto findByEdad(Long edad); 
      
    public PersonajeDto findByPeso(Long peso);  
    
    
    
}
