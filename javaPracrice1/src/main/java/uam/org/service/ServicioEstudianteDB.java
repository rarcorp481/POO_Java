package uam.org.service;
import uam.org.config.Global;
import uam.org.model.Estudiante;

public class ServicioEstudianteDB implements IEstudianteServiceDB{

    @Override
    public Estudiante insertarEstudiante(Estudiante e) {
        return null;
    }

    @Override
    public void eliminarEstudiante(Estudiante e) {

    }

    @Override
    public Estudiante obtenerEstudiante(Estudiante e) {
        return null;
    }

    @Override
    public Estudiante updateEstudiante(Estudiante e) {
        return null;
    }


    /*public static Estudiante insertarEstudiante(Estudiante estudiante) {

        Global.listaEstudiantes.add(estudiante);

        return estudiante;
    }

    public static void listarEstudiantes(){

        Global.listaEstudiantes.forEach(System.out::println);

    }

    public static void actualizarEstudiante(Estudiante estudiante){

        for (int i = 0; i < Global.listaEstudiantes.size();i++){

            Estudiante estudiante1 = Global.listaEstudiantes.get(i);

            if (estudiante1.equals(estudiante)){

                estudiante1.setNombre(estudiante.getNombre());
                estudiante1.setApellido(estudiante.getApellido());
                estudiante1.setCif(estudiante.getCif());
                estudiante1.setCorreo(estudiante.getCorreo());
            }
        }
    }*/


}
