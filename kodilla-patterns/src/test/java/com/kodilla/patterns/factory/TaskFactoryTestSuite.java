package com.kodilla.patterns.factory;

import com.kodilla.patterns.factory.tasks.Task;
import com.kodilla.patterns.factory.tasks.TaskFactory;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TaskFactoryTestSuite {

    @Test
    void testTaskFactoryShopping() {
        //given
        TaskFactory task = new TaskFactory();
        //when
        Task shopping = task.makeTask(TaskFactory.SHOPPING);
        //then
        assertEquals("buy some colours", shopping.getTaskName());
        assertEquals("done", shopping.executeTask());
        assertEquals(true, shopping.isTaskExecuted());
    }

    @Test
    void testTaskFactoryPainting() {
        //given
        TaskFactory task = new TaskFactory();
        //when
        Task painting = task.makeTask(TaskFactory.PAINTING);
        //then
        assertEquals("Painting", painting.getTaskName());
        assertEquals("not finished", painting.executeTask());
        assertEquals(false, painting.isTaskExecuted());
    }

    @Test
    void testTaskFactoryDriving() {
        //given
        TaskFactory task = new TaskFactory();
        //when
        Task driving = task.makeTask(TaskFactory.DRIVING);
        //then
        assertEquals("goodbye", driving.getTaskName());
        assertEquals("done", driving.executeTask());
        assertEquals(true, driving.isTaskExecuted());
    }
}
