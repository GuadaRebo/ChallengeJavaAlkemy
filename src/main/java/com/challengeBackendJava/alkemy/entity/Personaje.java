
package com.challengeBackendJava.alkemy.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import java.util.List;
import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter @Setter
public class Personaje implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_personaje;
    @Basic
    private String imagen;
    private String nombre;
    private Long edad;
    private Long peso;
    private String historia;
    
    @JsonIgnore
    @ManyToMany  ( mappedBy = "personaje", fetch = FetchType.LAZY)
     private List<Pelicula> pelicula;     
    
    public Personaje() {
    }

    public Personaje(Long id_personaje, String imagen, String nombre, Long edad, Long peso, String historia) {
        this.id_personaje = id_personaje;
        this.imagen = imagen;
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.historia = historia;
       
    }

    

   

    

   

    
    
}
