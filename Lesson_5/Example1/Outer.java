package Lesson_5.Example1;

public class Outer { // Внешний класс

    public Outer(int outerValue) {
        this.outerValue = outerValue;
    }

    public Outer() {
    }

    class Inner {  // Внутренний класс
        int innerValue;

        public Inner(int innerValue) {
            this.innerValue = innerValue;
        }

        public void innerMethod() {     // Внутренний класс видит методы и поля внешнего класса
            System.out.println(innerValue);
            innerMethod();
        }
    }

    static class InnerTwo {  // Вложенный класс - статичный, то есть является самотоятельным, хоть и находится внутри класса Outer.
        int innerValue;

        public InnerTwo(int innerValue) {
            this.innerValue = innerValue;
        }

        public InnerTwo() {
        }

        public void innerMethod() {
            System.out.println(innerValue);
//            innerMethod();
        }
    }

    int outerValue;

    public void outerMethod() {
        System.out.println(outerValue);
//        System.out.println(innerValue);   // Внешний класс НЕ видит методы и поля внутреннего класса
//        innerMethod();                    // Внешний класс НЕ видит методы и поля внутреннего класса
    }

    public static void main(String[] args) {
        Inner inner = new Outer().new Inner(10);
        InnerTwo  innerTwo = new InnerTwo();

    }

}