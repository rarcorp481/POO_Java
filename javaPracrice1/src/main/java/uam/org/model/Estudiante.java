package uam.org.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Objects;

@Getter
@Setter
@ToString
public abstract class Estudiante {
    private String cif;
    private String nombre;
    private String apellido;
    private String correo;
    protected Double promedio;

    public Estudiante() {}


    public Estudiante(String cif, String nombre, String apellido, String correo, Double promedio) {
        this.cif = cif;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.promedio = promedio;
    }

    public Estudiante(Double promedio) {
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Estudiante that = (Estudiante) o;
        return Objects.equals(cif, that.cif);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(cif);
    }

    public abstract Double calcularBeca();
    
}
