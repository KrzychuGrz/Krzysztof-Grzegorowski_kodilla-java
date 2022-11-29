package com.kodilla.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public final class Calculator {

    double a = 2;
    double b = 2;

    private Display display;

    private Calculator(final Display display) {
        this.display = display;

    }

    public double add() {
        return display.displayValue(a + b);
    }

    public double sub() {
        return display.displayValue(a - b);
    }

    public double multiply() {
        return display.displayValue(a * b);
    }

    public double divide() {
        return display.displayValue(a / b);
    }

}
