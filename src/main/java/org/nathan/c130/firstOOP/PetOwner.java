package org.nathan.c130.firstOOP;

public class PetOwner {
    public static void main(String[] args) {
        System.out.println("running pet program");
        Pet pet1 = new Pet("Rover", "Dog", 6, 'L', true);
        Pet pet2 = new Pet("Garfield", "Cat", 4, 'M', true);
        Pet pet3 = new Pet("Otis", "Dog", 2, 'M', true);
        Pet pet4 = new Pet("Bubbles", "Goldfish", 1, 'S', false);
        pet1.printPet();
        pet2.printPet();
        pet3.printPet();
        pet4.printPet();
    }
}
