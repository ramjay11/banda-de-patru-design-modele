package com.ramjava.bandadepatrudesignmodele.behavioral.strategy1;

public class AnimalPlay {

    // The Strategy Pattern lets the algorithm vary independently of clients that use it
    /*
     *  When to use the Strategy Pattern?
     *  When you want to define a class that will have one behavior that is similar to other behavior in a list
     *  When you need to use one of several behaviors dynamically
     *  Often reduces long list of conditional statements
     *  Avoids duplicate code
     *  Keep class changes from forcing other class changes
     *  Can hide complicated / secret code from the user
     *  Drawback: Increase numbers of objects/classes
     * */

    public static void main(String[] args) {
        var Siber = new Dog();
        var Parrot = new Bird();
        System.out.println("Dog: " + Siber.tryToFly());
        System.out.println("Bird: " + Parrot.tryToFly());
    }

}
