package uam.org.model;

public class EstudianteRe extends Estudiante{

    public EstudianteRe(Double promedio){
        super(promedio);
    }

    public EstudianteRe(String cif, String nombre, String apellido, String correo, Double promedio) {
        super(cif, nombre, apellido, correo, promedio);
    }

    @Override
    public Double calcularBeca() {
        return 0.3;
    }
}
