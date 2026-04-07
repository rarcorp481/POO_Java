package uam.org.service;

import uam.org.model.Estudiante;

public interface IEstudianteServiceDB {

    Estudiante insertarEstudiante(Estudiante e);
    void eliminarEstudiante(Estudiante e);
    Estudiante obtenerEstudiante(Estudiante e);
    Estudiante updateEstudiante(Estudiante e);

}
