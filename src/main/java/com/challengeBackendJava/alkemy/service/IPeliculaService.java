
package com.challengeBackendJava.alkemy.service;

import com.challengeBackendJava.alkemy.dto.PeliculaDto;
import com.challengeBackendJava.alkemy.entity.Genero;
import com.challengeBackendJava.alkemy.entity.Pelicula;
import java.util.List;





public interface IPeliculaService {
    
    public List<Pelicula> verListaPelicula();
    
    public Pelicula verPelicula (Long idPelicula);
    
    public Pelicula crearPelicula (Pelicula pelicula);
    
    public void borrarPelicula (Long idPelicula);
      
    public Pelicula actualizarPelicula (Pelicula pelicula);
    
    public PeliculaDto findByTitulo(String titulo);
    
    public PeliculaDto findByGenero(Genero id_genero);
}
