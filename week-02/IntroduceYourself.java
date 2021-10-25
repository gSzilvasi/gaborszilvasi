package com.greenfoxacademy;

public class IntroduceYourself {
    public static void main(String[] args) {
        // Írj egy programot, ami kiír rólad pár részletet a konzolra
        // Minden egyes részletet új sorba írja a program:
        //  - Neved
        //  - Korod
        //  - Magasságod méterben kifejezve (tört érték)        // Egy karakterláncot (string) printel a terminal ablakba.

        String name = "Szilvási Gábor Péter";
        int age = 30;
        double height = 1.8;

        System.out.println("Név: " + name);
        System.out.println("Kor: " + age +" éves");
        System.out.println("Magasság: " + height+" m");
    }
}
