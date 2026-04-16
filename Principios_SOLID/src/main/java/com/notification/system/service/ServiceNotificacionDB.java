package com.notification.system.service;

import com.notification.system.config.Global;
import com.notification.system.models.Notificacion;

import javax.management.modelmbean.InvalidTargetObjectTypeException;

import java.util.Objects;

public class ServiceNotificacionDB implements IServiceNotificacionDB {
    @Override
    public void insertarNotificacion(Notificacion n) {
        Global.listaNotificaciones.add(n);
    }

    @Override
    public void actualizarNotificacion(Notificacion n) {
        for (int i = 0; i < Global.listaNotificaciones.size(); i++) {
            if (Global.listaNotificaciones.get(i).getId() == n.getId()) {
                Global.listaNotificaciones.set(i, n);
                return;
            }
        }
    }

    @Override
    public void eliminarNotificacion(Notificacion n) {
        Global.listaNotificaciones.removeIf(existente -> existente.getId() == n.getId());
    }

    @Override
    public String obtenerNotificacionPorId(Notificacion n) {
        for (Notificacion existente : Global.listaNotificaciones){
            if (Objects.equals(existente.getId(), n.getId())){
                return """
                     Título: %s
                     Descripción: %s
                     """.formatted(existente.getTitulo(), existente.getDescripcion());
            }
        }
        return "Notificación no encontrada";
    }
}
