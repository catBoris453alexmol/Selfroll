package ru.sapteh;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main( String[] args ) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите число");
        String read = reader.readLine();
        int n = Integer.parseInt(read);
        System.out.println(num(n));


    }
    public static int[] initArray(int n) {
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = i;


        }
        return result;
    }

    public static int num(int numInt) {
        if (numInt > 0) {
            System.out.println(" Положительное число");
        } else
            System.out.println(" Отрицательное число");

        return numInt;
    }

}

