package com.greenfoxacademy;

public class IntroduceYourself {
    public static void main(String[] args) {
        // Írj egy programot, ami kiír rólad pár részletet a konzolra
        // Minden egyes részletet új sorba írja a program:
        //  - Neved
        //  - Korod
        //  - Magasságod méterben kifejezve (tört érték)        // Egy karakterláncot (string) printel a terminal ablakba.
        String Name = "Szilvási Gábor Péter";
        int Age = 30;
        double Height = 1.8;

        System.out.println(Name);
        System.out.println(Age);
        System.out.println(Height+"m");
    }
}
