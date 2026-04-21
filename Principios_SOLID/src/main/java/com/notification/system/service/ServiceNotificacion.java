package com.notification.system.service;

import com.notification.system.contracts.notificaciones.IServiceNotificacion;
import com.notification.system.contracts.notificaciones.IServiceNotificacionDB;
import com.notification.system.models.Notificacion;

public class ServiceNotificacion implements IServiceNotificacion {
    private final IServiceNotificacionDB db;

    // Inyección de gestor de bases de datos por constructor, nunca por instancia
    public ServiceNotificacion(IServiceNotificacionDB db) {
        this.db = db;
    }

    @Override
    public void cambiarTitulo(Notificacion n, String titulo) {
        n.setTitulo(titulo);
        db.actualizarNotificacion(n);
    }

    @Override
    public void cambiarDescripcion(Notificacion n, String descripcion) {
        n.setDescripcion(descripcion);
        db.actualizarNotificacion(n);
    }

    @Override
    public void EnviarIndividual(Notificacion n, String UsuarioReceptorId) {

    }

    @Override
    public void EnviarMasivo(Notificacion n) {

    }
}

