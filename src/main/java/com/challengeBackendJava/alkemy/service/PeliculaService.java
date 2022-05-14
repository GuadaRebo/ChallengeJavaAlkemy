
package com.challengeBackendJava.alkemy.service;

import com.challengeBackendJava.alkemy.dto.PeliculaDto;
import com.challengeBackendJava.alkemy.entity.Pelicula;
import com.challengeBackendJava.alkemy.repository.PeliculaRepository;
import com.challengeBackendJava.alkemy.utils.MHelpers;
import java.util.List;
import org.modelmapper.ModelMapper;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
public class PeliculaService implements IPeliculaService{
    @Autowired    
    public PeliculaRepository peliRepo;
    
    
    
    
     @Override
    public List<Pelicula> verListaPelicula() {
        return peliRepo.findAll();
    }

    @Override
    public Pelicula verPelicula(Long id) {
        return peliRepo.findById(id).orElse(null);
    }

    @Override
    public Pelicula crearPelicula(Pelicula pelicula) {
       return peliRepo.save(pelicula);
       
    }

    @Override
    public void borrarPelicula(Long id) {
        peliRepo.deleteById(id);
    }

    @Override
    public Pelicula actualizarPelicula(Pelicula pelicula) {
        return peliRepo.save(pelicula);
    }

    @Override
    public PeliculaDto findByTitulo(String Titulo) {
        Pelicula pelicula = this.peliRepo.findByTitulo(Titulo);
         return MHelpers.modelMapper().map(pelicula, PeliculaDto.class);
             
      
    } 
    
   
    
    
}
