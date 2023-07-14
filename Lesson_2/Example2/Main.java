package Lesson_2.Example2;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
                new HomeCat("barsik", "Cat", 100, 23),
                new Dog("Bobik", "qwe", 10000, 20000),
                new Tiger("Tigra", "qwe", 0, 15),
                new Cat("Просто кот", "asdasdasdaad", 10, 10)
        };
        for (Animal animal : animals) {
            animal.run(150);
            animal.swim(20);
        }
        System.out.println("Animal.count = " + Animal.count);
        System.out.println("Cat.count = " + Cat.count);
        System.out.println("Tiger.count = " + Tiger.count);
        System.out.println("Dog.count = " + Dog.count);
        System.out.println("HomeCat.count = " + HomeCat.count);
    }

}