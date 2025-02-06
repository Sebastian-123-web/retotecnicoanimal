package com.retotecnicoanimal.retotecnicoanimal.Models;

import com.retotecnicoanimal.retotecnicoanimal.Enum.AnimalTipo;

public class Terrestre extends Animal {
    
    public Terrestre(String nombre, String onomatopeya){
        super(nombre, onomatopeya);
    }

    @Override
    public AnimalTipo tipo(){
        return AnimalTipo.TERRESTRE;
    }
}
