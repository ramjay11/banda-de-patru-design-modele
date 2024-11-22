package com.ramjava.bandadepatrudesignmodele.behavioral.strategy1;

public class Animal {

    private String name;
    private Double height;
    private int weight;
    private String favFood;
    private double speed;
    private String sound;

    public Flys flyingType; // Composition

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        if (weight > 0) {
            this.weight = weight;
        } else {
            System.out.println("Weight must be greater than 0");
        }
    }

    public String getFavFood() {
        return favFood;
    }

    public void setFavFood(String favFood) {
        this.favFood = favFood;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

//    public void fly() {
//        System.out.println("I'm flying");
//    }

    // Use Flys interface as an instance variable (also known as composition) the behavior that isn't tied to the superclass
    // or the subclass
    public String tryToFly() {
        return flyingType.fly();
    }

    public void setFlyingAbility(Flys newFlyingType) {
        flyingType = newFlyingType;
    }
}
