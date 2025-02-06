package com.retotecnicoanimal.retotecnicoanimal.Factory;

import com.retotecnicoanimal.retotecnicoanimal.Models.Acuatico;
import com.retotecnicoanimal.retotecnicoanimal.Models.Animal;
import com.retotecnicoanimal.retotecnicoanimal.Models.Terrestre;
import com.retotecnicoanimal.retotecnicoanimal.Models.Volador;

public class AnimalFactory {

    public Animal crearAnimal(String nombre, String tipo, String onomatopeya){
        switch (tipo.toUpperCase()) {
            case "TERRESTRE":
                return new Terrestre(nombre, onomatopeya);
            case "VOLADOR":
                return new Volador(nombre, onomatopeya);
            case "ACUATICO":
                return new Acuatico(nombre, onomatopeya);
            default:
                throw new IllegalArgumentException("Tipo de animal no valido: " + tipo);
        }
    }
}