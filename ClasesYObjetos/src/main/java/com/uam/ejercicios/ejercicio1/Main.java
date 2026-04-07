package com.uam.ejercicios.ejercicio1;

import com.uam.ejercicios.ejercicio1.models.Producto;

public class Main {
    public static void main(String[] args) {
        Producto p1 = new Producto(12353, "Leche", 120, 34);
        Producto p2 = new Producto(23423, "Salsa de tomate", 235.3, 35);
        // antes del cambio
        p1.infoProducto();

        p1.stockUpdate(37);

        // después del cambio
        p1.infoProducto();
    }
}
