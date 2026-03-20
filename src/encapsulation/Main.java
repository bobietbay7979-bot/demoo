package encapsulation;

public class Main {
    public static void main(String[] args) {
        Student student0 = new Student();
        student0.name = "an";
        student0.setMark(13);
        Student student1 = new Student();
        student1.name = "bình";
        student1.setMark(9);
        Student student2 = new Student();
        student2.name = "tuan";
        student2.setMark(10);
        student0.displayInfo();
        student1.displayInfo();
        student2.displayInfo();
    }
}
