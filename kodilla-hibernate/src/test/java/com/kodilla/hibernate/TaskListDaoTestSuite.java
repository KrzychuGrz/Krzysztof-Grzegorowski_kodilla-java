package com.kodilla.hibernate;

import com.kodilla.hibernate.tasklist.TaskList;
import com.kodilla.hibernate.tasklist.TaskListDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class TaskListDaoTestSuite {

    @Autowired
    private TaskListDao taskListDao;

    @Test
    void testFindByName() {
        //given
        TaskList taskList = new TaskList(1, "ToDoList", "List with job to do");

        //when
        taskListDao.save(taskList);

        //then
        String listName = taskList.getListName();
        Optional<TaskList> readTaskList = taskListDao.findByListName(listName);
        assertTrue(readTaskList.isPresent());

        //cleanUp
//        taskListDao.deleteById(taskList.getId());



    }
}
