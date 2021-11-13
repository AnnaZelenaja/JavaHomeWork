package com.pb.zelenaja.hw7;

public class Collection {

    static void dressMan(Clothes[] clothes) {
        System.out.println("Мужская одежда (в наличии):");
        for (Clothes clothe : clothes) {
        if (clothe instanceof MenClothes) {
            System.out.println(clothe);
        }
    }
}

    static void dressWoman(Clothes[] clothes) {
        System.out.println("Женская одежда (в наличии):");
        for (Clothes clothe : clothes) {
            if (clothe instanceof WomenClothes) {
                System.out.println(clothe);
            }
        }
    }
}
