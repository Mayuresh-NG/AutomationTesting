// Main.java

public class AccessSpecifierExample {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();
        publicClass.display();

        // Accessing protected and private members from Main class is not allowed
        // ProtectedClass protectedClass = new ProtectedClass(); // Error
        // PrivateClass privateClass = new PrivateClass(); // Error
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
