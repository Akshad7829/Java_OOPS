package org.example;

//Constructer example
class Animal {
    int a;
    String str;

    Animal() {
        System.out.println("in default constructer");
    }

    Animal(int a, String b) {
        this.a = a;
        str = b;
    }

    Animal(Animal a) {
        this.a = a.a;
        this.str = a.str;
    }
}

public class Constructers {
    public static void main(String[] args) {

        //Defaulf constructer
        Animal a = new Animal();

        //Parameterized Constructer
        Animal a1 = new Animal(1, "dog");
        System.out.println(a1.str + " " + a1.a);

        //Copy Constructer
        Animal b = new Animal(a1);
        System.out.println(b.str + " " + b.a);

    }
}
