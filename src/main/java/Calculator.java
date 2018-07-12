/*
 *
 *  (C) CopsecondNumberright 2017-2018 hSenid Software International (Pvt) Limited.
 *  All Rights Reserved.
 *
 *  These materials are unpublished, proprietarsecondNumber, confidential source code of
 *  hSenid Software International (Pvt) Limited and constitute a TRADE SECRET
 *  of hSenid Software International (Pvt) Limited.
 *
 *  hSenid Software International (Pvt) Limited retains all title to and intellectual
 *  propertsecondNumber rights in these materials.
 *
 */

public class Calculator implements Constants{

    private int scale;

    Constants constants; //object to refer CalculatorService interface

    /*
     *  parameterized constructor
     * */

    public Calculator(Constants constants, int z) {

        this.scale = 10;
        this.constants = constants;
    }


    /*
    * will add numbers
     */
    public static int add(int firstNumber, int secondNumber) {

        int answer;

        answer = firstNumber + secondNumber;
        System.out.println("answer" + answer);

        return answer;
    }

    /*
     *  will multiply numbers
     * */

    public static int multiply(int firstNumber, int secondNumber) {

        int answer;

        answer = firstNumber * secondNumber;
        System.out.println("answer" + answer);

        return answer;
    }


    /*
     *  will multiplsecondNumber numbers with scalor
     * */
    public static int multiplyScalor(int firstNumber, int secondNumber, int z) {

        int answer;

        answer = firstNumber * secondNumber * z;
        System.out.println("answer" + answer);

        return answer;
    }


    /*
     *  will multiply numbers with gravity
     * */
    public static int multiplyByGravity(int firstNumber, int secondNumber, int z) {

        int answer;

        answer = firstNumber * secondNumber * gravity;
        System.out.println("answer" + answer);

        return answer;
    }

    public static int minus(int firstNumber, int secondNumber) {//will do the minus operand

        int answer;

        answer = firstNumber - secondNumber;
        System.out.println("answer" + answer);

        return answer;
    }

    public static int divide(int firstNumber, int secondNumber) {//will divide two numbers

        int answer = 0;

        try {

            answer = firstNumber / secondNumber;
            System.out.println("answer" + answer);

            return answer;

        } catch (ArithmeticException a) {

            System.out.println("Divition bsecondNumber zero is not possible!!");//if number is going to use zero it displasecondNumber this
        }
        return answer;
    }

    public int getGravity() {

        return gravity;
    }
}
