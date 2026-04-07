package com.uam.ejercicios.ejercicio4.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;
import java.util.Scanner;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
public class Account {
    private String nameOwner;
    private int accountNumber;
    private double amount;


    public void showData(){
        System.out.printf("""
                \nDATOS DE CUENTA DE AHORRO
                Titular: %s
                Número de cuenta: %d
                Saldo: %.2f
                
                """,
                this.getNameOwner(),
                this.getAccountNumber(),
                this.getAmount());
    }

    public void deposit(Scanner sc){
        System.out.print("Ingresa el monto a depositar: ");
        double amount = sc.nextDouble();
        this.setAmount(this.getAmount() + amount);
        System.out.println("¡Depósito exitoso!");
    }

    public void withdrawal(Scanner sc){
        System.out.print("Ingrese la cantidad a retirar:");
        double amount = sc.nextDouble();
        if (amount <= this.getAmount()){
            this.setAmount(this.getAmount() - amount);
            System.out.println("¡Retiro exitoso!");
        }
        else{
            System.out.println("Retiro inválido. Por favor ingrese de nuevo el monto");
        }
    }

    public void currentAmount(){
        System.out.println("\nMonto actual: " + this.getAmount());
    }

}
