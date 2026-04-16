package com.notification.system.service;

import com.notification.system.config.Global;
import com.notification.system.models.Envio;

import java.util.Objects;

public class ServiceEnvioDB implements IServiceEnvioDB{


    @Override
    public void registrarEnvio(Envio e) {
        Global.listaEnvios.add(e);
    }

    @Override
    public void actualizarEnvio(Envio e, Integer idEnvio) {
        for (int i = 0; i < Global.listaEnvios.size(); i++){
            if (Objects.equals(e.getId(), Global.listaEnvios.get(i).getId())) {
                Global.listaEnvios.set(i, e);
            }
        }
    }

    @Override
    public void eliminarEnvio(Envio e, Integer idEnvio) {
        Global.listaEnvios.removeIf(existente -> Objects.equals(existente.getId(), e.getId()));
    }

    @Override
    public void obtenerEnvio(Envio e, Integer idEnvio) {

    }
}
