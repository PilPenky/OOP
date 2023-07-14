package Lesson_4.Example2;

public class Main {
    public static void main(String[] args) {
        BoxWithNumber<Integer> boxWithNumber = new BoxWithNumber(1, 2, 3, 4);
        System.out.println("boxWithNumber.average = " + boxWithNumber.average());

        BoxWithNumber<Integer> boxWithNumber2 = new BoxWithNumber(1, 2, 3);
        System.out.println("boxWithNumber.compareAverage = " + boxWithNumber.compareAverage(boxWithNumber2));


    }
}