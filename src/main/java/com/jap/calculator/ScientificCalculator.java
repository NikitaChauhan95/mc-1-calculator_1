package com.jap.calculator;

public class ScientificCalculator {

    public static void main(String[] args) {
        ScientificCalculator scientificCalculator = new ScientificCalculator();
        //Call all the methods one by one and surround them by try and respective catch blocks.
        try {
            scientificCalculator.cielOfANumber(6.5f);
            scientificCalculator.floorOfANumber(7.5f);
            scientificCalculator.power(34, 2);
            scientificCalculator.squareRoot(7);
        } catch (CalculatorException e) {
            throw new RuntimeException(e);
        }

    }

    public double cielOfANumber(float num) throws CalculatorException {
        //check if num is equal to or less than 0 than throw the user defined exception with proper message
        //or else call ceil method of Math class and return the value
        if (num <= 0) {
            throw new CalculatorException("Number must be greater than 0");
        }

        return Math.ceil(num);
    }

    public double floorOfANumber(float num) throws CalculatorException {
        //check if num is equal to or less than 0 than throw the user defined exception with proper message
        //or else call floor method of Math class and return the value
        if (num <= 0) {
            throw new CalculatorException("Number must be greater than 0");
        }
        return Math.floor(num);
    }

    public long power(int num1, int num2) throws CalculatorException {
        //if num1 is less than num2 than throw the user defined exception with proper message
        //else use Math pow method and return the value
        if (num1 < num2) {
            throw new CalculatorException("The num1 must be greater than num2");
        }

        return (long) Math.pow(num1, num2);
    }

    public double squareRoot(int num) throws CalculatorException {
        //check if num is equal to or less than 0 than throw the user defined exception with proper message
        //or else call sqrt method of Math class and return the value
        if (num <= 0) {
            throw new CalculatorException("Number must be greater than 0");
        }


        return Math.sqrt(num);
    }
}
