package com.notification.system.models;

import com.notification.system.contracts.notificaciones.IServiceNotificacionDB;
import com.notification.system.service.ServiceNotificacionDB;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Notificacion {
    private static Integer contadorId = 1;
    private String titulo;
    private String descripcion;
    private int id;
    private final IServiceNotificacionDB db;


    public Notificacion(String titulo, String descripcion, IServiceNotificacionDB db) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.db = db;
        this.id = contadorId++;
    }


}
