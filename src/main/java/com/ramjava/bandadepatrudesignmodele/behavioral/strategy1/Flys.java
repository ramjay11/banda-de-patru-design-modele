package com.ramjava.bandadepatrudesignmodele.behavioral.strategy1;

// Avoid interfaces that just force action
public interface Flys {

    String fly();
}

class ItFlys implements Flys {

    @Override
    public String fly() {
        return "Flying high";
    }
}

class CantFly implements Flys {

    @Override
    public String fly() {
        return "I cannot fly";
    }
}
