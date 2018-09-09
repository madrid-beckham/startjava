package com.startjava.lesson_2_3_4.game;

public class Player {
    private String name;
    private int number;
    private int[] saveNumbers={0,0,0,0,0,0,0,0,0,0};
    private int attempts = 10;

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public int[] getSaveNumbers() {
        return saveNumbers;
    }

    public int getAttempts() {
        return attempts;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setSaveNumbers(int[] saveNumbers) {
        this.saveNumbers = saveNumbers;
    }

    public void setAttempts(int attempts) {
        this.attempts = attempts;
    }
}