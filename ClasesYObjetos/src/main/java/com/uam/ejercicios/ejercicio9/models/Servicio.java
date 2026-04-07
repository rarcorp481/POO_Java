package com.uam.ejercicios.ejercicio9.models;

import lombok.*;
import lombok.experimental.Accessors;
import java.util.Scanner;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Accessors(chain = true)
public class Servicio {
    private String tipoServicio;
    private double consumo;
    private double subtotal;
    private double agregado;
    private double total;

    // Constructor
    public Servicio (double consumo){
        this.consumo = consumo;
    }

    // Seleccionar servicio
    public Servicio seleccionarServicio(@NonNull Scanner sc){
        String mensajeError = """
                \n=======================================
                Error. Escribe 1 o 2 para la selección.
                =======================================
                """;

        System.out.println("\n===== SERVICIOS DISPONIBLES =====");

        while(true){
            int seleccion;
            try{
                System.out.print("""
                    1. Agua
                    2. Luz
                    Selecciona el servicio a pagar (1-2): \
                    """);
                seleccion = Integer.parseInt(sc.nextLine());

                if(seleccion == 1 || seleccion == 2){
                    this.tipoServicio = (seleccion == 1) ? "Agua" : "Luz";
                    break;
                }
                System.out.println(mensajeError);

            }catch(NumberFormatException e) {
                System.out.println(mensajeError);
            }
        }
        return this;
    }

    // Calcular monto del servicio
    public Servicio calcularMonto() {
        //Agua
        final double PRECIO_AGUA_SUBSIDIO = 10.50; // Menor a 20m³
        final double PRECIO_AGUA_PLENA = 25.00; // Mayor o igual a 20m³
        final double TASA_ALCANTARILLADO = 0.30; // 30%

        //Luz
        final double PRECIO_LUZ_SUBSIDIO = 2.50; // Menor a 150 KWh
        final double PRECIO_LUZ_PLENA = 6.25; // Mayor o igual a 150 KWh
        final double TASA_LUZ_IVA = 0.15; // 15%

        double subtotal, agregado, total;

        switch(this.getTipoServicio().toLowerCase().trim()){  // el .trim() es innecesario pero se pone por si la lógica se rompe.
            case "agua" -> {
                this.subtotal = (this.getConsumo() < 20) ? this.getConsumo() * PRECIO_AGUA_SUBSIDIO : this.getConsumo() * PRECIO_AGUA_PLENA;
                this.agregado = this.subtotal * TASA_ALCANTARILLADO;
                this.total = this.subtotal + this.agregado;
            }
            case "luz" -> {
                this.subtotal = (this.getConsumo() < 150) ? this.getConsumo() * PRECIO_LUZ_SUBSIDIO : this.getConsumo() * PRECIO_LUZ_PLENA;
                this.agregado = (this.getConsumo() < 150) ? 0 * TASA_LUZ_IVA : this.subtotal * TASA_LUZ_IVA;
                this.total = this.subtotal + this.agregado;
            }
            default -> throw new IllegalStateException("Valor inválido: " + this.getTipoServicio().toLowerCase().trim());

        }
        return this;
    }

    public void mostrarFactura(){
        String etiqueta = (this.tipoServicio.equals("Luz")) ? "KWh" : "m³";
        System.out.printf("""
                \n======= RECIBO DE PAGO =======
                Servicio:      %s
                Consumo:       %.2f %s
                ------------------------------
                Subtotal:      C$ %.2f
                IVA:           C$ %.2f
                ------------------------------
                TOTAL A PAGAR: C$ %.2f
                ==============================
                """,
                this.getTipoServicio(),
                this.getConsumo(),
                etiqueta,
                this.getSubtotal(),
                this.getAgregado(),
                this.getTotal());
    }
}
