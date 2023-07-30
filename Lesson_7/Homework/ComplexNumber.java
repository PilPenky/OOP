package Lesson_7.Homework;

import java.util.ArrayList;
import java.util.List;

public class ComplexNumber extends AbstractComplexNumber implements Calculable {
    private String primaryArgList;
    private List resResList = new ArrayList();

    public ComplexNumber(String realPartNumber, String signOperation, String imaginaryPartNumber) {
        super(realPartNumber, signOperation, imaginaryPartNumber);
    }

    public ComplexNumber(String primaryArg) {
        this.primaryArgList = primaryArg;
    }

    @Override
    public String sum(String arg) {
        resResList = partNum(primaryArgList);
        for (Object re : partNum(arg)) {
            resResList.add(re);
        }

        double a = (double) resResList.get(0);
        double b = (double) resResList.get(1);
        double c = (double) resResList.get(2);
        double d = (double) resResList.get(3);

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);

        double rightPart = b + d;
        double leftPart = a + c;

        String rightPartString = String.valueOf(rightPart);
        if(rightPartString.matches("[+-]1") || rightPartString.matches("1")){
            if(rightPartString.equals("+1")){
                rightPartString = "+";
            }
            if(rightPartString.equals("-1")){
                rightPartString = "-";
            }
            if(rightPartString.equals("1")){
                rightPartString = "";
            }
        }

        String leftPartString = String.valueOf(leftPart);
        if(leftPartString.matches("0")){
            leftPartString = "";
        }

        System.out.println("rightPart(после реворка): " + b + " + " + d + " = " + rightPartString);
        System.out.println();

        if(rightPart < 0){
            if(rightPartString.equals("0")){
                return primaryArgList = String.valueOf(leftPartString);
            }
            else return primaryArgList = String.valueOf((leftPartString) + "" + rightPartString + "i");
        }
        else {
            if(rightPartString.equals("0")){
                return primaryArgList = String.valueOf(leftPartString);
            }
            else return primaryArgList = String.valueOf((leftPartString) + "+" + rightPartString + "i");
        }
    }

    @Override
    public String multi(String arg) {
        resResList = partNum(primaryArgList);
        for (Object re : partNum(arg)) {
            resResList.add(re);
        }

        double a = (double) resResList.get(0);
        double b = (double) resResList.get(1);
        double c = (double) resResList.get(2);
        double d = (double) resResList.get(3);

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);

        double leftPart = a*c - b*d;
        double rightPart = b*c + a*d;

        String rightPartString = String.valueOf(rightPart);
        if(rightPartString.matches("[+-]1") || rightPartString.matches("1")){
            if(rightPartString.equals("+1")){
                rightPartString = "+";
            }
            if(rightPartString.equals("-1")){
                rightPartString = "-";
            }
            if(rightPartString.equals("1")){
                rightPartString = "";
            }
        }

        String leftPartString = String.valueOf(leftPart);
        if(leftPartString.matches("0")){
            leftPartString = "";
        }

        System.out.println("rightPart(после реворка): " + b + "*" + c + " + " + a + "*" + d + " = " + rightPartString);
        System.out.println();

        if(rightPart < 0){
            if(rightPartString.equals("0")){
                return primaryArgList = String.valueOf(leftPartString);
            }
            else return primaryArgList = String.valueOf((leftPartString) + "" + rightPartString + "i");
        }
        else {
            if(rightPartString.equals("0")){
                return primaryArgList = String.valueOf(leftPartString);
            }
            else return primaryArgList = String.valueOf((leftPartString) + "+" + rightPartString + "i");
        }
    }

    @Override
    public String division(String arg) {
        resResList = partNum(primaryArgList);
        for (Object re : partNum(arg)) {
            resResList.add(re);
        }

        double a = (double) resResList.get(0);
        double b = (double) resResList.get(1);
        double c = (double) resResList.get(2);
        double d = (double) resResList.get(3);

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);

        double leftTop = a*c + b*d;
        double leftDown = c*c + d*d;
        double rightTop = b*c - a*d;
        double rightDown = c*c + d*d;

        double rightPart = rightTop / rightDown;
        double leftPart = leftTop / leftDown;


        String rightPartString = String.valueOf(rightPart);
        if(rightPartString.matches("[+-]1") || rightPartString.matches("1")){
            if(rightPartString.equals("+1")){
                rightPartString = "+";
            }
            if(rightPartString.equals("-1")){
                rightPartString = "-";
            }
            if(rightPartString.equals("1")){
                rightPartString = "";
            }
        }

        String leftPartString = String.valueOf(leftPart);
        if(leftPartString.matches("0")){
            leftPartString = "";
        }

//        System.out.println("rightPart(после реворка): " + b + "*" + c + " + " + a + "*" + d + " = " + rightPartString);
//        System.out.println();

        if(rightPart < 0){
            if(rightPartString.equals("0")){
                return primaryArgList = String.valueOf(leftPartString);
            }
            else return primaryArgList = String.valueOf((leftPartString) + "" + rightPartString + "i");
        }
        else {
            if(rightPartString.equals("0")){
                return primaryArgList = String.valueOf(leftPartString);
            }
            else return primaryArgList = String.valueOf((leftPartString) + "+" + rightPartString + "i");
        }
    }

    @Override
    public List partNum(String list) {
        List num1 = new ArrayList();
        List num2 = new ArrayList();
        String[] numbers = list.replace("i", "").split("");

        int delimiter = 0;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i].equals("+") || numbers[i].equals("-")) {
                delimiter = i;
            }
        }

        for (int i = 0; i < numbers.length; i++) {
            if(i < delimiter){
                num1.add(numbers[i]);
            }
            else num2.add(numbers[i]);
        }

        String leftPart = "";
        for (int i = 0; i < num1.size(); i++) {
            if(num1.get(i).equals("+") || num1.get(i).equals("-") && i == num2.size()-1){
                leftPart += num1.get(i);
                leftPart += "1";
            }
            else {
                leftPart += num1.get(i);
            }
        }

        String rightPart = "";
        for (int i = 0; i < num2.size(); i++) {
            if( (num2.get(i).equals("+") || num2.get(i).equals("-") ) && (i == num2.size()-1)){
                rightPart += num2.get(i);
                rightPart += "1";
            }
            else {
                rightPart += num2.get(i);
            }
        }

        System.out.println("leftPart = " + leftPart);
        System.out.println("rightPart = " + rightPart);

        Double a = Double.parseDouble(leftPart);
        Double b = Double.parseDouble(rightPart);

        List<Double> resList = new ArrayList<>();
        resList.add(a);
        resList.add(b);

        return resList;
    }

    @Override
    public String getResult() {
        return primaryArgList;
    }
}





























