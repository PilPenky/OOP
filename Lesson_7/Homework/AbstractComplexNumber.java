package Lesson_7.Homework;

import java.util.List;

public abstract class AbstractComplexNumber {
    private String realPartNumber;
    private String signOperation;
    private String imaginaryPartNumber;

    public AbstractComplexNumber(String realPartNumber, String signOperation, String imaginaryPartNumber) {
        this.realPartNumber = realPartNumber;
        this.signOperation = signOperation;
        this.imaginaryPartNumber = imaginaryPartNumber;
    }
    public AbstractComplexNumber() {
    }
    public String getRealPartNumber() {
        return realPartNumber;
    }
    public void setRealPartNumber(String realPartNumber) {
        this.realPartNumber = realPartNumber;
    }
    public String getSignOperation() {
        return signOperation;
    }
    public void setSignOperation(String signOperation) {
        this.signOperation = signOperation;
    }
    public String getImaginaryPartNumber() {
        return imaginaryPartNumber;
    }
    public void setImaginaryPartNumber(String imaginaryPartNumber) {
        this.imaginaryPartNumber = imaginaryPartNumber;
    }

    public abstract List partNum(String list);
}
