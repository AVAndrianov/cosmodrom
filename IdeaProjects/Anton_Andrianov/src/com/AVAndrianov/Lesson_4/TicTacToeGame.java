package com.AVAndrianov.Lesson_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TicTacToeGame {
    private String personName = "Anton";
    private String computerName = "Computer";
    private int column = 5;
    private int row = 5;
    private int crossOut = 4;  //Необходимое количество X или O в ряд, для победы
    private String DOT = "•";
    private String CROSS = "X";
    private String NAUGHT = "O";
    private String[][] field = new String[row + 1][column + 1];

    public static void main(String[] args) throws IOException {
        TicTacToeGame toeGame = new TicTacToeGame();
        toeGame.gameProcess();
    }

    private void gameProcess() throws IOException {
        createField();
        System.out.println("TicTacToe");
        int i = 0;
        while (column * row > i * 2) {
            i++;
            if (checkOnTheWinner()) break;
            playerRunning();
//            computer2Running();
            renderingField();
            if (checkOnTheWinner()) break;
            if (column * row < i * 2) break;
            computerRunning();
            renderingField();
        }
        System.out.println("END");
    }

    private boolean checkOnTheWinner() {
        return checkVertical() || checkHorizontal() || checkSideline();
    }

    private boolean checkSideline() {
        for (int i = 0; i < field.length - 1; i++) {
            int xSideline = 0;
            int oSideline = 0;
            for (int j = 0; j < field[0].length - i; j++) {
                if (field[j][j + i].equals(CROSS)) {
                    xSideline++;
                    if (announcementOfTheWinner(xSideline, personName))
                        return true;
                } else {
                    xSideline = 0;
                }
                if (field[j][j + i].equals(NAUGHT)) {
                    oSideline++;
                    if (announcementOfTheWinner(oSideline, computerName))
                        return true;
                } else {
                    oSideline = 0;
                }
            }
            xSideline = 0;
            oSideline = 0;
            for (int j = i; j < field[0].length; j++) {
                if (field[j][j - i].equals(CROSS)) {
                    xSideline++;
                    if (announcementOfTheWinner(xSideline, personName))
                        return true;
                } else {
                    xSideline = 0;
                }
                if (field[j][j - i].equals(NAUGHT)) {
                    oSideline++;
                    if (announcementOfTheWinner(oSideline, computerName))
                        return true;
                } else {
                    oSideline = 0;
                }
            }
            xSideline = 0;
            oSideline = 0;
            for (int j = i; j < field[0].length; j++) {
                if (field[j][field[0].length - j + i - 1].equals(CROSS)) {
                    xSideline++;
                    if (announcementOfTheWinner(xSideline, personName))
                        return true;
                } else {
                    xSideline = 0;
                }
                if (field[j][field[0].length - j + i - 1].equals(NAUGHT)) {
                    oSideline++;
                    if (announcementOfTheWinner(oSideline, computerName))
                        return true;
                } else {
                    oSideline = 0;
                }
            }
            xSideline = 0;
            oSideline = 0;
            for (int j = 1; j < field[0].length - i; j++) {
                if (field[j][field[0].length - j - i].equals(CROSS)) {
                    xSideline++;
                    if (announcementOfTheWinner(xSideline, personName))
                        return true;
                } else {
                    xSideline = 0;
                }
                if (field[j][field[0].length - j - i].equals(NAUGHT)) {
                    oSideline++;
                    if (announcementOfTheWinner(oSideline, computerName))
                        return true;
                } else {
                    oSideline = 0;
                }
            }
        }
        return false;
    }

    private boolean checkHorizontal() {
        for (int i = 0; i < field.length - 1; i++) {
            int xHorizontal = 0;
            int oHorizontal = 0;
            for (int j = 0; j < field[0].length - 1; j++) {
                if (field[i + 1][j + 1].equals(CROSS)) {
                    xHorizontal++;
                    if (announcementOfTheWinner(xHorizontal, personName))
                        return true;
                } else {
                    xHorizontal = 0;
                }
                if (field[i + 1][j + 1].equals(NAUGHT)) {
                    oHorizontal++;
                    if (announcementOfTheWinner(oHorizontal, computerName))
                        return true;
                } else {
                    oHorizontal = 0;
                }
            }
        }
        return false;
    }

    private boolean checkVertical() {
        for (int i = 0; i < field.length - 1; i++) {
            int xVertical = 0;
            int oVertical = 0;
            for (int j = 0; j < field[0].length - 1; j++) {
                if (field[j + 1][i + 1].equals(CROSS)) {
                    xVertical++;
                    if (announcementOfTheWinner(xVertical, personName))
                        return true;
                } else {
                    xVertical = 0;
                }
                if (field[j + 1][i + 1].equals(NAUGHT)) {
                    oVertical++;
                    if (announcementOfTheWinner(oVertical, computerName))
                        return true;
                } else {
                    oVertical = 0;
                }
            }
        }
        return false;
    }

    private boolean announcementOfTheWinner(int line, String name) {
        if (line == crossOut) {
            System.out.println("Winner is " + name);
            return true;
        }
        return false;
    }

    private void createField() {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[0].length; j++) {
                if (i == 0 && j != 0) {
                    field[i][j] = String.valueOf(j);
                } else if (i != 0 && j != 0) {
                    field[i][j] = DOT;
                } else {
                    field[i][j] = String.valueOf(i);
                }
            }
        }
    }

    private void renderingField() {
        System.out.println();
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[0].length; j++) {
                if (i == 0 && j == 0) {
                    System.out.print("  ");
                } else {
                    System.out.print(field[i][j] + " ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }

    private void playerRunning() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите номер строки: ");
        int x = Integer.parseInt(br.readLine());
        System.out.print("Введите номер столбца: ");
        int y = Integer.parseInt(br.readLine());
        if (field[x][y].equals(DOT)) {
            field[x][y] = CROSS;
        }
    }

    private void computerRunning() {
        int[] b;
        while (true) {
            b = artificialIntelligence();
            int x = b[0];
            int y = b[1];
//            if (b[0] == 0 || b[1] == 0) {
//                x = (int) (1 + Math.random() * row);
//                y = (int) (1 + Math.random() * column);
//            }
            if (field[x][y].equals(DOT)) {
                field[x][y] = NAUGHT;
                break;
            }
        }
    }

    private int[] artificialIntelligence() {
//       return aiHorizontalCheck();
//       return aiVerticalCheck();
        return aiSidelineCheck();

    }

    private int[] aiSidelineCheck() {
        int[] coordinates = {0, 0};
        int a = 0;
        int b = 0;
        for (int j = 0; j < field[0].length; j++) {
            for (int i = 0; i < field.length - 1 - j; i++) {
                // По диогонали с лева на право, вверх
                if (!field[i + 1][i + 1 + j].equals(CROSS)) {
                    a++;
                    if (field[i + 1][i + 1 + j].equals(DOT)) {
                        coordinates[0] = i + 1;
                        coordinates[1] = i + j + 1;
                    }
                    if (a == 4) {
                        return coordinates;
                    }
                } else {
                    a = 0;
                }
                // По диогонали с лева на право, вниз
                if (!field[i + 1 + j][i + 1].equals(CROSS)) {
                    b++;
                    if (field[i + 1 + j][i + 1].equals(DOT)) {
                        coordinates[0] = i + 1 + j;
                        coordinates[1] = i + 1;
                    }
                    if (b == 4) {
                        return coordinates;
                    }
                } else {
                    b = 0;
                }
            }
            a = 0;
            b = 0;
        }
        return coordinates;
    }

    private int[] aiVerticalCheck() {
        int[] b = {0, 0};
        int a = 0;
        for (int i = 0; i < field.length - 1; i++) {
            for (int j = 0; j < field[0].length - 1; j++) {
                if (!field[j + 1][i + 1].equals(CROSS)) {
                    a++;
                    if (field[j + 1][i + 1].equals(DOT)) {
                        b[0] = j + 1;
                        b[1] = i + 1;
                    }
                    if (a == 4) {
                        return b;
                    }
                } else {
                    a = 0;
                }
            }
            a = 0;
        }
        return b;
    }

    private int[] aiHorizontalCheck() {
        int[] b = {0, 0};
        int a = 0;
        for (int i = 0; i < field.length - 1; i++) {
            for (int j = 0; j < field[0].length - 1; j++) {
                if (!field[i + 1][j + 1].equals(CROSS)) {
                    a++;
                    if (field[i + 1][j + 1].equals(DOT)) {
                        b[0] = i + 1;
                        b[1] = j + 1;
                    }
                    if (a == 4) {
                        return b;
                    }
                } else {
                    a = 0;
                }
            }
            a = 0;
        }
        return b;
    }

    private void computer2Running() {
        while (true) {
            int x = (int) (1 + Math.random() * row);
            int y = (int) (1 + Math.random() * column);
            if (field[x][y].equals(DOT)) {
                field[x][y] = CROSS;
                break;
            }
        }
    }
}