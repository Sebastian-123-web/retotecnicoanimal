package com.retotecnicoanimal.retotecnicoanimal.Factory;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.retotecnicoanimal.retotecnicoanimal.Models.Animal;
import com.retotecnicoanimal.retotecnicoanimal.Models.Terrestre;

public class AnimalFactoryTest {

    @Test
    void crearTerrestre(){
        Animal animal = new AnimalFactory().crearAnimal("Perro", "terrestre", "guau");
        assertTrue(animal instanceof Terrestre);
        assertEquals("Perro", animal.getName());
        assertEquals("guau", animal.getOnomatopeya());
    }

    @Test
    void crearVolador(){
        Animal animal = new AnimalFactory().crearAnimal("Paloma","Volador","currucucu");
        assertEquals("Paloma", animal.getName());
        assertEquals("currucucu", animal.getOnomatopeya());
    }

    @Test
    void crearAcuatico(){
        Animal animal = new AnimalFactory().crearAnimal("Pez","acuatico","gluglu");
        assertEquals("Pez", animal.getName());
        assertEquals("gluglu", animal.getOnomatopeya());
    }
}
