package com.kodilla.hibernate2.tasklist;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.Optional;

@Transactional
@Repository
public interface TaskListDao extends CrudRepository <TaskList, Integer> {
    Optional<TaskList> findByListName(String listName);
}