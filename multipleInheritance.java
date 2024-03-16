package org.example;


interface one {
    public void from_one();
}

interface two {
    public void from_two();
}

interface three extends one, two {

}

class four implements three {

    @Override
    public void from_one() {
        System.out.println("from one");
    }

    @Override
    public void from_two() {
        System.out.println("from two");
    }


}

public class multipleInheritance {
    public static void main(String[] args) {
        four f = new four();
        f.from_one();
        f.from_two();
    }
}
