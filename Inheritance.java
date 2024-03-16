package org.example;


class Car {

    Car() {
        System.out.println("in car constructer");
    }

    public void brakes() {
        System.out.println("brakes applied");
    }
}

class wagonR extends Car {
    wagonR() {
        super();
        System.out.println("in contructer wagonR");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        Car c = new wagonR();
        c.brakes();
    }
}
