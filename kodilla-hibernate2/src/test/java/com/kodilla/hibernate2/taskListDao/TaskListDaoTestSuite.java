package com.kodilla.hibernate2.taskListDao;

import com.kodilla.hibernate2.task.Task;
import com.kodilla.hibernate2.task.TaskFinancialDetails;
import com.kodilla.hibernate2.tasklist.TaskList;
import com.kodilla.hibernate2.tasklist.TaskListDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;

    @Test
    void testFindByName() {
        //given
        TaskList taskList = new TaskList("ToDoList", "List with job to do");

        //when
        taskListDao.save(taskList);

        //then
        String listName = taskList.getListName();
        Optional<TaskList> readTaskList = taskListDao.findById(taskList.getId());
        assertTrue(readTaskList.isPresent());

        //cleanUp
        taskListDao.deleteAll();
    }

    @Test
    void testTaskListDaoSaveWithTasks() {
        //Given
        Task task = new Task("Test: Learn Hibernate", 14);
        Task task2 = new Task("Test: Write some entities", 3);
        TaskFinancialDetails tfd = new TaskFinancialDetails(new BigDecimal(20), false);
        TaskFinancialDetails tfd2 = new TaskFinancialDetails(new BigDecimal(10), false);
        task.setTaskFinancialDetails(tfd);
        task2.setTaskFinancialDetails(tfd2);
        TaskList taskList = new TaskList("LISTNAME", "ToDo tasks");
        taskList.getTasks().add(task);
        taskList.getTasks().add(task2);
        task.setTaskList(taskList);
        task2.setTaskList(taskList);

        //When
        taskListDao.save(taskList);
        int id = taskList.getId();

        //Then
        assertNotEquals(0, id);

//        CleanUp
        taskListDao.deleteById(id);

    }


}