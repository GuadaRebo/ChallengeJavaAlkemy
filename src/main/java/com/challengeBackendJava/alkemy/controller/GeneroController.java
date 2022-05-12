
package com.challengeBackendJava.alkemy.controller;

import com.challengeBackendJava.alkemy.entity.Genero;
import com.challengeBackendJava.alkemy.service.IGeneroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GeneroController {
    @Autowired
    private IGeneroService genServ;
    
     @PostMapping ("/gender/new")
    public void agregarGenero (@RequestBody Genero genero) {
       genServ.crearGenero(genero);
    }
    
}
