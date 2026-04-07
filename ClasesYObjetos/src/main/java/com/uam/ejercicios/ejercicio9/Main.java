package com.uam.ejercicios.ejercicio9;

import com.uam.ejercicios.ejercicio9.models.Servicio;
import java.util.Scanner;
/*
Objetivo: Uso de métodos con parámetros.
    - Crear la clase Servicio.
    - Atributos: tipoServicio (agua o luz), consumo.
    - Metodo para calcular el monto a pagar.
    - Crear objetos para ambos servicios.
 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Servicio s1 = new Servicio(20);
        Servicio s2 = new  Servicio(150);

        s1.seleccionarServicio(sc).calcularMonto().mostrarFactura();
        s2.seleccionarServicio(sc).calcularMonto().mostrarFactura();


    }
}
