package com.uam.ejercicios.ejercicio8;

import java.util.Scanner;
import com.uam.ejercicios.ejercicio8.models.Pedido;

/*
Objetivo: Estados simples mediante atributos.

    - Crear la clase Pedido.

    - Atributos: codigoPedido, nombreCliente, estado.

    - Métodos para cambiar el estado del pedido.

    - Estados posibles: pendiente, en proceso, entregado.

 */
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Pedido p1 = Pedido.builder()
                .codigoPedido(100010)
                .nombreCliente("Gerardo Amador")
                .build();

        p1.mostrarDatos();
        p1.cambiarEstado(sc);
        p1.mostrarDatos();
    }
}
