package com.kodilla.patterns.factory.tasks;

public final class ShoppingTask implements Task {

    public final String taskName;
    public final String whatToBuy;
    public final double quantity;

    public ShoppingTask(String taskName, String whatToBuy, double quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public String executeTask() {
        return "done";
    }

    @Override
    public boolean isTaskExecuted() {
        return true;
    }


}
