package com.kodilla.patterns.factory.tasks;

public final class PaintingTask implements Task {

    public final String taskName;
    public final String color;
    public final String whatToPaint;

    public PaintingTask(String taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }
    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public String executeTask() {
        return "not finished";
    }

    @Override
    public boolean isTaskExecuted() {
        return false;
    }
}
