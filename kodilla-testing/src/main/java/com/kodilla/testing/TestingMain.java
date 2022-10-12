package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;

import java.util.Objects;

public class TestingMain {


    public static void main(String[] args) {



        Calculator calculator = new Calculator();

        int resultAdd = calculator.add(4, 4); {
            System.out.println(resultAdd);
        }

               int resultSubtract = calculator.subtract(8,4); {
            System.out.println(resultSubtract);
        }

        if (Objects.equals(resultSubtract, 4)) {
            System.out.println("test ok!");
        }else {
            System.out.println("Error!");
        }

        if (Objects.equals(resultAdd, 8)) {
            System.out.println("Test Ok!");
        } else {
            System.out.println("Error");
        }
    }
}
