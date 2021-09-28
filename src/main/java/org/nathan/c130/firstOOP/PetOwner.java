package org.nathan.c130.firstOOP;

public class PetOwner {
    public static void main(String[] args) {
        System.out.println("running pet program");
        Pet pet1 = new Pet("Rover", "Dog", 6, 'L', true);
        Pet pet2 = new Pet("Garfield", "Cat", 4, 'M', true);
        Pet pet3 = new Pet("Otis", "Dog", 2, 'M', true);
        Pet pet4 = new Pet("Jaws", "Goldfish", 1, 'S', false);
        printPet(pet1);
        printPet(pet2);
        printPet(pet3);
        printPet(pet4);
    }

    public static void printPet(Pet pet){
        System.out.println("Pet: name = " + pet.getName() + ", type: " + pet.getType() + ", age: " + pet.getAge() + ", size: " + pet.getSize() + ", isMale: " + pet.isMale());
    }
}
