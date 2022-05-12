
package com.challengeBackendJava.alkemy.entity;

import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter @Setter
public class Personaje {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Basic
    private String imagen;
    private String nombre;
    private Long edad;
    private Long peso;
    private String historia;
    @ManyToMany
    @JoinTable(name = "personaje_pelicula", joinColumns = @JoinColumn(name = "personaje_id"), inverseJoinColumns = @JoinColumn(name = "pelicula_id"))
     private Set<Pelicula> pelicula = new HashSet<>();
    
    
    public Personaje() {
    }

    public Personaje(Long id, String imagen, String nombre, Long edad, Long peso, String historia) {
        this.id = id;
        this.imagen = imagen;
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.historia = historia;
    }

    
    
}
