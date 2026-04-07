package ni.edu.uam.servicio;

import ni.edu.uam.model.Libro;
import java.util.List;

public interface IServicioConsulta {

    List<Libro> getAll();
    Libro get(Integer id);
}
