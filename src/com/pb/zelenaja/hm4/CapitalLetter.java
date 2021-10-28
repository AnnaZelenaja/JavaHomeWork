package com.pb.zelenaja.hm4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CapitalLetter {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите текст: ");
        String s = reader.readLine();
//        System.out.println(s);


        String s2 = "";
        s2 = s2 + s.substring(0, 1).toUpperCase();
        for (int i = 1; i < s.length(); i++) {
            if (" ".equals(s.substring(i - 1, i)))
                s2 = s2 + s.substring(i, i + 1).toUpperCase();
            else {
                s2 = s2 + s.substring(i, i + 1);
            }
        }
        System.out.println("Преобразованный текст:");
        System.out.println(s2);
    }
}
