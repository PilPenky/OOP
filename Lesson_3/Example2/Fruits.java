package Lesson_3.Example2;

public enum Fruits {
    APPLE(1), ORANGE(2), PEACH(3);

    private final int number;

    Fruits(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }
}
