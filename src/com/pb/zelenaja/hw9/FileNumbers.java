package com.pb.zelenaja.hw9;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileNumbers {
    public static void main(String[] args) throws Exception {
        createNumberFile();
        createOddNumberFile();
    }

    private static void createNumberFile() throws Exception {

        Path path = Files.createFile(Paths.get("D://Java/numbers.txt"));
        try (BufferedWriter writer = Files.newBufferedWriter(path)) {
            int[][] array = new int[10][10];
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length; j++) {
                    array[i][j] = ((int) (Math.random() * 99 + 1));
                    writer.write(array[i][j] + " ");
                }
                writer.write("\r\n");
            }
        } catch (Exception e) {
            System.out.println("Error with file write: " + e);
        }

    }

    private static void createOddNumberFile() throws Exception {

        Path path = Paths.get("D://Java/numbers.txt");

        Scanner s = new Scanner(path);
        int i = 0;
        while (s.hasNextInt()) {
            i++;
            s.nextInt();
        }
        int[] arr = new int[i];
        Scanner s1 = new Scanner(path);
        for (int n = 0; n < arr.length; n++) {
            arr[n] = s1.nextInt();
        }
        for (int n = 0; n < arr.length; n++) {
            if (arr[n] % 2 == 0)
                arr[n] = 0;
        }
        Path path1 = Files.createFile(Paths.get("D://Java/odd-numbers.txt"));
        try (BufferedWriter writer1 = Files.newBufferedWriter(path1)) {
            for (int n = 0; n <= arr.length - 1; n++) {
                if (n % 10 == 0) {
                    writer1.write("\n" + arr[n] + " ");
                } else
                    writer1.write(arr[n] + " ");
            }
        } catch (Exception e1) {
            System.out.println("Error with odd-file write: " + e1);
        }
    }
}





