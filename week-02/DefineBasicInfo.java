package com.greenfoxacademy;

public class DefineBasicInfo {
    public static void main(String[] args) {
        // Hozz létre pár dolgot változóként és utána írasd ki az értékeiket:
        // - A neved karakterláncként (string)
        // - Korod egész számként (integer)
        // - Magasságod méterben törtszámként (float / double)
        // - Házas vagy-e logikai értékként (boolean)
        String Name = "Szilvási Gábor Péter";
        int Age = 30;
        double Height = 1.8;
        boolean Married = false;

        System.out.println("Név: " + Name);
        System.out.println("Életkor: " + Age);
        System.out.println("Magasság: " + Height + "méter");
        System.out.println("Házas: " + Married);

    }
}
