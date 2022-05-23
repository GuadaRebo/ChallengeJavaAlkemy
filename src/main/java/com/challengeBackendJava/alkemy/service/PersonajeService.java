
package com.challengeBackendJava.alkemy.service;

import com.challengeBackendJava.alkemy.dto.PersonajeConPeliculasDto;
import com.challengeBackendJava.alkemy.dto.PersonajeDto;
import com.challengeBackendJava.alkemy.entity.Pelicula;
import com.challengeBackendJava.alkemy.entity.Personaje;
import com.challengeBackendJava.alkemy.repository.PeliculaRepository;
import com.challengeBackendJava.alkemy.repository.PersonajeRepository;
import com.challengeBackendJava.alkemy.utils.MHelpers;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonajeService implements IPersonajeService{
    @Autowired    
    public PersonajeRepository persoRepo;
     @Autowired    
    public PeliculaRepository peliRepo;
    
     @Override
    public List<Personaje> verListaPersonaje() {
        return persoRepo.findAll();
    }
    
    @Override
    public PersonajeConPeliculasDto verPersonaje(Long idPersonaje) {
     Personaje personaje = persoRepo.findById(idPersonaje).orElse(null);
     return MHelpers.modelMapper().map(personaje, PersonajeConPeliculasDto.class);
}    
    
    @Override
    public PersonajeConPeliculasDto crearPersonaje(Personaje personaje) {
        persoRepo.save(personaje);
       return MHelpers.modelMapper().map(personaje, PersonajeConPeliculasDto.class);
    }

    @Override
    public void borrarPersonaje(Long idPersonaje) {
        persoRepo.deleteById(idPersonaje);
    }

    @Override
    public PersonajeConPeliculasDto actualizarPersonaje(Personaje personaje) {
        persoRepo.save(personaje);
       return MHelpers.modelMapper().map(personaje, PersonajeConPeliculasDto.class);
    }

    @Override
    public PersonajeDto findByNombre(String nombre) {
        Personaje personaje = this.persoRepo.findByNombre(nombre);
        return MHelpers.modelMapper().map(personaje, PersonajeDto.class);
    }

    @Override
    public PersonajeDto findByEdad(Long edad) {
         Personaje personaje = this.persoRepo.findByEdad(edad);
        return MHelpers.modelMapper().map(personaje, PersonajeDto.class);
    }

    @Override
    public PersonajeDto findByPeso(Long peso) {
       Personaje personaje = this.persoRepo.findByPeso(peso);
        return MHelpers.modelMapper().map(personaje, PersonajeDto.class);
    }

     @Override
    public PersonajeDto findByPelicula(Pelicula idMovie) {
        Personaje personaje = this.persoRepo.findByPelicula(idMovie);
        return MHelpers.modelMapper().map(personaje, PersonajeDto.class);
    }

    
    
    
}
