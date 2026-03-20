package inheritance;

public class Parrot extends Bird {
    void sound() {
        System.out.println("hellooo");
    }

    public Parrot(String name) {
        super(name);
    }
}
