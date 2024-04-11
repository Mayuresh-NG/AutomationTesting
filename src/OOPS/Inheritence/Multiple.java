package OOPS.Inheritence;

interface One {
    void methodA();
}

interface Two {
    void methodB();
}

class Three implements One, Two {
    public void methodA() {
        System.out.println("Inside methodA of class C");
    }

    public void methodB() {
        System.out.println("Inside methodB of class C");
    }

    void methodC() {
        System.out.println("Inside methodC of class C");
    }
}

public class Multiple {
    public static void main(String[] args) {
        Three obj = new Three();
        obj.methodA(); // Method from interface A
        obj.methodB(); // Method from interface B
        obj.methodC(); // Method from class C
    }
}
