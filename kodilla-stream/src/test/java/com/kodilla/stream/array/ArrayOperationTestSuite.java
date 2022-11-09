package com.kodilla.stream.array;

import org.junit.jupiter.api.Test;

import java.util.OptionalDouble;
import java.util.stream.IntStream;
import static org.junit.jupiter.api.Assertions.*;

public class ArrayOperationTestSuite {

    @Test
    void testGetAverage() {

        //given
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        double sum = 0.0;

        //when
        int result = numbers.length;
//        for (int i = 0; i < numbers.length; i++) {
//            sum += numbers[i];
//        }

        //then
        OptionalDouble avg = IntStream.range(0, numbers.length)
                                .average();
        assertEquals(9.5, avg.getAsDouble());
    }
}