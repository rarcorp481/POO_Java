package com.uam.ejercicios.ejercicio3.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class Customer {
    private String name;
    private int id;
    private String nationality;


    public void showData(){
        System.out.printf("""
                \nDATOS DEL CLIENTE (HOTEL)
                Nombre: %s
                Cédula (ID): %d
                Nacionaidad: %s
                """, this.getName(), this.getId(), this.getNationality());
    }
}
