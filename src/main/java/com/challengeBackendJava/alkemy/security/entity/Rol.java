
package com.challengeBackendJava.alkemy.security.entity;


import com.challengeBackendJava.alkemy.security.enums.RolNombre;
import com.sun.istack.NotNull;
import javax.persistence.*;
import lombok.Getter;
import lombok.Setter;



@Entity
 @Setter @Getter
public class Rol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Enumerated(EnumType.STRING)
    private RolNombre rolNombre;

    public Rol() {
    }

    public Rol(RolNombre rolNombre) {
        this.rolNombre = rolNombre;
    }

   
    
    
}