package uam.org.test;

import uam.org.model.Estudiante;
import uam.org.model.EstudianteBecado;
import uam.org.service.ClaseBecaA;
import uam.org.service.ClaseBecaB;
import uam.org.service.ServicioEstudiante;
import uam.org.service.ServicioEstudianteDB;

public class Main {
    public static void main(String[] args) {

        Estudiante estudiante = new EstudianteBecado("22010929",
                "Rodolfo",
                "Ramírez",
                "rramirezc@uamv.edu.ni",
                90.0);

        Double beca = estudiante.calcularBeca();
        System.out.println(beca);

        /*Estudiante estudiante = new Estudiante("22010929","Rodolfo","Ramírez", "rramirezc@uamv.edu.ni",90.0);

        ServicioEstudianteDB.insertarEstudiante(estudiante);

        Estudiante estudiante1 = new Estudiante("22092385","Patrick","Bateman", "patrickb@uamv.edu.ni",80.0);

        ServicioEstudianteDB.insertarEstudiante(estudiante1);

        ServicioEstudianteDB.listarEstudiantes();

        calcularBeca(estudiante);

        EstudianteBecado becado = (EstudianteBecado) new Estudiante();

        becado.calcularBeca();*/

    }

    public static void calcularBeca(Estudiante estudiante){
        if (estudiante.getPromedio() >= 90){
            System.out.println(ServicioEstudiante.calcularBeca(new ClaseBecaA(), estudiante));
        }

        if (estudiante.getPromedio() >= 80){
            System.out.println(ServicioEstudiante.calcularBeca(new ClaseBecaB(), estudiante));
        }
    }
}
