package OOPS;

public class AccessSpecifierExample {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();
        publicClass.display();

        // Accessing protected members from another class within the same package
        ProtectedClass protectedClass = new ProtectedClass();
        protectedClass.display();

        PrivateClass pc = new PrivateClass();
        //pc.display(); // Will not work because its private
    }
}

class PublicClass {
    public void display() {
        System.out.println("This is a public method in PublicClass");
    }
}

class ProtectedClass {
    protected void display() {
        System.out.println("This is a protected method in ProtectedClass");
    }
}

class PrivateClass {
    private void display() {
        System.out.println("This is a private method in PrivateClass");
    }
}
