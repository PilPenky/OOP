package Lesson_5.Example2;

public class Main {
    public static void main(String[] args) {
        class Point{  // Локальный класс. Такой класс существует внутри блока кода и время его жизни ограниченно этим блоком.
            int x;

            public Point(int x) {
                this.x = x;
            }

            @Override
            public String toString() {
                return "Point{" +
                        "x=" + x +
                        '}';
            }
        }
        Point point = new Point(3);
        System.out.println("point = " + point);
    }
}
