package encapsulation;

public class Student {
    String name;
    private int mark;

    public Student() {
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        if (mark >= 0 && mark <= 10) {
            this.mark = mark;
        } else {
            throw new IllegalArgumentException("ellegal mark");
        }
    }

    void displayInfo() {
        System.out.println("Name: " + name + ", Mark: " + mark);
    }
}
