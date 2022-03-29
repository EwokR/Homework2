package com.company;

public class Main {

    public static void main(String[] args) {
	// Задание №1
        int hamster = 15;
        byte guineaPig = 2;
        short rat = 1;
        long snake = 100L;
        float meatWeight = 8.73f;
        double candyWeight = 42.337;
        boolean snakeIsLong = snake > 70;
        char star = 42;

    // Задание №2
        double firstBoxer = 78.2;
        double secondBoxer = 82.7;
        double weightOfBothBoxers = firstBoxer + secondBoxer;
        double weightDifference = secondBoxer - firstBoxer;
        System.out.println ("Weight of both boxers " + weightOfBothBoxers + "kilos");
        System.out.println ("Difference in weight " + weightDifference + "kilos");

    // Задание №3
        int banana = 80;
        int allBanana = 5 * banana;
        int milk = 105;
        int allMilk = 2 * milk;
        int iceCream = 100;
        int allIceCream = 2 * iceCream;
        int egg = 70;
        int allEgg = 4 * egg;
        int breakfastWeight = allBanana + allEgg + allMilk + allIceCream;
        float breakfast = breakfastWeight / 1000f;
        System.out.println ("Breakfast weight in grams " + breakfastWeight);
        System.out.println ("Breakfast weight in kilos " + breakfast);

    // Задание №4
        int weight = 7;
        double minimalWeight = weight / 0.25;
        double maximumWeight = weight / 0.5;
        double mediumWeight = (minimalWeight + maximumWeight) / 2;
        System.out.println ("Maximum days to louse 7kg " + minimalWeight);
        System.out.println ("Minimal days to louse 7kg " + maximumWeight);
        System.out.println ("Mediocre days to louse 7kg " + mediumWeight);

    // Задание №5
        int MashaMinimalSalary = 67760;
        int DenisMinimalSalary = 83690;
        int KristinaMinimalSalary = 76230;
        double KristinaMaximumSalary = KristinaMinimalSalary * 0.10 +KristinaMinimalSalary;
        double DenisMaximumSalary = DenisMinimalSalary * 0.10 + DenisMinimalSalary;
        double MashaMaximumSalary = MashaMinimalSalary * 0.10 + MashaMinimalSalary;
        int MashaMinimalYearSalary = 12 * MashaMinimalSalary;
        int DenisMinimalYearSalary = 12 * DenisMinimalSalary;
        int KristinaMinimalYearSalary = 12 * KristinaMinimalSalary;
        double MashaMaximumYearSalary = 12 * MashaMaximumSalary;
        double DenisMaximumYearSalary = 12 * DenisMaximumSalary;
        double KristinaMaximumYearSalary = 12 * KristinaMaximumSalary;
        double MashaDifferenceInSalary = MashaMaximumYearSalary - MashaMinimalYearSalary;
        double DenisDifferenceInSalary = DenisMaximumYearSalary - DenisMinimalYearSalary;
        double KristinaDifferenceInSalary = KristinaMaximumYearSalary - KristinaMinimalYearSalary;
        System.out.println ("Masha now receives " + MashaMaximumSalary + " rubles. " + "Year salary rises on " + MashaDifferenceInSalary + " rubles.");
        System.out.println ("Denis now receives " + DenisMaximumSalary + " rubles. " + "Year salary rises on " + DenisDifferenceInSalary + " rubles.");
        System.out.println ("Kristina now receives " + KristinaMaximumSalary + " rubles. " + "Year salary rises on " +KristinaDifferenceInSalary + " rubles.");


        }
    }
