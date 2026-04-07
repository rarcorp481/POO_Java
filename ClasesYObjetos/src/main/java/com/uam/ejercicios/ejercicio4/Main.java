package com.uam.ejercicios.ejercicio4;

import com.uam.ejercicios.ejercicio4.models.Account;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Account a1 = new Account("Rodolfo", 1405435, 4555);

        a1.currentAmount();
        a1.deposit(sc);
        a1.currentAmount();
        a1.withdrawal(sc);
        a1.currentAmount();
    }
}
