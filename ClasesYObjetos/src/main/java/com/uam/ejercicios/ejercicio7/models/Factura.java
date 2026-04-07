package com.uam.ejercicios.ejercicio7.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class Factura {
    private int numeroFactura;
    private String cliente;
    private double monto;


    public void mostrarFactura(){
        System.out.printf("""
                \n==== FACTURA ====
                Número de factura: %d
                Cliente: %s
                Monto: %.2f córdobas
                IVA (15%%): %.2f córdobas
                Monto + IVA: %.2f córdobas
                """,
                this.getNumeroFactura(),
                this.getCliente(),
                this.getMonto(),
                this.calcularIva15(),
                this.getMonto() + this.calcularIva15());
    }

    public double calcularIva15(){
        return this.getMonto() * 0.15;
    }
}
