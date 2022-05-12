
package com.challengeBackendJava.alkemy.security.repository;


import com.challengeBackendJava.alkemy.security.entity.Rol;
import com.challengeBackendJava.alkemy.security.enums.RolNombre;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;




@Repository
public interface RolRepository extends JpaRepository<Rol, Integer>{
    Optional<Rol> findByRolNombre(RolNombre rolNombre);
}
