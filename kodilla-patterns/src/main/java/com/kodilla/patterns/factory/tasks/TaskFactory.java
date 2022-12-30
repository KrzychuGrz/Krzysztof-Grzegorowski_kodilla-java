package com.kodilla.patterns.factory.tasks;

public class TaskFactory {

    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task makeTask(final String taskClass) {
        return switch (taskClass) {
            case SHOPPING -> new ShoppingTask("buy some colours", "red paint and black paint", 5.0);
            case PAINTING -> new PaintingTask("Painting", "red", "kitchen");
            case DRIVING -> new DrivingTask("goodbye", "airport", "cargo dog sledge");
            default -> null;

        };
    }
}
