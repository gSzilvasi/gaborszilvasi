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

            int studentTimePerDay = 6;
            int halfYearWeeks = 17;
            int weekDays = 5;
            int allLearningTimePerHalfYear = studentTimePerDay * weekDays * halfYearWeeks;
            System.out.println(allLearningTimePerHalfYear);

            int WorkingHour = 52;
            int HalfYearWH = WorkingHour * 17;
            System.out.println(allLearningTimePerHalfYear * 100 /HalfYearWH +"%");
        }
}
