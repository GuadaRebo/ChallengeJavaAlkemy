
package com.challengeBackendJava.alkemy.repository;

import com.challengeBackendJava.alkemy.entity.Personaje;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonajeRepository extends JpaRepository <Personaje, Long>{
   
    public Personaje findByNombre(String Nombre);
    
     public Personaje findByEdad(Long Edad);
     
      public Personaje findByPeso(Long Peso);
     
      public Personaje findByPelicula(String Pelicula);
    
    
}
