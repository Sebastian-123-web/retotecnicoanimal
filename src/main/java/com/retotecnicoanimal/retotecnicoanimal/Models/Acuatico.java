package com.retotecnicoanimal.retotecnicoanimal.Models;

import com.retotecnicoanimal.retotecnicoanimal.Enum.AnimalTipo;

public class Acuatico extends Animal {
    
    public Acuatico(String nombre, String onomatopeya){
        super(nombre, onomatopeya);
    }

    @Override
    public AnimalTipo tipo() {
        return AnimalTipo.ACUATICO;
    }
}
