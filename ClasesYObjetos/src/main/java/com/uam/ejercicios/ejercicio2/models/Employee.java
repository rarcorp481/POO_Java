package com.uam.ejercicios.ejercicio2.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@AllArgsConstructor
@Accessors(chain = true)
public class Employee {
    private String name;
    private String charge;
    private double salaryMonth;

    public void showData(){
        System.out.printf("""
                \nDATOS DEL EMPLEADO
                Nombre: %s
                Cargo: %s
                Salario Mensual: %.2f
                Salario Anual: %.2f
                """,
                this.getName(),
                this.getCharge(),
                this.getSalaryMonth(),
                this.getSalaryMonth()*12);
    }
}
