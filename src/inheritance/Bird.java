package inheritance;

public class Bird {
    String name;

    public Bird(String name) {
        this.name = name;
    }

    void move() {
        System.out.println("fly");
    }

    String displayName() {
        return name;
    }
}
