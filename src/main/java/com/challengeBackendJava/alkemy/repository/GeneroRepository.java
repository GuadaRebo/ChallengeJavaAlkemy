
package com.challengeBackendJava.alkemy.repository;

import com.challengeBackendJava.alkemy.entity.Genero;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GeneroRepository extends JpaRepository <Genero, Long>{
    
}
