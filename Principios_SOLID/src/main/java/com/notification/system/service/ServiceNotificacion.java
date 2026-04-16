package com.notification.system.service;

import com.notification.system.models.Notificacion;

public class ServiceNotificacion implements IServiceNotificacion{

    private IServiceNotificacionDB db = new ServiceNotificacionDB();


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

