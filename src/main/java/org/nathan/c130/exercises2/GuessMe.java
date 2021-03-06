package org.nathan.c130.exercises2;

import java.util.Random;
import java.util.Scanner;

public class GuessMe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = new Random().nextInt(10) + 1;//random can also generate booleans and doubles
        int numGuess;

        while(true){
            System.out.println("Please enter a (whole) number between 1 and 10");
            numGuess = Integer.parseInt(scanner.nextLine());

            if(numGuess > 1 && numGuess < 10){
                if (numGuess == i) {
                    System.out.println("Wow! Nice guess! " + numGuess + " was correct!");
                    break;
                } else if (numGuess < i) {
                    System.out.println("Unlucky, too low! You chose " + numGuess + " but I chose " + i + "...");
                    break;
                } else {
                    System.out.println("Way too high! You chose " + numGuess + " but I chose " + i + "...");
                    break;
                }
            }else{
                System.out.println("Please enter a valid guess.");
            }
        }
    }
}
