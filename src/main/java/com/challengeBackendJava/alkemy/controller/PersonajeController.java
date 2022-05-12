
package com.challengeBackendJava.alkemy.controller;

import com.challengeBackendJava.alkemy.entity.Personaje;
import com.challengeBackendJava.alkemy.service.IPersonajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonajeController {
     @Autowired
    private IPersonajeService persoServ;
     
     @GetMapping ("/characters/{id}")
    @ResponseBody
    public Personaje verPersonaje (@PathVariable Long id) {
        return persoServ.verPersonaje(id);
        
    }
    
    @PostMapping ("/characters/new")
    public void agregarPersonaje (@RequestBody Personaje personaje) {
       persoServ.crearPersonaje(personaje);
    }
    
     @DeleteMapping ("/characters/delete/{id}")
    public void borrarPersonaje (@PathVariable Long id) {
        persoServ.borrarPersonaje(id);       
    }
    
    @PutMapping ("/characters/edit")
    public void actualizarPersonaje (@RequestBody Personaje personaje)   {
        persoServ.actualizarPersonaje(personaje);
    }
}
