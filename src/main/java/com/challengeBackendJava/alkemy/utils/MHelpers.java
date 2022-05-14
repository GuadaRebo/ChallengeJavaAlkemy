
package com.challengeBackendJava.alkemy.utils;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;


public class MHelpers {
    @Bean
    public static ModelMapper modelMapper(){
        return new ModelMapper();
    }
}
