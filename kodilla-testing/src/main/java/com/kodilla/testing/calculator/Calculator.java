package com.kodilla.testing.calculator;

public class Calculator {

    private int numX;
    private int numY;


    public void Calculator(int numX, int numY) {
        this.numX = numX;
        this.numY = numY;
    }

    public int getNumX() {
        return numX;
    }

    public int getNumY() {
        return numY;
    }

    public int add(int getNumX, int getNumY) {
        return getNumX + getNumY;
    }

    public int subtract(int getNumX, int getNumY) {
        return getNumX - getNumY;
    }

}

