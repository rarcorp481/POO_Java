package com.uam.ejercicios.ejercicio7;

import com.uam.ejercicios.ejercicio7.models.Factura;
/*
Objetivo: Cálculo sencillo con métodos.

    - Crear la clase Factura.

    - Atributos: numeroFactura, cliente, monto.

    - Metodo para calcular IVA (15%).

    - Metodo para mostrar total a pagar.

 */
public class Main {
    public static void main(String[] args) {
        Factura f1 = new Factura(344, "Gerardo Rojas", 2300);

        f1.mostrarFactura();
    }
}
