package com.retotecnicoanimal.retotecnicoanimal.Servicio;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.retotecnicoanimal.retotecnicoanimal.Enum.AnimalTipo;
import com.retotecnicoanimal.retotecnicoanimal.Models.Animal;

@Service
public class AnimalServicio {
    
    public Map<AnimalTipo, List<Animal>> ordenarAnimalPorTipo(List<Animal> animales){
        return animales.stream().collect(Collectors.groupingBy(Animal::tipo));
    }

    public void mostrarAnimalesPorTipo(Map<AnimalTipo, List<Animal>> animalesPorTipo){
        animalesPorTipo.forEach((tipo,animal)->{
            System.out.println("+-----------------");
            System.out.println("|  " + tipo);
            System.out.println("+----------------");
            animal.forEach(a -> {
                System.out.println("* " + a.getName() + " | " + a.getOnomatopeya());
            });
        });
    }
}
