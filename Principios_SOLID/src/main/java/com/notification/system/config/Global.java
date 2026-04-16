package com.notification.system.config;

import com.notification.system.models.Envio;
import com.notification.system.models.Notificacion;
import com.notification.system.models.Usuario;

import java.util.ArrayList;
import java.util.List;

public class Global {

    public static List<Usuario>  listaUsuarios = new ArrayList<>();
    public static List<Notificacion> listaNotificaciones = new ArrayList<>();
    public static List<Envio> listaEnvios = new ArrayList<>();
}
