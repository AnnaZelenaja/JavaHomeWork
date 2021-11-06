package com.pb.zelenaja.hm6;

import java.util.Objects;

public class Horse extends Animal {
    private String name;
    private int age;

    public Horse() {
    }

    public Horse(String name, int age, String food, String location) {
        super(food, location);
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String makeNoise() {
        return "Иггоо-гоо!!!!";
    }

    @Override
    public void eat() {
        System.out.println(getName() + " ест " + getFood());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Horse horse = (Horse) o;
        return age == horse.age && Objects.equals(name, horse.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Horse{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", " + super.toString();
    }
}

