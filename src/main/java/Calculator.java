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

public class Calculator {

    private int z = 10;

    Constants constants; //object to refer CalculatorService interface

    /*
     *  parameterized constructor
     * */

    public Calculator(Constants constants) {

        this.constants = constants;
    }

    public static int add(int x, int y) { //will add numbers

        int answer;

        answer = x + y;
        System.out.println("answer" + answer);

        return answer;
    }

    public static int multiply(int x, int y) {//will multiply numbers

        int answer;

        answer = x * y;
        System.out.println("answer" + answer);

        return answer;
    }

    public static int multiplyStatic(int x, int y, int z) {//will multiply numbers

        int answer;

        answer = x * y * z;
        System.out.println("answer" + answer);

        return answer;
    }

    public static int multiplyCons(int x, int y, int z) {//will multiply numbers

        int answer;

        answer = x * y * Constants.getG();
        System.out.println("answer" + answer);

        return answer;
    }

    public static int minus(int x, int y) {//will do the minus operand

        int answer;

        answer = x - y;
        System.out.println("answer" + answer);

        return answer;
    }

    public static int divide(int x, int y) {//will divide two numbers

        int answer = 0;

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
