
package com.challengeBackendJava.alkemy.dto;

import com.challengeBackendJava.alkemy.entity.Pelicula;
import java.io.Serializable;
import java.util.List;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter @Setter
public class PersonajeConPeliculasDto implements Serializable{
     private String imagen;
    private String nombre;
    private Long edad;
    private Long peso;
    private String historia;
    private List<Pelicula> peliculas;   

    public PersonajeConPeliculasDto() {
    }

    public PersonajeConPeliculasDto(String imagen, String nombre, Long edad, Long peso, String historia, List<Pelicula> peliculas) {
        this.imagen = imagen;
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.historia = historia;
        this.peliculas = peliculas;
    }
    
    
    
}

