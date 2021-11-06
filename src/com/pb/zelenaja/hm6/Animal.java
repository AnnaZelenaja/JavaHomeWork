package com.pb.zelenaja.hm6;

import java.util.Objects;

public class Animal {
    private String food;
    private String location;

    public Animal() {
    }

    public Animal(String food, String location) {
        this.food = food;
        this.location = location;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String makeNoise() {
        return null;
    }


    public void eat() {
        System.out.println();

    }

    public void sleep() {
        System.out.println("Животное спит..");
        System.out.println();
            }

    @Override
    public String toString() {
        return " " +
                "food='" + food + '\'' +
                " location='" + location;
    }
}
