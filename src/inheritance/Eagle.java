package inheritance;

public class Eagle extends Bird {

    void eatingHabit() {
        System.out.println("hunting");
    }

    public Eagle(String name) {
        super(name);
    }
}
