package Lesson_7.Homework;

public class CalculableFactory implements ICalculableFactory {
    public Calculable create(String primaryArg) {
        return new ComplexNumber(primaryArg);
    }
}
