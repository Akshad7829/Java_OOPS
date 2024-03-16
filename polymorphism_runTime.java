package org.example;

//example of run time polymorphism
//also called dynamic method dispatch
class A {
    public void print() {
        System.out.println("in A");
    }
}

class D extends A {


    public void print() {
        System.out.println("in D");
    }
}


public class polymorphism_runTime {
    public static void main(String[] args) {
        A a = new D();
        a.print();
    }
}
