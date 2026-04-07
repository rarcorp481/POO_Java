package com.uam.ejercicios.ejercicio6;

import com.uam.ejercicios.ejercicio6.models.Microbus;

public class Main {
    public static void main(String[] args) {
        Microbus busChino = Microbus.builder()
                .placa("M22334")
                .ruta(114)
                .capacidad(60).build(); // .builder().build() Ingnora orden y cantidad de atributos

        busChino.displayDetails();

    }
}
