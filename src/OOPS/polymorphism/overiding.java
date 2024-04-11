package OOPS.polymorphism;

class animal {
    void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends animal {
    // Method overriding
    void makeSound() {
        System.out.println("Dog barks");
    }
}

class Cat extends animal {
    // Method overriding
    void makeSound() {
        System.out.println("Cat meows");
    }
}

public class overiding{
    public static void main(String[] args) {
        animal animal1 = new animal();
        animal1.makeSound(); // Animal makes a sound

        Dog dog = new Dog();
        dog.makeSound(); // Dog barks

        Cat cat = new Cat();
        cat.makeSound(); // Cat meows
    }
}
