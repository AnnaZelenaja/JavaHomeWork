package com.pb.zelenaja.hw7;

public class Atelier {
    public static void main(String[] args) {

        Clothes clothes1 = new Tshirt(Size.XS, 15.50, "зеленый");
        Clothes clothes2 = new Tshirt(Size.XXS, 25.50, "черный");
        Clothes clothes3 = new Pants(Size.L, 30.00, "желтый");
        Clothes clothes4 = new Pants(Size.XXS, 8.25, "красный");
        Clothes clothes5 = new Skirt(Size.M, 12.00, "синий");
        Clothes clothes6 = new Skirt(Size.S, 18.25, "коричневый");
        Clothes clothes7 = new Tie(Size.XXS, 4.50, "черный");
        Clothes clothes8 = new Tie(Size.L, 10.00, "красный");

        Clothes[] clothes = new Clothes[] {clothes1, clothes2, clothes3, clothes4, clothes5, clothes6, clothes7, clothes8};

        Collection.dressMan(clothes);
        System.out.println();
        Collection.dressWoman(clothes);










    }
}

