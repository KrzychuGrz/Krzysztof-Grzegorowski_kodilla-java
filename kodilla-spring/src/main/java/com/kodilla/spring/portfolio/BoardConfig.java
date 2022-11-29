package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.ArrayList;

@Configuration
public class BoardConfig {

     @Autowired
             @Qualifier("board1")
    Board board;

     @Bean
   public TaskList taskList() {
         return new TaskList(board);
     }

     @Bean(name = "list1")
     @Scope("prototype")
     public Board getListOne () {
         return new Board()
     }





}
