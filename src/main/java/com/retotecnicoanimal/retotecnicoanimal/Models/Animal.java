package com.retotecnicoanimal.retotecnicoanimal.Models;

import com.retotecnicoanimal.retotecnicoanimal.Enum.AnimalTipo;

public abstract class Animal {

    private String name;
    private String onomatopeya;

    public Animal(String name, String onomatopeya) {
        this.name = name;
        this.onomatopeya = onomatopeya;
    }
    
    public String getName() {
        return name;
    }
    
    public String getOnomatopeya() {
        return onomatopeya;
    }

    public abstract AnimalTipo tipo();
}
