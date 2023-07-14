package Lesson_4.Example2;

public class BoxWithNumber<E extends Number> {
    private E[] num;

    public  BoxWithNumber(E... num){
        this.num = num;
    }

    public double average(){
        double result = 0;
        for (int i = 0; i < num.length; i++) {
            result += num[i].doubleValue();
        }
        return result / num.length;
    }

    public boolean compareAverage(BoxWithNumber<E> boxWithNumber2){
        return (this.average() == boxWithNumber2.average());
    }
}
