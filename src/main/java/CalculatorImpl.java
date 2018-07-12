/*
 *
 *  (C) Copyright 2017-2018 hSenid Software International (Pvt) Limited.
 *  All Rights Reserved.
 *
 *  These materials are unpublished, proprietary, confidential source code of
 *  hSenid Software International (Pvt) Limited and constitute a TRADE SECRET
 *  of hSenid Software International (Pvt) Limited.
 *
 *  hSenid Software International (Pvt) Limited retains all title to and intellectual
 *  property rights in these materials.
 *
 */

public class CalculatorImpl {

    private static int answer;
    private static int x;
    private static int y;

    CalculatorService calculatorService; //object to refer CalculatorService interface

    /*
     *  parameterized constructor
     * */
    public CalculatorImpl(CalculatorService calculatorService) {

        this.calculatorService = calculatorService;
    }

    public static void main(String[] args) {

        add(1, 1);
        multiply(1, 1);
        minus(1, 1);
        divide(1, 1);
    }

    public static int add(int x, int y) { //will add numbers

        answer = x + y;

        return answer;
    }

    public static int multiply(int x, int y) {//will multiply numbers

        answer = x * y;

        System.out.println("answer" + answer);
        return answer;
    }

    public static int minus(int x, int y) {//will do the minus operand

        answer = x - y;
        System.out.println("answer" + answer);

        return answer;
    }

    public static int divide(int x, int y) {//will divide two numbers

        try {

            answer = x / y;
            System.out.println("answer" + answer);

            return answer;

        } catch (ArithmeticException a) {

            System.out.println("Divition by zero is not possible!!");//if number is going to use zero it display this
        }

        return answer;
    }

}
