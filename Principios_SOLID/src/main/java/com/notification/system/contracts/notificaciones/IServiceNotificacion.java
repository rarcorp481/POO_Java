package com.notification.system.contracts.notificaciones;

import com.notification.system.models.Notificacion;

public interface IServiceNotificacion{

    public void cambiarTitulo(Notificacion n, String titulo);
    public void cambiarDescripcion(Notificacion n, String descripcion);
    public void EnviarIndividual(Notificacion n, String usuarioReceptorId);
    public void EnviarMasivo(Notificacion n);

}
