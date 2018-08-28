package com.java24hours;

public class Modem {
    private int speed;

    public void displaySpeed() {
        System.out.println("Speed: " + getSpeed());
    }

    public void disconnect() { System.out.println("Disconeecting ...");}

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}
