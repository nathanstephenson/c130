package org.nathan.c130.exercises1;

import java.util.Scanner;

public class WindowMaster {
    public static void main(String[] args) {
        float height;
        float width;
        float glassCost;
        float trimCost;

        String stringHeight;
        String stringWidth;
        String stringGlassCost;
        String stringTrimCost;

        float area;
        float cost;
        float perimeter;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the window height (m)");
        stringHeight = scanner.nextLine();
        height = Float.parseFloat(stringHeight);
        System.out.println("Please enter the window width (m)");
        stringWidth = scanner.nextLine();
        width = Float.parseFloat(stringWidth);
        System.out.println("How much is glass per square meter ($)");
        stringGlassCost = scanner.nextLine();
        glassCost = Float.parseFloat(stringGlassCost);
        System.out.println("How much is trim per meter ($)");
        stringTrimCost = scanner.nextLine();
        trimCost = Float.parseFloat(stringTrimCost);

        area = height*width;
        perimeter = 2 * (height + width);
        cost = (area * glassCost) + (perimeter * trimCost);

        System.out.println("The area of the window is " + area + " square m and its perimeter is " + perimeter + "m, costing $" + cost + ".");
    }
}
