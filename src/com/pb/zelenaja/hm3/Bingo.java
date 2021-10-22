package com.pb.zelenaja.hm3;

import java.util.Random;
import java.util.Scanner;

public class Bingo {
    public static void main(String[] args){

        Scanner keyboard = new Scanner(System.in);
        Random generator = new Random();
        int random;
        random = generator.nextInt(100) + 1;
        int counter = 0;

        System.out.print("Угадай число между 0 и 100, для досрочного завершения введите больше 100");

        while(true) {
            counter++;
            int input_number = keyboard.nextInt();
            if(input_number == random) {
                System.out.println("Вы угадали!");
                System.out.println("Количество попыток: " + counter);
                System.out.println("Игра завершена");
                break;
            } else if (input_number > 100){
                System.out.println("Игра завершена");
                break;
            } else if(input_number > random){
                System.out.println("Ваше число больше задуманного");
            } else{
                System.out.println("Ваше число меньше задуманного");

            }


            }





    }


}

