package org.nathan.c130.exercises1;

import java.util.Scanner;

public class MiniMadLibs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String noun1;
        String adj1;
        String noun2;
        String stringNum;
        int num;
        String adj2;
        String pnoun1;
        String pnoun2;
        String pnoun3;
        String verbPresent;
        String verbPast;

        System.out.println("Please enter a noun");
        noun1 = scanner.nextLine().toUpperCase();
        System.out.println("Please enter an adjective");
        adj1 = scanner.nextLine();
        System.out.println("Please enter a noun");
        noun2 = scanner.nextLine();
        System.out.println("Please enter a whole number");
        stringNum = scanner.nextLine();
        num = Integer.parseInt(stringNum);
        System.out.println("Please enter an adjective");
        adj2 = scanner.nextLine();
        System.out.println("Please enter a plural noun");
        pnoun1 = scanner.nextLine();
        System.out.println("Please enter a plural noun");
        pnoun2 = scanner.nextLine();
        System.out.println("Please enter a plural noun");
        pnoun3 = scanner.nextLine();
        System.out.println("Please enter a present-tense verb");
        verbPresent = scanner.nextLine();
        System.out.println("Please enter the same verb in the past-tense");
        verbPast = scanner.nextLine();
        System.out.println("Thank you");

        System.out.println(noun1 + ": " + adj1 + " frontier. These are the voyages of the starship " + noun2 +
                ". Its " + num + "-year mission: to explore strange " + adj2 + " " + pnoun1 + ", to seek out " + adj2 + " " + pnoun2 +
                " and " + adj2 + " " + pnoun3 + ", to boldly " + verbPresent + " where no one has " + verbPast + " before.");
    }
}
