
package com.challengeBackendJava.alkemy.controller;

import com.challengeBackendJava.alkemy.dto.PeliculaDto;
import com.challengeBackendJava.alkemy.entity.Pelicula;
import com.challengeBackendJava.alkemy.service.IGeneroService;
import com.challengeBackendJava.alkemy.service.IPeliculaService;
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
public class PeliculaController {
     @Autowired
    private IPeliculaService peliServ;
      @Autowired
     private IGeneroService genServ;
     
      @GetMapping ("/movies")
    @ResponseBody
    public List<Pelicula> verListaPelicula () {
        return peliServ.verListaPelicula();
    }
     
     @GetMapping ("/movies/{idPelicula}")
    @ResponseBody
    public Pelicula verPelicula (@PathVariable Long idPelicula) {
        return peliServ.verPelicula(idPelicula);
    }
    
    @GetMapping ("/movies/name")
    @ResponseBody
    public PeliculaDto findByTitulo( @RequestParam String titulo) {
       return peliServ.findByTitulo(titulo); 
             
    }
    
    @GetMapping ("/movies/gender")
    @ResponseBody
    public List<PeliculaDto> findAllByGenero( @RequestParam String genero) {
        return peliServ.findAllByGenero(genero); 
             
    }
    
    
    @PostMapping ("/movies/new")
    public Pelicula agregarPelicula (@RequestBody Pelicula pelicula) {
        peliServ.crearPelicula(pelicula);
        return pelicula;
    }
    
     @DeleteMapping ("/movies/delete/{idPelicula}")
    public void borrarPelicula (@PathVariable Long idPelicula) {
        peliServ.borrarPelicula(idPelicula);       
    }
    
    @PutMapping ("/movies/edit")
    public Pelicula actualizarPelicula (@RequestBody Pelicula pelicula)   {
        peliServ.actualizarPelicula(pelicula);
        return pelicula;
    }
}
