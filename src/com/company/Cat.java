package com.company;

public class Cat extends Animal {

private static int catClassInstancesCounter;

    public Cat(String name, String color, int age) {
        super(name,
                color,
                age,
                200,
                0);
        catClassInstancesCounter++;
    }

    @Override
    public void swim(int distance) {
        System.out.println("Коты почему-то не умеют плавать :( ");;
    }

    @Override
    public void printClassInstancesToConsole() {
        System.out.println("Объектов класса "+  this.getClass().getName() +": "+catClassInstancesCounter);
    }
}