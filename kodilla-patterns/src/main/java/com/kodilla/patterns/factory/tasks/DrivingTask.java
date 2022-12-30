package com.kodilla.patterns.factory.tasks;

public final class DrivingTask implements Task {

    public String taskName;
    public String where;
    public String using;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
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
