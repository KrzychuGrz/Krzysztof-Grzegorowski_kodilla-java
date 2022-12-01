package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.scheduling.config.Task;

@Configuration
public class BoardConfig {

    @Bean
    @Scope("prototype")
    public Board board() {
        return new Board(getListOne(), getListTwo(), getListThree());
    }

     @Bean(name = "list1")
     @Scope("prototype")
     public TaskList getListOne() {
         return new TaskList();
     }

     @Bean(name = "list2")
    @Scope("prototype")
    public TaskList getListTwo() {
         return new TaskList();
     }

     @Bean(name = "list3")
    @Scope("prototype")
    public TaskList getListThree() {
         return new TaskList();
     }





}
