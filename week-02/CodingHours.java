package com.greenfoxacademy;

public class CodingHours {
        public static void main(String[] args) {
            // Egy átlagos Green Fox hallgató 6 órát kódol naponta
            // Egy félév hosszúsága 17 hét
            //
            // Írd ki, hány órát tölt kódolással egy hallgató egy félév során,
            // ha a hallgató csak hétköznap kódol
            //
            // Írd ki, hogy a félév hány százalékát tölti a hallgató kódolással
            // ha az átlagos heti munkaidő 52 óra
            int studentTimeerDay = 6;
            int halfYearWeeks = 17;
            int weekdays = 5;
            int allLearningTimePerHalfYear = studentTimeerDay * weekdays * halfYearWeeks;
            System.out.println(allLearningTimePerHalfYear);
        }
}