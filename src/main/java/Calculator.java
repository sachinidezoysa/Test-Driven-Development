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

public class Calculator {

    private static int scale;

    private static Constants constants; //object to refer CalculatorService interface

    /*
     *  parameterized constructor
     * */

    public Calculator(Constants constants, int scale) {

        this.scale = scale;
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
    public static int multiplyScalor(int firstNumber, int secondNumber) {

        int answer;

        answer = firstNumber * secondNumber * scale;
        System.out.println("answer" + answer);

        return answer;
    }


    /*
     *  will multiply numbers with gravity
     * */
    public static int multiplyByGravity(int firstNumber, int secondNumber, int z) {

        int answer = firstNumber * secondNumber * constants.getGravity();
        System.out.println("answer" + answer);

        return answer;
    }

    /*
     *  will do the minus operand
     * */
    public static int minus(int firstNumber, int secondNumber) {

        int answer = firstNumber - secondNumber;
        System.out.println("answer" + answer);

        return answer;
    }

    /*
     *  will divide two numbers
     * */
    public static int divide(int firstNumber, int secondNumber) throws ArithmeticException{

        int answer = firstNumber / secondNumber;
        System.out.println("answer" + answer);

        return answer;
    }

}
