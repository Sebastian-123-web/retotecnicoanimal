package com.retotecnicoanimal.retotecnicoanimal.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.retotecnicoanimal.retotecnicoanimal.Factory.AnimalFactory;
import com.retotecnicoanimal.retotecnicoanimal.Servicio.AnimalServicio;

@Configuration
public class AppConfig {
    @Bean
    public AnimalFactory animalFactory(){
        return new AnimalFactory();
    }

    @Bean
    public AnimalServicio animalServicio(){
        return new AnimalServicio();
    }
}
