package com.uam.ejercicios.ejercicio1.models;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Getter
@Setter
@AllArgsConstructor
public class Producto {
    private int codigo;
    private String nombre;
    private double precio;
    private int stock;

    // Actualiza el stock del producto
    public void stockUpdate(int stock){
        this.setStock(stock);
    }

    // mostrar la información del producto
    public void infoProducto(){
        System.out.printf("""
                \nINFORMACIÓN DEL PRODUCTO
                Código: %d
                Nombre: %s
                Precio: %.2f
                Stock: %d
                """,
                this.codigo,
                this.nombre,
                this.precio,
                this.stock);
    }
}


