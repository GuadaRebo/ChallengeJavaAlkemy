
package com.challengeBackendJava.alkemy.dto;

import java.io.Serializable;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter @Setter
public class PersonajeDto implements Serializable {
    private String imagen;
    private String nombre;

    public PersonajeDto() {
    }

    public PersonajeDto(String imagen, String nombre) {
        this.imagen = imagen;
        this.nombre = nombre;
    }
    
    
}
