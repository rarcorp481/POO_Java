package uam.org.service;

import uam.org.model.Estudiante;

public class ClaseBecaB implements InterfaceEstrategiaBeca{

    @Override
    public Double calcularBeca(Estudiante estudiante){
        if (estudiante.getPromedio() >= 90){
            return 0.5;
        }
        return 0.0;
    }
}
