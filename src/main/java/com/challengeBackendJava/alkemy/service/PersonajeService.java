
package com.challengeBackendJava.alkemy.service;

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
    public Personaje verPersonaje(Long idPersonaje) {
     return persoRepo.findById(idPersonaje).orElse(null);
}    
    
    @Override
    public Personaje crearPersonaje(Personaje personaje) {
       return persoRepo.save(personaje);
      
    }

    @Override
    public void borrarPersonaje(Long idPersonaje) {
        persoRepo.deleteById(idPersonaje);
    }

    @Override
    public Personaje actualizarPersonaje(Personaje personaje) {
       return persoRepo.save(personaje);
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

    
    
    
    
}
