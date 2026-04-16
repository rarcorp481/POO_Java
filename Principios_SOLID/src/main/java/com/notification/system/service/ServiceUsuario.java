package com.notification.system.service;

import com.notification.system.models.Usuario;

public class ServiceUsuario implements IServiceUsuario{

    private IServiceUsuarioDB db =  new ServiceUsuarioDB();

    @Override
    public void cambiarNombre(Usuario u, String nombre) {
        u.setNombre(nombre);
        db.actualizarUsuario(u);

    }

    @Override
    public void cambiarApellido(Usuario u, String apellido) {
        u.setApellido(apellido);
       db.actualizarUsuario(u);
    }

    @Override
    public void cambiarEmail(Usuario u, String email) {
        u.setEmail(email);
        db.actualizarUsuario(u);
    }

    @Override
    public String mostrarNotificaciones(Usuario u) {
        return "";
    }
}
