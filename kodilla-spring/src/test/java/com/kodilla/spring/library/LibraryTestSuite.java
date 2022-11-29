package com.kodilla.spring.library;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

@SpringBootTest
public class LibraryTestSuite {

    private Library library;

    @Test
    public void testLoadFromDb() {
        //given
        //when
        library.loadFromDb();
        //then
        //do nothing
    }

    @Test
    public void testSaveToDb() {
        //given
        //when
        library.saveToDb();
        //then
        //do nothing
    }

    @Test
    public void testContext() {
        //given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");

        //when and then
        System.out.println("==== Beans List: ==== >>");
        Arrays.stream(context.getBeanDefinitionNames())
                .forEach(System.out::println);
        System.out.println("<< ==== Beans List ====");
    }
}
