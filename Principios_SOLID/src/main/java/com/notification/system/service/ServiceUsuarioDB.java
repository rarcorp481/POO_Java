package com.notification.system.service;

import com.notification.system.config.Global;
import com.notification.system.contracts.usuario.IServiceUsuarioDB;
import com.notification.system.models.Usuario;

import java.util.Objects;

public class ServiceUsuarioDB implements IServiceUsuarioDB {
    @Override
    public void insertarUsuario(Usuario u) {
        Global.listaUsuarios.add(u);
    }

    @Override
    public void actualizarUsuario(Usuario u) {
        for (int i = 0; i < Global.listaUsuarios.size(); i++){
          if (Objects.equals(Global.listaUsuarios.get(i).getId(), u.getId())){
              Global.listaUsuarios.set(i, u);
          }
        }
//        Global.listaUsuarios.removeIf(existente -> Objects.equals(existente.getId(), u.getId()));
//        Global.listaUsuarios.add(u);

    }

    @Override
    public void eliminarUsuario(Usuario u) {
        Global.listaUsuarios.removeIf(existente -> Objects.equals(existente.getId(), u.getId()));
    }

    @Override
    public String obtenerUsuarioPorId(Usuario u) {
                for (Usuario existente : Global.listaUsuarios){
            if (Objects.equals(existente.getId(), u.getId())){
                return """
                     Nombre: %s
                     Apellidos: %s
                     Telefono: %d
                     Correo: %s
                     """.formatted(existente.getNombre(), existente.getApellido(), existente.getTelefono(), existente.getEmail());
            }
        }
        return "Usuario no encontrado";
    }
}
