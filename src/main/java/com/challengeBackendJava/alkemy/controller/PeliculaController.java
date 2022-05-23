
package com.challengeBackendJava.alkemy.controller;

import com.challengeBackendJava.alkemy.dto.PeliculaDto;
import com.challengeBackendJava.alkemy.entity.Genero;
import com.challengeBackendJava.alkemy.entity.Pelicula;
import com.challengeBackendJava.alkemy.entity.Personaje;
import com.challengeBackendJava.alkemy.repository.PeliculaRepository;
import com.challengeBackendJava.alkemy.repository.PersonajeRepository;
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
    public PeliculaRepository peliRepo;
    @Autowired    
    public PersonajeRepository persoRepo;
     
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
    public PeliculaDto findByGenero( @RequestParam Genero id_genero) {
        return peliServ.findByGenero(id_genero); 
             
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
    
     @PostMapping("/movies/{idMovie}/characters/{idCharacter}")
    public void agregarPersonaAPelicula(@PathVariable("idMovie") Long id_pelicula,
                                            @PathVariable("idCharacter") Long id_personaje){
        Pelicula pelicula = peliRepo.findById(id_pelicula).orElse(null);
        Personaje personaje = persoRepo.findById(id_personaje).orElse(null);

        pelicula.getPersonaje().add(personaje);
        personaje.getPelicula().add(pelicula);

        peliRepo.save(pelicula);
        persoRepo.save(personaje);
    }
    
     @DeleteMapping("/movies/{idMovie}/characters/{idCharacter}")
    public void deleteCharacterFromSeriesOrMovie(@PathVariable("idMovie") Long id_pelicula,
                                            @PathVariable("idCharacter") Long id_personaje){

        Pelicula pelicula = peliRepo.findById(id_pelicula).orElse(null);
         Personaje personaje = persoRepo.findById(id_personaje).orElse(null);

        pelicula.getPersonaje().remove(personaje);
        personaje.getPelicula().remove(pelicula);

        peliRepo.save(pelicula);
        persoRepo.save(personaje);
    }
}
