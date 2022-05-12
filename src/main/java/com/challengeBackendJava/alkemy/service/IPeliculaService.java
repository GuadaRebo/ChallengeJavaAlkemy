
package com.challengeBackendJava.alkemy.service;

import com.challengeBackendJava.alkemy.entity.Pelicula;



public interface IPeliculaService {
    public Pelicula verPelicula (Long id);
    
    public void crearPelicula (Pelicula pelicula);
    
    public void borrarPelicula (Long id);
      
    public void actualizarPelicula (Pelicula pelicula);
}
