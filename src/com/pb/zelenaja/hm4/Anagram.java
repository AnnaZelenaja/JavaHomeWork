package com.pb.zelenaja.hm4;

import java.util.Arrays;
import java.util.Scanner;

import static java.util.Arrays.*;

public class Anagram {
    

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Введите строку 1: ");
        String s1 = scan.nextLine();
        System.out.print("Введите строку 2: ");
        String s2 = scan.nextLine();

// Избавляемся от лишних символов в строках
        String s1WithoutSpaces = s1.toLowerCase().replaceAll("[^а-я]+", "");
//        System.out.println(s1WithoutSpaces);
        String s2WithoutSpaces = s2.toLowerCase().replaceAll("[^а-я]+", "");
//        System.out.println(s2WithoutSpaces);

// Создаем из букв массивы
        char[] arr1;
        char[] arr2;
        arr1 = s1WithoutSpaces.toCharArray();
//        s1WithoutSpaces = new String(arr1);
//        System.out.println();
//        System.out.println(s1WithoutSpaces);
        arr2 = s2WithoutSpaces.toCharArray();
//        s2WithoutSpaces = new String(arr2);
//        System.out.println(s2WithoutSpaces);

// Сортируем массивы
        Arrays.sort(arr1);
        String sorted1 = new String(arr1);
//        System.out.println();
//        System.out.println(sorted1);

        Arrays.sort(arr2);
        String sorted2 = new String(arr2);
//        System.out.println(sorted2);
//        System.out.println();

//Сравниваем отсортированные массивы
        while (true) {
            if (sorted1.equals(sorted2) == true) {
                System.out.println("строки являются анаграммами");
                break;
            } else if (sorted1.equals(sorted2) == false) {
                System.out.println("строки не являются анаграммами");
                break;
            }

        }
    }


}


