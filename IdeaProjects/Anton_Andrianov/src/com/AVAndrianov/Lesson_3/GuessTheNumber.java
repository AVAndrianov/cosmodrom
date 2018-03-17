package com.AVAndrianov.Lesson_3;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class GuessTheNumber {

    public static void main(String[] args) throws IOException {
        guessTheNumber();
    }

    private static void guessTheNumber() throws IOException {
        int playerVariant = -1;
        int repeatGame = -1;
        int edgeNumber = 9;
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        while (repeatGame != 0) {
            int attempts = 3;
            int number = new Random().nextInt(edgeNumber + 1);
            System.out.printf("Угадай число от 0 до %s, попыток у тебя - %d %c", edgeNumber, attempts, '\n');
            while (playerVariant != number && attempts != 0) {
                try {
                    playerVariant = Integer.parseInt(bf.readLine());
                    System.out.println((playerVariant == number) ? "Победа!" :
                            ((playerVariant < number) ? "Загаданное число больше" : "Загаданное число меньше"));
                    attempts--;
                } catch (Exception e) {
                    System.out.println("Введенное значение выходит за рамки допустимых. Попробуй еще раз.");
                }
            }
            System.out.println("\nПовторить игру еще раз? 1 – да / 0 – нет");
            while (repeatGame != 0) {
                try {
                    repeatGame = Integer.parseInt(bf.readLine());
                    if (repeatGame == 1) {
                        break;
                    }
                    if (repeatGame < 0 || repeatGame > 1) {
                        throw new Exception("Введенное значение выходит за рамки допустимых. 1- да 0 -нет");
                    }
                } catch (Exception e) {
                    System.out.println("Введенное значение выходит за рамки допустимых. Попробуй еще раз.");
                }
            }
        }
        bf.close();
    }
}