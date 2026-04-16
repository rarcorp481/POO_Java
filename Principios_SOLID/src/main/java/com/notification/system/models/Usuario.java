package com.notification.system.models;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Usuario {

    private static Integer contadorId = 1;

    private String nombre;
    private String apellido;
    private String email;
    private Integer telefono;
    private Integer id;

    public Usuario(String nombre, String apellido, String email, Integer telefono){
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.telefono = telefono;
        this.id = contadorId++;
    }

}
