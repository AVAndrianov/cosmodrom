package com.AVAndrianov.Lesson_1;

public class Lesson1 {
    public static void main(String[] args) {
        int a = 0;
        long b = 255L;
        float c = 20.10f;
        double d = 10.20;
        String text = "text";
        boolean bool = true;

        System.out.println(calc(1, 2, 3, 4));
        System.out.println(compare(5, 6));
        moreOrLessThenZero(0);
        System.out.println(negativeNumber(10));
        helloMan("Антон");
        leapYear(1001);
    }

    private static double calc(double a, double b, double c, double d) {
        return a * (b + (c / d));
    }

    private static boolean compare(int a, int b) {
        return a + b <= 20 && a + b >= 10 ? true : false;
    }

    private static void moreOrLessThenZero(int a) {
        System.out.println(a == 0 ? "Введен 0" : a < 0 ? "Отрицательное" : "Положительное");

    }

    private static boolean negativeNumber(int a) {

        return a < 0 ? true : false;
    }

    private static void helloMan(String name) {
        System.out.println("Привет, " + name + "!");

    }

    private static void leapYear(double a) {
        System.out.println(((a / 4 % 1 == 0) && !(a / 100 % 1 == 0)) || (a / 400 % 1 == 0) ? (int) a + " Високосный год" : (int) a + " Не високосный год");
    }

}
