package com.pb.zelenaja.hm2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int number;

        System.out.println("Введите число: ");
        number = in.nextInt();

            if (number < 0 || number > 100) {
                System.out.println("Число не входит в интервал (0-100)");
            } else if (number >= 51) {
                System.out.println("51-100");
            } else if (number >= 36) {
                System.out.println("36-50");
            } else if (number >= 15) {
                System.out.println("15-35");
            } else System.out.println("0-14");

        }

    }
