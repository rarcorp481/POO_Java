package com.notification.system.service;

import com.notification.system.models.Usuario;

public interface IServiceUsuarioDB {

    public void insertarUsuario(Usuario u);
    public void actualizarUsuario(Usuario u);
    public void eliminarUsuario(Usuario u);
    public String obtenerUsuarioPorId(Usuario u);

}
