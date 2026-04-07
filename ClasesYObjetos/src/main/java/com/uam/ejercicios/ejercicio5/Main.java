package com.uam.ejercicios.ejercicio5;

import com.uam.ejercicios.ejercicio5.models.*;

public class Main {
    public static void main(String[] args) {
        Course algebraLineal = new Course("Algebra Lineal", "Francisco Franco");
        Student rodolfo = new Student("Rodolfo Ramírez", "Ingeniería en sistemas", 344455, algebraLineal);

        rodolfo.displayDetails();
    }
}
