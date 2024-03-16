package org.example;


class bike {
    private String name;
    private Integer topSpeed;

    public String getName() {
        return name;
    }

    public Integer getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(Integer topSpeed) {
        this.topSpeed = topSpeed;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Encapsulation {
    public static void main(String[] args) {
        bike b = new bike();
        b.setName("MT-15");
        b.setTopSpeed(115);
        System.out.println(b.getName() + " " + b.getTopSpeed());
    }
}
