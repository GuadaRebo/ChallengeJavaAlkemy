
package com.challengeBackendJava.alkemy.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
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
    private Long idPelicula;
    @Basic
    private String imagen;
    private String titulo;
    private Date fecha_creacion;
    @Min(1)
    @Max(5)
    private Long calificacion;
     
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
     @JoinColumn(name = "genero_id")
    private Genero genero;
     
    
     @ManyToMany(fetch=FetchType.LAZY,  mappedBy = "idPelicula", cascade = CascadeType.ALL)
     private List<Personaje> idPersonaje;
     
    

    public Pelicula() {
    }

    public Pelicula(Long idPelicula, String imagen, String titulo, Date fecha_creacion, Long calificacion, Genero genero, List<Personaje> idPersonaje) {
        this.idPelicula = idPelicula;
        this.imagen = imagen;
        this.titulo = titulo;
        this.fecha_creacion = fecha_creacion;
        this.calificacion = calificacion;
        this.genero = genero;
        this.idPersonaje = idPersonaje;
    }

    

    

     

 

} 
    

