package com.greenfoxacademy;

public class BMI {
        public static void main(String[] args) {
            double massInKg = 81.2;
            double heightInM = 1.78;
            double heightInMSquared = heightInM * heightInM;
 //         System.out.println(massInKg / heightInMSquared);
            System.out.println(massInKg/(heightInM * heightInM));
            // Számíttasd és írasd ki a testtömeg-indexet (BMI)
            // a változókat használva
        }
}
// TTI= testtömeg (kg)/magasság m2