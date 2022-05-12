
package com.challengeBackendJava.alkemy.service;

import com.challengeBackendJava.alkemy.entity.Pelicula;
import com.challengeBackendJava.alkemy.repository.PeliculaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PeliculaService implements IPeliculaService{
    @Autowired    
    public PeliculaRepository peliRepo;

    @Override
    public Pelicula verPelicula(Long id) {
        return peliRepo.findById(id).orElse(null);
    }

    @Override
    public void crearPelicula(Pelicula pelicula) {
        peliRepo.save(pelicula);
    }

    @Override
    public void borrarPelicula(Long id) {
        peliRepo.deleteById(id);
    }

    @Override
    public void actualizarPelicula(Pelicula pelicula) {
        peliRepo.save(pelicula);
    }
    
}
