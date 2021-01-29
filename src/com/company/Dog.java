package com.company;

public class Dog extends Animal{

    private static int dogClassInstancesCounter;

    public Dog(String name, String color, int age) {
        super(name,
                color,
                age,
                150,
                10);
        dogClassInstancesCounter++;
    }

    @Override
    public void printClassInstancesToConsole() {
        System.out.println("Объектов класса "+  this.getClass().getName() +": "+dogClassInstancesCounter);
    }
}
