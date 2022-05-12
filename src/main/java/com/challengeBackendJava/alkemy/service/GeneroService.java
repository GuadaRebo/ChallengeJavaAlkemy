
package com.challengeBackendJava.alkemy.service;

import com.challengeBackendJava.alkemy.entity.Genero;
import com.challengeBackendJava.alkemy.repository.GeneroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GeneroService implements IGeneroService{
    @Autowired
    public GeneroRepository genRepo;
    
    
    @Override
    public void crearGenero(Genero genero) {
        genRepo.save(genero);
    }
    
}
