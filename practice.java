package org.example;


 class B{
    public  void fun1(int a){

        System.out.println("in b");
    }

}

class C extends B{

    public  void fun(){
        System.out.println("in c");
    }

    public void fun1(int i) {

        System.out.println("in c");
    }



}

    public class practice {
    public static void main(String[] args) {
       B a = new B();
       a.fun1(1);
    }
}

