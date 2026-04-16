package com.notification.system.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Envio {

    private static Integer counterId = 1;

    private Integer idNotificacion;
    private Integer idUsuario;
    private Integer id;

    public Envio(Integer idNotificacion, Integer idUsuario) {
        this.idNotificacion = idNotificacion;
        this.idUsuario = idUsuario;
        this.id = counterId++;
    }

}
