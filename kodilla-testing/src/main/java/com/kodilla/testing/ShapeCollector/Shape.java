package com.kodilla.testing.ShapeCollector;

public interface Shape {

    public default String getShapeName() {
        return null;
    }

    public default double getField() {
        return 0.0;
    }


}
