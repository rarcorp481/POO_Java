package com.uam.ejercicios.ejercicio10;

import com.uam.ejercicios.ejercicio10.models.Mantenimiento;

/*
Objetivo: Consolidar conceptos básicos.
    - Crear la clase Mantenimiento.
    - Atributos: codigo, descripcion, fecha.
    - Metodo para mostrar información del mantenimiento.
    - Crear al menos un objeto.
 */

public class Main {
    public static void main(String[] args) {
        Mantenimiento m1 = new Mantenimiento(3005, "Arreglo de laptop MSI Predator 17 pulgadas. Reballing de núcleo de gráfica (RTX 5070 laptop) y aumento de VRAM.");
        m1.mostrarInformacion();
    }
}
