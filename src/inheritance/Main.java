package inheritance;

public class Main {
    public static void main(String[] args) {
        Parrot bird1 = new Parrot("parrot");
        System.out.println(bird1.displayName());
        bird1.move();
        bird1.sound();
        Eagle bird2 = new Eagle("eagle");
        System.out.println(bird2.displayName());
        bird2.eatingHabit();
        bird2.move();
    }
}
