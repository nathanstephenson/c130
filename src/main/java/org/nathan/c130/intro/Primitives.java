package org.nathan.c130.intro;

public class Primitives {
    public static void main(String[] args) {
        int i = 1, j = 99, k = 123;
        Integer i1 = i, i2 = 27;
        i1 = 22;

        System.out.println(i1 + " + " + k + " = " + plus(i1, k));
    }

    private static int plus(int i, int j){
        return i + j;
    }
}
