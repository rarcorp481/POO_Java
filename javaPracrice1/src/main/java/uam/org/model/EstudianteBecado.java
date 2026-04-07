package uam.org.model;

public class EstudianteBecado extends Estudiante{

    public EstudianteBecado(Double promedio){
        super(promedio);
    }

    public EstudianteBecado(String cif, String nombre, String apellido, String correo, Double promedio) {
        super(cif, nombre, apellido, correo, promedio);
    }

    @Override
    public Double calcularBeca() {
        return 0.5;
    }


}
