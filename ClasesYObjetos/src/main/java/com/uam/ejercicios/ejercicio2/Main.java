package com.uam.ejercicios.ejercicio2;

import com.uam.ejercicios.ejercicio2.models.Employee;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Rodolfo", "CEO", 30000);
        Employee e2 = new Employee("Katherine", "Secretaria de Finanzas", 20000);

        e1.showData();
        e2.showData();


    }
}
