package com.pb.zelenaja.hm2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner Calc = new Scanner(System.in);
        int operand1;
        int operand2;
        String sign;

        System.out.println("Введите число 1: ");
        operand1 = Calc.nextInt();

        System.out.println("Введите число 2: ");
        operand2 = Calc.nextInt();

        System.out.println("Введите тип операции: ");
        sign = Calc.next();

        switch (sign) {
            case "+":
                System.out.println("Ответ: " + (operand1 + operand2));
                break;
            case "-":
                System.out.println("Ответ: " + (operand1 - operand2));
                break;
            case "*":
                System.out.println("Ответ: " + (operand1 * operand2));
                break;
            case "/":
                if (operand2 == 0) {
                    System.out.println("На ноль делить нельзя! Попробуйте еще раз");
                } else {
                    System.out.println("Ответ: " + (operand1 / operand2));}
                    return;


                }

        }
    }

    