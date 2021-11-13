package com.pb.zelenaja.hw7;

public class Skirt extends Clothes implements WomenClothes {

    public Skirt(Size size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressWoman() {

    }

    @Override
    public String toString() {
        return "Юбка: " +
                "размер = " + getSize() +
                ", цена = " + getCost() + " USD" +
                ", цвет = " + getColor() +
                ".";
    }

}
