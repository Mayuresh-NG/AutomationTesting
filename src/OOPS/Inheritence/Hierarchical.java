package OOPS.Inheritence;

class Animals {
    void eat() {
        System.out.println("Animal is eating");
    }
}

class Dog extends Animals {
    void bark() {
        System.out.println("Dog is barking");
    }
}

class Cat extends Animals {
    void meow() {
        System.out.println("Cat is meowing");
    }
}

public class Hierarchical {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();  // Animal is eating
        dog.bark(); // Dog is barking

        Cat cat = new Cat();
        cat.eat();  // Animal is eating
        cat.meow(); // Cat is meowing
    }
}
