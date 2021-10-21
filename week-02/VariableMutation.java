package com.greenfoxacademy;

public class VariableMutation {
        public static void main(String[] args) {
            int a = 3;
            // Növeld meg az "a" változó értékét 10-zel
            System.out.println(a+10);

            int b = 100;
            // Csökkentsd a "b" változó értékeét 7-tel
            System.out.println(b-7);

            int c = 44;
            // A c értéke legyen dupla akkora
            System.out.println(c*2);

            int d = 125;
            // Oszd el a d-t 5-tel
            System.out.println(d/5);

            int e = 8;
            // Emeld köbre az e változó értékét
            System.out.println(e*e*e);

            int f1 = 123;
            int f2 = 345;
            boolean f3 = f1>f2;
            // Logikai (boolean) értékként írasd ki hogy f1 nagyobb-e f2-nél
            System.out.println(f3);

            int g1 = 350;
            int g2 = 200;
            boolean g3 = g2*2>g1;
            // Mondja meg a program, hogy g2 duplája nagyobb-e g1-nél (boolean)
            System.out.println(g3);

            int h = 135798745;
            int h2 = h % 11;
            boolean h3 = h2 <= 0;
            // Mondja meg a program, hogy osztható-e 11-el maradék nélkül?
            // Írasd is ki logikai (boolean) értékként
            System.out.println(h3);

            int i1 = 10;
            int i2 = 3;
            int i3 = i2*i2;
            boolean i4 = i1 > i2*i2 && i1 < i2*i2*i2;
            // Mondja meg a program hogy i1 nagyobb-e i2 négyzeténél ÉS ugyanakkor kisebb-e i2 köbénél (boolean)
            System.out.println(i4);

            int j = 1521;
            boolean j1= j % 2 == 0;
            // Írasd ki, hogy j osztható-e 3-mal vagy 5-tel (boolean)
            System.out.println(j1);
        }

}
