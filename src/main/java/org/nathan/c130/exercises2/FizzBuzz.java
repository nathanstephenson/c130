package org.nathan.c130.exercises2;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String output;
        int length;

        System.out.println("-----FizzBuzz-----");
        System.out.println("What (integer) number do you want this to run to?");
        length = Integer.parseInt(scanner.nextLine());

        for(int i = 0; i <= length; i++){
            output = "";
            if(((i % 3) == 0 || (i % 5) == 0) && i != 0){
                if ((i % 3) == 0) {
                    output += "Fizz";
                }
                if ((i % 5) == 0) {
                    output += "Buzz";
                }
            } else{
                output = String.valueOf(i);
            }
            System.out.println(output);
        }
    }
}
