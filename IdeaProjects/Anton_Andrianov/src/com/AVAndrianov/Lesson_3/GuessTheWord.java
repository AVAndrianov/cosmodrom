package com.AVAndrianov.Lesson_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GuessTheWord {
    private static String[] words = {"apple", "orange", "lemon", "banana", "apricot",
            "avocado", "broccoli", "carrot", "cherry", "garlic", "grape",
            "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea",
            "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

    public static void main(String[] args) throws IOException {
        guessTheWord();
    }

    private static void guessTheWord() throws IOException {
        String theWord = words[(int) (Math.random() * words.length)];
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String playerResponseOption = "";
        String concurrences = "***************";
        System.out.println("Введите вариант");
        StringBuilder sb = new StringBuilder(concurrences);
        while (true) {
            playerResponseOption = br.readLine();
            int size = theWord.length() <= playerResponseOption.length() ? theWord.length() : playerResponseOption.length();
            for (int i = 0; i <= size - 1; i++) {
                if (theWord.charAt(i) == playerResponseOption.charAt(i)) {
                    sb.setCharAt(i, theWord.charAt(i));
                }
            }
            if (playerResponseOption.equals(theWord)) break;
            System.out.println(sb);
        }
        System.out.println("Угадал");
    }
}