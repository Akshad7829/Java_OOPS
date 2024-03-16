package org.example;

//abstraction example
//also called control abstraction
abstract class Bird {
    public abstract void makeSound();

    public void write() {
        System.out.println("write in bird");
    }
}

class peacock extends Bird{

//    @Override
    public void makeSound() {
        System.out.println("peacock makes sound");
    }
}

public class Abstraction {
    public static void main(String[] args) {
        Bird b = new peacock();
        b.makeSound();
        b.write();
    }
}
