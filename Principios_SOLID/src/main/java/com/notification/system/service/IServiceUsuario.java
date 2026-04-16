package com.notification.system.service;

import com.notification.system.models.Usuario;

public interface IServiceUsuario {

public void cambiarNombre(Usuario u, String nombre);
public void cambiarApellido(Usuario u, String apellido);
public void cambiarEmail(Usuario u, String email);
public String mostrarNotificaciones(Usuario u);

}
