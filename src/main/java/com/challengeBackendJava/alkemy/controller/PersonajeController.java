
package com.challengeBackendJava.alkemy.controller;

import com.challengeBackendJava.alkemy.dto.PersonajeConPeliculasDto;
import com.challengeBackendJava.alkemy.dto.PersonajeDto;
import com.challengeBackendJava.alkemy.entity.Pelicula;
import com.challengeBackendJava.alkemy.entity.Personaje;
import com.challengeBackendJava.alkemy.repository.PeliculaRepository;
import com.challengeBackendJava.alkemy.repository.PersonajeRepository;
import com.challengeBackendJava.alkemy.service.IPersonajeService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonajeController {
     @Autowired
    private IPersonajeService persoServ;
       @Autowired    
    public PeliculaRepository peliRepo;
       @Autowired    
    public PersonajeRepository persoRepo;
     
     
      @GetMapping ("/characters")
    @ResponseBody
    public List<Personaje> verListaPersonaje () {
        return persoServ.verListaPersonaje();
    }
     
     @GetMapping ("/characters/{idPersonaje}")
    @ResponseBody
    public PersonajeConPeliculasDto verPersonaje (@PathVariable Long idPersonaje) {
        return persoServ.verPersonaje(idPersonaje);
        
    }
     @GetMapping ("/characters/name")
    @ResponseBody
    public PersonajeDto findByNombre( @RequestParam String nombre) {
       return persoServ.findByNombre(nombre); 
             
    }
     @GetMapping ("/characters/age")
    @ResponseBody
    public PersonajeDto findByEdad( @RequestParam Long edad) {
       return persoServ.findByEdad(edad); 
             
    }
     @GetMapping ("/characters/peso")
    @ResponseBody
    public PersonajeDto findByPeso( @RequestParam Long peso) {
       return persoServ.findByPeso(peso); 
             
    }   
     @GetMapping ("/characters/movies") 
    @ResponseBody
    public PersonajeDto findByPelicula( @RequestParam Pelicula idMovie) {
       return persoServ.findByPelicula(idMovie); 
    }
      
    @PostMapping ("/characters/new")
    public PersonajeConPeliculasDto agregarPersonaje (@RequestBody Personaje personaje) {
     return  persoServ.crearPersonaje(personaje);
                 
    }
    
     @DeleteMapping ("/characters/delete/{id_personaje}")
    public void borrarPersonaje (@PathVariable Long id_personaje) {               
        persoServ.borrarPersonaje(id_personaje);       
    }
    
    @PutMapping ("/characters/edit")
    public PersonajeConPeliculasDto actualizarPersonaje (@RequestBody Personaje personaje)   {
      return  persoServ.actualizarPersonaje(personaje);
         
    }
}
