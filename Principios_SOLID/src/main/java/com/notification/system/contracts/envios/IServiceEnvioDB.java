package com.notification.system.contracts.envios;

import com.notification.system.models.Envio;

public interface IServiceEnvioDB {

    public void registrarEnvio(Envio e);
    public void actualizarEnvio(Envio e, Integer idEnvio);
    public void eliminarEnvio(Envio e, Integer idEnvio);
    public void obtenerEnvio(Envio e, Integer idEnvio);

}
