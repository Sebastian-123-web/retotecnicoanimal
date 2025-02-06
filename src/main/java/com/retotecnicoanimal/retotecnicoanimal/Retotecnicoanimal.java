package com.retotecnicoanimal.retotecnicoanimal;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.retotecnicoanimal.retotecnicoanimal.Enum.AnimalTipo;
import com.retotecnicoanimal.retotecnicoanimal.Factory.AnimalFactory;
import com.retotecnicoanimal.retotecnicoanimal.Models.Animal;
import com.retotecnicoanimal.retotecnicoanimal.Servicio.AnimalServicio;
import com.retotecnicoanimal.retotecnicoanimal.config.AppConfig;

public class Retotecnicoanimal {
    public static void main(String[] args) {
        
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        AnimalServicio animalServicio = context.getBean(AnimalServicio.class);
        AnimalFactory animalFactory = context.getBean(AnimalFactory.class);

        List<Animal> animals = new ArrayList<>();
        for (String arg : args) {
            String[] parts = arg.split("\\|");
            String name = parts[0].trim();
            String type = parts[1].trim();
            String onomatopoeia = parts[2].trim();
            animals.add(animalFactory.crearAnimal(name, type, onomatopoeia));
        }

        Map<AnimalTipo, List<Animal>> animalsByType = animalServicio.ordenarAnimalPorTipo(animals);
        animalServicio.mostrarAnimalesPorTipo(animalsByType);
    }
}
