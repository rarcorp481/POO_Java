package uam.org.service;

import uam.org.model.Estudiante;

public class ServicioEstudiante {

    public static Double calcularBeca(InterfaceEstrategiaBeca estrategia, Estudiante estudiante){
        return estrategia.calcularBeca(estudiante);
    }
}
