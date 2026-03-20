package polymorphism;

public class Main {
    public static void main(String[] args) {
        Shape shape1 = new Rectangle();
        shape1.zone();
        Shape shape2 = new Triangle();
        shape2.zone();
    }
}
