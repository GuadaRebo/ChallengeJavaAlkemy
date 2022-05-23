
package com.challengeBackendJava.alkemy.entity;


import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name="genero")
public class Genero  implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_genero;
    @Basic
    private String imagen;
    private String nombre;
   
    @ManyToMany( cascade = CascadeType.ALL)
     @JoinTable(name = "genero_pelicula",
            joinColumns = @JoinColumn(name = "id_genero"),
            inverseJoinColumns = @JoinColumn(name = "id_pelicula"))
     private List<Pelicula> pelicula;
       
    
   

    public Genero() {
    }

    public Genero(Long id_genero, String imagen, String nombre, List<Pelicula> pelicula) {
        this.id_genero = id_genero;
        this.imagen = imagen;
        this.nombre = nombre;
        this.pelicula = pelicula;
    }

   
    
     
}
