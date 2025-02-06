package com.retotecnicoanimal.retotecnicoanimal;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.retotecnicoanimal.retotecnicoanimal.Enum.AnimalTipo;
import com.retotecnicoanimal.retotecnicoanimal.Models.Animal;
import com.retotecnicoanimal.retotecnicoanimal.Models.Terrestre;
import com.retotecnicoanimal.retotecnicoanimal.Servicio.AnimalServicio;
import com.retotecnicoanimal.retotecnicoanimal.config.AppConfig;

public class Retotecnicoanimal {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        AnimalServicio animalServicio = context.getBean(AnimalServicio.class);


        List<Animal> animal = Arrays.asList(
            new Terrestre("Perro", "guau guau"),
            new Terrestre("Gato", "miau miau")
        );

        Map<AnimalTipo, List<Animal>> animales = animalServicio.ordenarAnimalPorTipo(animal);

        animalServicio.mostrarAnimalesPorTipo(animales);
    }
}
