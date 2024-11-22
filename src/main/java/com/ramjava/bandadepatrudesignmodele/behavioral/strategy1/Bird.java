package com.ramjava.bandadepatrudesignmodele.behavioral.strategy1;

public class Bird extends Animal{

    public Bird() {
        super();
        setSound("Tweet");
        flyingType = new ItFlys();
    }
}
