
package com.challengeBackendJava.alkemy.service;

import com.challengeBackendJava.alkemy.entity.Personaje;
import com.challengeBackendJava.alkemy.repository.PersonajeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonajeService implements IPersonajeService{
    @Autowired    
    public PersonajeRepository persoRepo;
    
    @Override
    public Personaje verPersonaje(Long id) {
     return persoRepo.findById(id).orElse(null);
}    
    
    @Override
    public void crearPersonaje(Personaje personaje) {
        persoRepo.save(personaje);
      
    }

    @Override
    public void borrarPersonaje(Long id) {
        persoRepo.deleteById(id);
    }

    @Override
    public void actualizarPersonaje(Personaje personaje) {
        persoRepo.save(personaje);
    }
    
    
    
}
