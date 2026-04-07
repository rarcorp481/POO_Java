package com.uam.ejercicios.ejercicio8.models;

import lombok.*;
import lombok.experimental.Accessors;
import java.util.Scanner;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
@Builder
public class Pedido {
    private int codigoPedido;
    private String nombreCliente;
    private String estado;

    public void mostrarDatos(){
        System.out.printf("""
                \n===== DATOS PEDIDO =====
                CÓDIGO: %d
                CLIENTE: %s
                ESTADO: %s
                """,
                this.getCodigoPedido(),
                this.getNombreCliente(),
                this.getEstado());
    }

    public Pedido cambiarEstado(@NonNull Scanner sc) {
        System.out.print("\n===== CAMBIAR DATOS DEL PEDIDO =====\n");
        int opcion;
        while (true) {
            try {
                System.out.print("""
                        1. Pendiente
                        2. En proceso
                        3. Entregado
                        
                        Seleccione el estado (1-3): \
                        """); // la "\" significa que no hará el salto de línea de las últimas (""") y conservará los espacios anteriores a ella
                opcion = Integer.parseInt(sc.nextLine());

                if (opcion <= 3 && opcion >= 1) {
                    break; // sale del bucle
                }
                System.out.println("\nError. Ingrese un número dentro del rango de 1 y 3.\n");

            } catch (NumberFormatException e) {
                System.out.println("\nFormato no válido. Ingresa un número entre 1 y 3.\n");
            }
        }

        switch (opcion) {
            case 1 -> this.setEstado("Pendiente");
            case 2 -> this.setEstado("En proceso");
            case 3 -> this.setEstado("Entregado");
        }

        System.out.println("¡Estado asignado con éxito!");
        return this;
    }

}
