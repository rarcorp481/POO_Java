package com.uam.ejercicios.ejercicio3;

import com.uam.ejercicios.ejercicio3.models.Customer;

public class Main {
    public static void main(String[] args) {
        Customer c1 = new Customer("Rodolfo", 2007071031, "Nicaragüense");
        Customer c2 = new Customer();

        c1.showData();

        c2.setName("Alfredo").setId(24366643).setNationality("Costarricense");
        c2.showData();

    }

}
