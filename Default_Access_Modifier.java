package org.example;

//p1 class must be is diff package

//Example of default access modifier
class p1{
    void display(){
        System.out.println("display p1");
    }
}

public class Default_Access_Modifier {
    public static void main(String[] args) {
        p1 obj = new p1();

        obj.display();
    }

}
