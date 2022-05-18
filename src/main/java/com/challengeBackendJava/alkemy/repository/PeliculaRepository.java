
package com.challengeBackendJava.alkemy.repository;



import com.challengeBackendJava.alkemy.dto.PeliculaDto;
import com.challengeBackendJava.alkemy.entity.Pelicula;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PeliculaRepository extends JpaRepository <Pelicula, Long> {
    
     public Pelicula findByTitulo(String Titulo);
    
    public List<PeliculaDto> findAllByGenero(String genero);
    
    
    
}
