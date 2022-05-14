
package com.challengeBackendJava.alkemy.dto;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data 
@Getter @Setter
public class PeliculaDto implements Serializable{
    private String imagen;
    private String titulo;
    private Date fecha_creacion;

    public PeliculaDto() {
    }

    public PeliculaDto(String imagen, String titulo, Date fecha_creacion) {
        this.imagen = imagen;
        this.titulo = titulo;
        this.fecha_creacion = fecha_creacion;
    }

    

   
    
    
}
