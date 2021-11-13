package com.pb.zelenaja.hw7;

public class Tie extends Clothes implements MenClothes {

    public Tie(Size size, double cost, String color) {
        super(size, cost, color);
    }

    @Override
    public void dressMan() {

    }

    @Override
    public String toString() {
        return "Галстук: " +
                "размер = " + getSize() +
                ", цена = " + getCost() + " USD" +
                ", цвет = " + getColor() +
                ".";
    }

}


