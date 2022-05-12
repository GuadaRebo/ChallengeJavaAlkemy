
package com.challengeBackendJava.alkemy.controller;

import com.challengeBackendJava.alkemy.entity.Pelicula;
import com.challengeBackendJava.alkemy.service.IPeliculaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PeliculaController {
     @Autowired
    private IPeliculaService peliServ;
     
     @GetMapping ("/movies/{id}")
    @ResponseBody
    public Pelicula verPelicula (@PathVariable Long id) {
        return peliServ.verPelicula(id);
    }
    
    @PostMapping ("/movies/new")
    public void agregarPelicula (@RequestBody Pelicula pelicula) {
       peliServ.crearPelicula(pelicula);
    }
    
     @DeleteMapping ("/movies/delete/{id}")
    public void borrarPelicula (@PathVariable Long id) {
        peliServ.borrarPelicula(id);       
    }
    
    @PutMapping ("/movies/edit")
    public void actualizarPelicula (@RequestBody Pelicula pelicula)   {
        peliServ.actualizarPelicula(pelicula);
    }
}
