package com.kodilla.spring.portfolio;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class BoardTestSuite {

    @Test
    void testTaskAdd() {
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);

        //when
        TaskList list1 = board.getToDoList();
        list1.tasks.add("learn some fxxxing Java");
        list1.tasks.add("clean monitor");
        TaskList list2 = board.getDoneList();
        list2.tasks.add("laundry");
        TaskList list3 = board.getInProgressList();
        list3.tasks.add("clean car");

        //then
        System.out.println("To do List " + list1.getTasks());
        System.out.println("Done List: " +list2.getTasks());
        System.out.println("In Progress List: " +list3.getTasks());

        }

    }

