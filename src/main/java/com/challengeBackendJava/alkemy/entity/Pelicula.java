
package com.challengeBackendJava.alkemy.entity;

import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Pelicula {
     @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Basic
    private String imagen;
    private String titulo;
    private Date fecha_creacion;
    @Min(value=1)
    @Max(value=5)
    private Long calificacion;
    @ManyToOne
     @JoinColumn(name = "genero_id")
    private Genero genero;
    

    public Pelicula() {
    }

    public Pelicula(Long id, String imagen, String titulo, Date fecha_creacion, Long calificacion) {
        this.id = id;
        this.imagen = imagen;
        this.titulo = titulo;
        this.fecha_creacion = fecha_creacion;
        this.calificacion = calificacion;
    }

    
    
    
}
