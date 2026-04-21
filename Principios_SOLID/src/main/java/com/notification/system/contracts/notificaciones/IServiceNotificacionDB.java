package com.notification.system.contracts.notificaciones;

import com.notification.system.models.Notificacion;

public interface IServiceNotificacionDB {

    public void insertarNotificacion(Notificacion n);
    public void actualizarNotificacion(Notificacion n);
    public void eliminarNotificacion(Notificacion n);
    public String obtenerNotificacionPorId(Notificacion n);

}
