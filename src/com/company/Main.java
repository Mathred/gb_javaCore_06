package com.company;

public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat("Барсик", "Черный", 3);
        Cat cat2 = new Cat("Барсик2", "Черный", 3);
        Dog dog1 = new Dog("Шарик", "Белый", 4);
        cat.info();
        dog1.info();
        cat.run(200);
        dog1.run(150);
        cat.run(-1);
        dog1.run(200);
        cat.swim(10);
        dog1.swim(10);
        dog1.swim(-1);
        dog1.swim(20);

        cat.printClassInstancesToConsole();
        dog1.printClassInstancesToConsole();
        Animal animal = new Animal("Животное", "Разноцветное", 100, 0, 0);
        animal.printClassInstancesToConsole();
    }
}
