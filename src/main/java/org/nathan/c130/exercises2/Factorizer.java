package org.nathan.c130.exercises2;

import java.util.Scanner;

public class Factorizer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input;
        String output = "";
        int factors = 0;
        int factorSum = 0;
        boolean perfect = false;
        boolean prime = true;

        System.out.println("What number would you like to factorize?");
        input = Integer.parseInt(scanner.nextLine());

        for(int i = 1; i < input; i++){
            if(input%i == 0){
                output += i + " ";
                factorSum += i;
                if(i > 1){
                    prime = false;
                }
                factors++;
            }
        }
        output += input;
        if(factorSum == input){
            perfect = true;
        }

        System.out.println(input + " has " + (factors + 1) + " factors: " + output);
        if(prime){
            System.out.println(input + " is a prime number");
        }else{
            System.out.println(input + " is NOT a prime number");
        }
        if(perfect){
            System.out.println(input + " is a perfect number");
        }else{
            System.out.println(input + " is NOT a perfect number");
        }
    }
}
