
package com.challengeBackendJava.alkemy.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name="genero")
public class Genero  implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idGenero;
    @Basic
    private String imagen;
    private String nombre;
   
    @OneToMany(mappedBy ="genero", cascade = CascadeType.MERGE)
     private List<Pelicula> pelicula;
       
    
   

    public Genero() {
    }

    public Genero(Long idGenero, String imagen, String nombre, List<Pelicula> pelicula) {
        this.idGenero = idGenero;
        this.imagen = imagen;
        this.nombre = nombre;
        this.pelicula = pelicula;
    }

   
    
     
}
