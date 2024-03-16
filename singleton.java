package org.example;


class Mysingleton{
    static Mysingleton instance = null;
    public int x = 10;
    private Mysingleton(){}

    static public Mysingleton getInstance(){
        if(instance == null){
            instance = new Mysingleton();
        }
        return instance;
    }
}
public class singleton {
    public static void main(String[] args) {
        Mysingleton a = Mysingleton.getInstance();
        Mysingleton b = Mysingleton.getInstance();
        System.out.println(a.x + " " + b.x);
    }
}
