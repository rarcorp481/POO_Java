package com.uam.ejercicios.ejercicio6.models;

import lombok.*;
import lombok.experimental.Accessors;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class Microbus {
    private String placa;
    private int ruta;
    private int capacidad;


    public void displayDetails(){
        System.out.printf("""
                \n===== DATOS MICROBUS =====
                
                PLACA: %s
                RUTA: %d
                CAPACIDAD: %d personas
                """, this.getPlaca(), this.getRuta(), this.getCapacidad());
    }

    public Microbus setRuta(int ruta){
        this.ruta = ruta;
        return this; // útil para encadenar los métodos set() directamente en una línea. Lombok lo hace con @Accessors(chain = true)
    }

}
