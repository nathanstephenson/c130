package org.nathan.c130.firstOOP;

public class Pet {

    private String name;
    private String type;
    private int age;
    private char size;
    private boolean isMale;

    public Pet(){
        name = "Rover";
        type = "Dog";
        age = 1;
        size = 'L';
        isMale = true;
    }

    public Pet(String name, String type, int age, char size, boolean isMale){
        this.name = name;
        this.type = type;
        this.age = age;
        this.size = size;
        this.isMale = isMale;
    }

    public void printPet(){
        System.out.println("Pet: name = " + this.getName() + ", type: " + this.getType() + ", age: " + this.getAge() + ", size: " + this.getSize() + ", isMale: " + this.isMale());
    }

    public String getName(){ return name; }
    public void setName(String name){ this.name = name; }

    public String getType(){ return type; }
    public void setType(String type){ this.type = type; }

    public int getAge(){ return age; }
    public void setAge(int age){ this.age = age; }

    public char getSize() { return size; }
    public void setSize(char size) { this.size = size; }

    public boolean isMale() { return isMale; }
    public void setMale(boolean isMale) { this.isMale = isMale; }

}
