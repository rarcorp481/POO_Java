package ni.edu.uam.servicio;

import ni.edu.uam.model.Libro;

public interface IServicioTransaccion {

    Libro insertarLibro(Libro libro);
    Libro actualizarLibro(Libro libro);
    void eliminarLibro(Libro libro);

}
