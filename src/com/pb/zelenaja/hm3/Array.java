package com.pb.zelenaja.hm3;

import java.util.Arrays;
import java.util.Random;


public class Array {
    public static void main(String[] args) {


        Random random = new Random();
        int[] arr = new int[10];
        int sum = 0;
        int count = 0;
        System.out.println("Исходный массив:");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10);
            System.out.print(arr[i] + ", ");

        }
        for (int j : arr) {
            sum = sum + j;
        }
        System.out.println();
        System.out.println("Сумма элементов массива равна: " + sum);


        for (int j : arr) {
            if (j > 0)
                count++;
        }

        System.out.println();
        System.out.println("Количество положительных элементов массива равна: " + count);



        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < arr.length-1; i++) {
                if(arr[i] > arr[i+1]){
                    isSorted = false;

                    buf = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = buf;
                }
            }
        }
        System.out.println();
        System.out.println("Массив после сортировки пузырьком:");
        System.out.println(Arrays.toString(arr));





    }


}





