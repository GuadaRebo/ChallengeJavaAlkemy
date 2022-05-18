
package com.challengeBackendJava.alkemy.entity;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter @Setter
public class Personaje implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idPersonaje;
    @Basic
    private String imagen;
    private String nombre;
    private Long edad;
    private Long peso;
    private String historia;
     
    @ManyToMany (fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "personaje_pelicula", 
            joinColumns = @JoinColumn(name = "idPersonaje", nullable = false), 
            inverseJoinColumns = @JoinColumn(name = "idPelicula", nullable = false))
     private List<Pelicula> idPelicula;     
    
    public Personaje() {
    }

    public Personaje(Long idPersonaje, String imagen, String nombre, Long edad, Long peso, String historia, List<Pelicula> idPelicula) {
        this.idPersonaje = idPersonaje;
        this.imagen = imagen;
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.historia = historia;
        this.idPelicula = idPelicula;
    }

    

   

    

   

    
    
}
