package com.codegym.task.task21.task2113;

public class Horse {
    String name;
    double speed;
    double distance;

    public Horse(String name, double speed, double distance){
        this.name = name;
        this.speed = speed;
        this.distance = distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getDistance() {
        return distance;
    }

    public String getName() {
        return name;
    }

    public double getSpeed() {
        return speed;
    }
    public void move(){
        double random = (double) Math.random()*1;
        distance+=speed*random;
    }
    public void print(){
        int puntos = (int) distance;
        for (int i = 0; i < puntos; i++) {
            System.out.print(".");
        }
        System.out.println(name);
    }
}
