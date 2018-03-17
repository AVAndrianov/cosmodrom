package com.AVAndrianovCP.CosmoPort.Roсket;

public class Rocket {

    private String name;

    private String model; // модель

    private String weight;// вес

    private String administration; //управление

    private String typeofmotor; // тип двиготеля

    private int creationyea; // год создания

    private int launchyear; // год запуска

    private int step; // ступени


    public Rocket(String name) {
        this.name = name;
    }


    public Rocket(String name, String model, String weight, int creationYear, int launchYear, int step, String typeOfMotor, String administration) {
        this.name = name;
        this.model = model;
        this.weight = weight;
        this.creationyea = creationYear;
        this.launchyear = launchYear;
        this.step = step;
        this.typeofmotor = typeOfMotor;
        this.administration = administration;
    }
}
