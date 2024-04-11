package OOPS.Inheritence;
interface Shape {
    void draw();
}

class Circle implements Shape {
    public void draw() {
        System.out.println("Drawing a circle");
    }
}

class Rectangle implements Shape {
    public void draw() {
        System.out.println("Drawing a rectangle");
    }
}

class Polygon {
    void display() {
        System.out.println("Displaying polygon");
    }
}

class Triangle extends Polygon implements Shape {
    public void draw() {
        System.out.println("Drawing a triangle");
    }
}

public class Hybrid {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.draw();

        Rectangle rectangle = new Rectangle();
        rectangle.draw();

        Triangle triangle = new Triangle();
        triangle.draw();
        triangle.display();
    }
}
