package ni.edu.uam.servicio;

import ni.edu.uam.model.Libro;

import java.util.List;

public class ServicioConsultaLibro implements IServicioConsulta{

    @Override
    public List<Libro> getAll() {
        return List.of();
    }

    @Override
    public Libro get(Integer id) {
        return null;
    }
    
}
