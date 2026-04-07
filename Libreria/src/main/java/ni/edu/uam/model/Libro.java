package ni.edu.uam.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Libro extends Identificable{
    private String ISBN;
    private String autor;
    private String editora;
    private String nombre;


}
