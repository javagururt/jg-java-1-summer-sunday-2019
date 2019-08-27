package com.javaguru.lessons.homework;

class AnimalTest {

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.setName("Vasya");
        animal.setBirthday("1980");
        animal.sound();

        Mammal mammal = new Mammal();
        mammal.setName("Mammal Vasya");
        mammal.setBirthday("Mammal 1990");
        mammal.countOfKids = 5;
        mammal.breed = "something strange";
        mammal.setColor("Black");
        mammal.sound();
        System.out.println("==============");

        Animal secondAnimal = new Animal();
        secondAnimal.sound();
        Animal thirdAnimal = new Mammal();
        thirdAnimal.sound();

        Dog dog = new Dog();
        dog.sound();
        dog.setWeight(200);

        Animal secondDog = new Dog();
        secondDog.sound();
    }
}
