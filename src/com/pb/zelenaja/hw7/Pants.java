package com.pb.zelenaja.hw7;

public class Pants extends Clothes implements MenClothes, WomenClothes {

    public Pants(Size size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() {

    }

    @Override
    public void dressWoman() {

    }

    @Override
    public String toString() {
        return "Брюки: " +
                "размер = " + getSize() +
                ", цена = " + getCost() + " USD" +
                ", цвет = " + getColor() +
                ".";
    }

}
