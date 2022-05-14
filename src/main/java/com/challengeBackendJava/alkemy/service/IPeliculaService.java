
package com.challengeBackendJava.alkemy.service;

import com.challengeBackendJava.alkemy.dto.PeliculaDto;
import com.challengeBackendJava.alkemy.entity.Pelicula;
import java.util.List;
import org.springframework.data.domain.Page;




public interface IPeliculaService {
    
    public List<Pelicula> verListaPelicula();
    
    public Pelicula verPelicula (Long id);
    
    public Pelicula crearPelicula (Pelicula pelicula);
    
    public void borrarPelicula (Long id);
      
    public Pelicula actualizarPelicula (Pelicula pelicula);
    
    public PeliculaDto findByTitulo(String titulo);
}
