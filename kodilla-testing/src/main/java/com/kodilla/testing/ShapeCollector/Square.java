package com.kodilla.testing.ShapeCollector;

import java.util.Objects;

public class Square implements Shape {

    private String shapeName;
    private double field;

    public Square(String shapeName, double field) {
        this.shapeName = shapeName;
        this.field = field;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Square square = (Square) o;

        if (Double.compare(square.field, field) != 0) return false;
        return Objects.equals(shapeName, square.shapeName);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = shapeName != null ? shapeName.hashCode() : 0;
        temp = Double.doubleToLongBits(field);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    @Override
    public String getShapeName() {
        return null;
    }

    @Override
    public double getField() {
        return Shape.super.getField();
    }
}
