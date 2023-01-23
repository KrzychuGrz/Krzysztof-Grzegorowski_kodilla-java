package com.kodilla.hibernate2.manytomany.dao;

import com.kodilla.hibernate2.manytomany.Employee;
import com.kodilla.hibernate2.task.Task;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeeDao extends CrudRepository<Employee, Integer> {

    @Query
    List<Employee> retrieveLastname();

}
