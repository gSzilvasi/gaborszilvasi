package com.greenfoxacademy;

import java.util.Scanner;

        public class HelloUser {
            public static void main(String[] args) {
                // Módosítsd úgy ezt a programot, hogy a felhasználót üdvözölje
                // a Világ helyett.
                // A program kérje a felhasználó nevét
                // System.out.println("Hello, World!");

                // Készít egy scanner-t, majd adok egy imput mezőt instrukcióval
                Scanner scanner = new Scanner(System.in);
                System.out.print("Kérlek, add meg a neved (majd nyomj egy 'Enter-t'): ");
                // A program megáll és vár a felhasználói input-ra, illetve utána az enter megnyomására
                String userInput1 = scanner.nextLine();

                // Utána kiírja a felhasználó által beírt sor egészét
                System.out.println("Helló " + userInput1  + "!");
            }

}
