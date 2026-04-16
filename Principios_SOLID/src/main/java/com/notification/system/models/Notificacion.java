package com.notification.system.models;

import com.notification.system.service.IServiceNotificacionDB;
import com.notification.system.service.ServiceNotificacionDB;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@ToString
public class Notificacion {

    private static Integer contadorId = 1;

    private String titulo;
    private String descripcion;
    private int id;

    IServiceNotificacionDB db = new ServiceNotificacionDB();

    public Notificacion(String titulo, String descripcion) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.id = contadorId++;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
        db.actualizarNotificacion(this);
    }

    public void setId(int id) {
        this.id = id;
        db.actualizarNotificacion(this);
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
        db.actualizarNotificacion(this);
    }
}
