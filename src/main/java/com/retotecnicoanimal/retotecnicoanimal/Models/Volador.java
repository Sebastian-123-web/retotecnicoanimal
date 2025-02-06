package com.retotecnicoanimal.retotecnicoanimal.Models;

import com.retotecnicoanimal.retotecnicoanimal.Enum.AnimalTipo;

public class Volador extends Animal {
    
    public Volador(String nombre, String onomatopeya){
        super(nombre, onomatopeya);
    }

    @Override
    public AnimalTipo tipo() {
        return AnimalTipo.VOLADOR;
    }
}
