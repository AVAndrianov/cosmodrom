package com.AVAndrianov.Lesson_5;

public class Main {
    public static void main(String[] args) {
        Associate[] associates = new Associate[5];
        associates[0] = new Associate("Назарова Анастаия Владимировна",
                "Менеджер", "naz@gmail.com", "86567567754", 120000, 30);

        associates[1] = new Associate("Капралов Сергей Евгеньевич",
                "Директор", "Kapralov@gmail.com", "89162678754", 70000, 41);

        associates[2] = new Associate("Андрианов Антон Викторович",
                "Программист", "A.V.Andrianov@gmail.com", "89162686503", 150000, 33);

        associates[3] = new Associate("Исаков Сергей Петрович",
                "Водитель", "Isakov@gmail.com", "8965675754", 100000, 56);

        associates[4] = new Associate("Калинин Михаил Васильевич",
                "Экономист", "Kalinin@gmail.com", "8232782754", 60000, 45);
        for (int i = 0; i < associates.length; i++) {
            if (associates[i].getAge() > 40) {
                associates[i].info();
                System.out.println();
            }
        }
    }
}