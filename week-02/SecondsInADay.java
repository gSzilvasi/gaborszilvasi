package com.greenfoxacademy;

public class SecondsInADay {
    public static void main(String[] args) {
        int currentHours = 14;
        int currentMinutes = 34;
        int currentSeconds = 42;
        int totalSeconds = 86400;
        int convertHour = currentHours * 3600;
        int convertMinutes = currentMinutes * 60;
        int currentTimeInSeconds = convertHour + convertMinutes + currentSeconds;


        // Írj egy programot, ami kiszámítja, hogy hány másodperc
        // van még hátra a napból úgy, hogy az aktuális időt a fenti változókkal
        // lehet beállítani (a végeredmény is legyen egész szám)

        System.out.println("Current time is: " + currentHours + ":" + currentMinutes + ":" + currentSeconds);

        System.out.println("How many seconds are left of the day? " + (totalSeconds - currentTimeInSeconds));
    }

}
