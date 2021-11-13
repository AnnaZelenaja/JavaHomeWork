package com.pb.zelenaja.hw7;

public class Tshirt extends Clothes implements MenClothes, WomenClothes {

    public Tshirt(Size size, double cost, String color) {
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
        return "Футболка: " +
                "размер = " + getSize() +
                ", цена = " + getCost() + " USD" +
                ", цвет = " + getColor() +
                ".";

    }

}
