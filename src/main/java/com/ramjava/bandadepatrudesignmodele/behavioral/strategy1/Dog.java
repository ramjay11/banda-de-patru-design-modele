package com.ramjava.bandadepatrudesignmodele.behavioral.strategy1;

public class Dog extends Animal {

    public void digHole() {
        System.out.println("I'm digging a hole");
    }

    public Dog() {
        super();
        setSound("Woof");
        flyingType = new CantFly();
    }

//    public void fly() { Not a good practice
//        System.out.println("I can't fly");
//    }
}
