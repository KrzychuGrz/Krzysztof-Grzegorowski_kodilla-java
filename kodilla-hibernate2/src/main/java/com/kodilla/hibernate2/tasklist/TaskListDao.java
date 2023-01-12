package com.kodilla.hibernate2.tasklist;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;


public interface TaskListDao extends CrudRepository <TaskList, Integer> {
    Optional<TaskList> findByListName(String listName);
}