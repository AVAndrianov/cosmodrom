package com.AVAndrianov.Lesson_2;

import java.util.Arrays;

public class Lesson2 {
    static int[] mass = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24};
    static int[] mass2 = {1, 5, 3, 7, 2, 5, 6, 7};

    public static void main(String[] args) {
        ЬЬЬЬЬ();
    }

    private static void ЬЬЬЬЬ() {
        pissOutOneByOne();
        fillingAnArray();
        multiplicationByTwo();
        twoDimensionalArray();
        minMax();
        System.out.println(checkBalance(mass2));
        System.out.println(Arrays.toString(offsetByNElements(mass, -2)));
    }

    private static void pissOutOneByOne() {
        int[] mass = {0, 1, 1, 1, 0, 1, 1, 0};
        for (int a : mass) {
            a = a == 0 ? 1 : 0;
        }
    }

    private static void fillingAnArray() {
        int[] mass = new int[8];
        int b = 0;
        for (int a : mass) {
            a = b;
            b = b + 3;
        }
    }

    private static void multiplicationByTwo() {
        int[] mass = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int a : mass) {
            a = a < 6 ? a * 2 : a;
        }
    }

    private static void twoDimensionalArray() {
        int[][] mass = new int[6][6];
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass.length; j++) {
                mass[i][j] = i == j ? 1 : 0;
                mass[i][mass.length - 1 - i] = 1;
            }
        }
        for (int i = 0; i <= mass.length-1; i++) {
            System.out.println(Arrays.toString(mass[i]));

        }
    }

    private static void minMax() {
        int[] mass = {-300, 5, 7, 8, 26, 500, -200};
        int min = mass[0], max = mass[0];
        for (int o : mass) {
            max = max > o ? max : o;
            min = min < o ? min : o;
        }
    }

    private static String checkBalance(int[] mass) {
        int j = 1;
        int i = mass.length - 2;
        int a = mass[0];
        int b = mass[mass.length - 1];
        String ret;
        Boolean c;
        while (!(j - 1 == i)) {
            if (a <= b) {
                a = a + mass[j];
                j++;
            } else {
                b = b + mass[i];
                i--;
            }
        }
        c = a == b ? true : false;
        ret = "checkBalance([";
        for (int k = 0; k < mass.length; k++) {
            ret += mass[k];
            if (k != mass.length - 1) ret += ",";
            if (c) ret += k == j - 1 ? "||" : "";
        }
        ret += "]) → " + c;
        return ret;
    }

    private static int[] offsetByNElements(int[] mass, int n) {
        int ml = mass.length - 1;
        int a, b;
        for (int j = 0; j < Math.abs(n); j++) {
            if (n >= 0) {
                a = mass[ml];
                for (int i = ml; i >= 1; i--) mass[i] = mass[i - 1];
                mass[0] = a;
            } else {
                b = mass[0];
                for (int i = 0; i <= ml - 1; i++) mass[i] = mass[i + 1];
                mass[ml] = b;
            }
        }
        return mass;
    }
}