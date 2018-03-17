package com.AVAndrianov.Lesson_5;

import java.text.MessageFormat;

public class Associate {
    private String fullName;
    private String position;
    private String email;
    private String phoneNumber;
    private int salary;
    private int age;

    public int getAge() {
        return age;
    }

    public void info() {
        String info = "{0}\nдолжность {1}\nадрес электронной почты {2}\n" +
                "телефонный номер {3}\nзарплата {4}\nвозраст {5}";
        System.out.println(MessageFormat.format(info, fullName, position, email, phoneNumber, salary, age));
    }

    public Associate(String fullName, String position, String email, String phoneNumber, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }
}