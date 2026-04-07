package com.uam.ejercicios.ejercicio10.models;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import lombok.*;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
public class Mantenimiento {
    private int codigo;
    private String descripcion;
    private LocalDate fecha;

    public Mantenimiento(int codigo, String descripcion){
        this.setCodigo(codigo);
        this.setDescripcion(descripcion);
        this.setFecha(LocalDate.now());

    }

    public void mostrarInformacion(){
        DateTimeFormatter nicaFormat = DateTimeFormatter.ofPattern("dd / MM / yyyy");

        System.out.printf("""
                ====== INFORMACIÓN DEL MANTENIMIENTO ======
                -------------------------------------------
                Código :        %d
                Descripción:    %s
                Fecha:          %s
                -------------------------------------------
                """,
                this.getCodigo(),
                this.formatearDescripcion(),
                this.getFecha().format(nicaFormat));
    }

    private @NonNull StringBuilder formatearDescripcion(){
        StringBuilder sb = new StringBuilder();
        int contador = 0;
        final int limiteCaracteres = 27;
        String formato = "\n                ";

        for (int i = 0; i < this.getDescripcion().length(); i++) {
            if (contador >= limiteCaracteres) {
                sb.append(formato);
                contador = 0;
            }

            sb.append(this.getDescripcion().charAt(i));
            contador++;
        }
        return sb;
    }

}
