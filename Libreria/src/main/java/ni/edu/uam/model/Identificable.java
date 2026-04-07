package ni.edu.uam.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
public class Identificable {
    protected Integer id;
    protected LocalDate fechaIngreso;
    protected String usuarioIng;
    protected String usuarioAct;
    protected LocalDate fechaUpdate;


}
