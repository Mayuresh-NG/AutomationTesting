package OOPS.Inheritence;
class A {
    void methodA() {
        System.out.println("Inside methodA of class A");
    }
}

class B extends A {
    void methodB() {
        System.out.println("Inside methodB of class B");
    }
}

class C extends B {
    void methodC() {
        System.out.println("Inside methodC of class C");
    }
}

public class Multilevel {
    public static void main(String[] args) {
        C obj = new C();
        obj.methodA(); // Method from class A
        obj.methodB(); // Method from class B
        obj.methodC(); // Method from class C
    }
}
