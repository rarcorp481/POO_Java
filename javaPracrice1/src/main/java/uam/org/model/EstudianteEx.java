package uam.org.model;

public class EstudianteEx extends Estudiante{

    public EstudianteEx(Double promedio){
        super(promedio);
    }

    public EstudianteEx(String cif, String nombre, String apellido, String correo, Double promedio) {
        super(cif, nombre, apellido, correo, promedio);
    }

    @Override
    public Double calcularBeca(){
        return 0.9;
    }
}
