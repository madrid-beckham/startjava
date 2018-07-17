package com.startjava.Lesson_2_3.robot;

public class Jaeger {
    private String mark;
    private String modelName;
    private String status;
    private double height;
    private double weight;
    private int strenght;
    private int armor;

    public Jaeger(String mark, String modelName, String status, double height, double weight, int strenght, int armor) {
        this.mark = mark;
        this.modelName = modelName;
        this.status = status;
        this.height = height;
        this.weight = weight;
        this.strenght = strenght;
        this.armor = armor;
    }

    public String getMark() {
        return mark;
    }

    public String getModelName() {
        return modelName;
    }

    public String getStatus() {
        return status;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public int getStrenght() {
        return strenght;
    }

    public int getArmor() {
        return armor;
    }

    public int attack(int armor, int strenght) {
        return strenght - armor;
    }
}
