package uam.org.service;

import uam.org.model.Estudiante;

public interface IEstudianteService {

    Double calcularBeca(Estudiante e);
    void enviarCorreo(Estudiante e);

}
