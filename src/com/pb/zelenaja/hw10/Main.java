package com.pb.zelenaja.hw10;

public class Main {
    public static void main(String[] args) throws Exception {

        NumBox<Integer> numBoxInt = new NumBox<>(5);

        numBoxInt.add(4);
        numBoxInt.add(10);
        numBoxInt.add(7);
        numBoxInt.add(2);
        numBoxInt.add(3);
//        numBoxInt.add(6);

        System.out.println("Массив Integer");
        System.out.println();
        System.out.println("Число по массиву: " + numBoxInt.get(0));
//        System.out.println("Число по массиву: " + numBoxInt.get(25));
        System.out.println("Текущее количество элементов массива: " + numBoxInt.length());
        System.out.println("Среднее арифметическое всех элементо массива: " + numBoxInt.average());
        System.out.println("Сумма всех элементов массива: " + numBoxInt.sum());
        System.out.println("Максимальный элемент массива: " + numBoxInt.max());
        System.out.println();

        NumBox<Float> numBoxFlo = new NumBox<>(4);

        numBoxFlo.add(4.5f);
        numBoxFlo.add(2.2f);
        numBoxFlo.add(1.5f);
        numBoxFlo.add(5.1f);

        System.out.println("Массив Float");
        System.out.println();
        System.out.println("Число по массиву: " + numBoxFlo.get(0));
        System.out.println("Текущее количество элементов массива: " + numBoxFlo.length());
        System.out.println("Среднее арифметическое всех элементо массива: " + numBoxFlo.average());
        System.out.println("Сумма всех элементов массива: " + numBoxFlo.sum());
        System.out.println("Максимальный элемент массива: " + numBoxFlo.max());

    }
}

