package OOPS.polymorphism;

class A {
    void add(int a, int b) {
        System.out.println("Class A " + (a + b));
    }
}

class B extends A {
    @Override
    void add(int a, int b) {
        System.out.println("Class B " + (a + b));
    }
}

public class overiding {
    public static void main(String[] args) {
        // Creating an object of class B (subclass)
        B b = new B();
        // Calling the overridden method
        b.add(9, 5);
    }
}
