package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoggerTestSuite {

    private Logger logger;
    @Test
    void testGetLastLog() {
        //given
        logger = Logger.INSTANCE;
        logger.log("it's not working, it's fucked");

        //when
        String lastLog = logger.getLastLog();

        //then
        assertEquals("it's not working, it's fucked", lastLog);


    }

}
