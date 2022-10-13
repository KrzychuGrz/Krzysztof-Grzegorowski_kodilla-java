package com.kodilla.testing.collection;

import org.junit.jupiter.api.*;
import com.kodilla.testing.collection.OddNumbersExterminator;


@DisplayName(
        "Test Suite for Odd Numbers Exterminator"
)
class CollectionTestSuite {

    public static void main(String[] args) {

    }

    @BeforeEach
        public void before () {
            System.out.println("Test Case: begin");
        }

        @AfterEach
        public void after () {
            System.out.println("Test Case: end");
        }

        @BeforeAll
        public static void beforeAll () {
            System.out.println("Test Suite: begin");
        }

        @AfterAll
        public static void afterAll () {
            System.out.println("Test Suite: end");
        }

        @DisplayName(
                "When list is empty, then class OddNumberExterminator is still working"
        )

        @Test
        void testOddNumbersExterminatorEmptyList() {

//    given


//    when


//    then

        }
        @DisplayName(
                "when class OddNumbersExterminator contains even numbers and odd numbers, still working correctly"
        )

        @Test
        void testOddNumbersExterminatorNormalList() {

//            given


//    when


//    then
        }
}
