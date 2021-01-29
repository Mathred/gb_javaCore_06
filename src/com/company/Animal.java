package com.company;

public class Animal {
    private String name;
    private String color;
    private int age;
    protected int maxRunDistance;
    protected int maxSwimDistance;
    private static int classInstancesCounter;

    public Animal(String name, String color, int age, int maxRunDistance, int maxSwimDistance){
        this.name = name;
        this.color = color;
        this.age = age;
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
        classInstancesCounter++;
    }

    public Animal(String name, String color, int age, int maxRunDistance){
        this.name = name;
        this.color = color;
        this.age = age;
        this.maxRunDistance = maxRunDistance;
        classInstancesCounter++;
    }

    public void info(){
        System.out.println("name: " + name + " color: " + color + " age: " + age);
    }

    public void run(int distance){
        if (distance < 0){
            System.out.println("Некорректная дальность бега (<0)");
        } else if (distance > maxRunDistance){
            System.out.println("Не могу пробежать так далеко, максимальная дальность: "+ maxRunDistance + " м");
        } else {
            System.out.println(name + " пробежал " + distance + " м");
        }
    }

    public void swim(int distance){
        if (distance < 0){
            System.out.println("Некорректная дальность бега (<0)");
        } else if (distance > maxSwimDistance){
            System.out.println("Не могу пробежать так далеко, максимальная дальность: "+ maxSwimDistance + " м");
        } else {
            System.out.println(name + " проплыл " + distance + " м");
        }
    }

    public void printClassInstancesToConsole(){
        System.out.println("Объектов класса "+  this.getClass().getName() + " и его наследников: "+classInstancesCounter);
    }
}
