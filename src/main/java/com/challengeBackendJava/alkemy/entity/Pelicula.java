
package com.challengeBackendJava.alkemy.entity;


import com.fasterxml.jackson.annotation.JsonIgnore;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name="pelicula")
public class Pelicula  implements Serializable{
     @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id_pelicula;
    @Basic
    private String imagen;
    private String titulo;
    private Date fecha_creacion;
    @Min(1)
    @Max(5)
    private Long calificacion;
     @JsonIgnore
    @ManyToMany(  mappedBy = "pelicula")
     private List<Genero> genero;
     
    @ManyToMany (fetch = FetchType.LAZY, cascade = CascadeType.MERGE)
      @JoinTable(name = "pelicula_personaje", 
            joinColumns = @JoinColumn(name = "id_pelicula"), 
            inverseJoinColumns = @JoinColumn(name = "id_personaje"))
      private List<Personaje> personaje;
     
    
     
    

    public Pelicula() {
    }

    public Pelicula(String imagen, String titulo, Date fecha_creacion, Long calificacion, List<Personaje> personaje) {
        this.imagen = imagen;
        this.titulo = titulo;
        this.fecha_creacion = fecha_creacion;
        this.calificacion = calificacion;
        this.personaje = personaje;
    }

   

    

    

     

 

} 
    

