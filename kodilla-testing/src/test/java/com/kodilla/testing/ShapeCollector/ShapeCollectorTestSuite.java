//package com.kodilla.testing.ShapeCollector;
//
//import com.kodilla.testing.ShapeCollector.Circle;
//import com.kodilla.testing.ShapeCollector.ShapeCollector;
//import com.kodilla.testing.ShapeCollector.Square;
//import com.kodilla.testing.ShapeCollector.Triangle;
//import org.junit.jupiter.api.*;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@DisplayName("Shape Collector tests")
//
//public class ShapeCollectorTestSuite {
//
//    public static int testCounter = 0;
//
//    @BeforeAll
//    public static void beforeAllTests() {
//        System.out.println("This is the beginning of tests");
//    }
//
//    @AfterAll
//    public static void afterAllTests() {
//        System.out.println("All tests are finished");
//    }
//
//    @BeforeEach
//    public void beforeEveryTest() {
//        testCounter++;
//        System.out.println("Preparing to execute test#:" + testCounter);
//    }
//
//    @Test
//        //1
//    void addShapeToCollection() {
//        //given
//        Triangle triangle = new Triangle("Triangle", 20.5);
//        Square square = new Square("Square", 25);
//        Circle circle = new Circle("Circle", 30.5);
//
//        //when
//        List<String> shapeCollector = new ArrayList<>();
//        ShapeCollector.addFigure(triangle);
//        ShapeCollector.addFigure(square);
//        ShapeCollector.addFigure(circle);
//
//        //then
//        Assertions.assertEquals(shapeCollector.size() == 3, shapeCollector.size());
//    }
//
//    @Test
//        //2
//    void removeShapeFromCollection() {
//        //given
//
//        Triangle triangle = new Triangle("Triangle", 20.5);
//        Square square = new Square("Square", 25);
//        Circle circle = new Circle("Circle", 30.5);
//
//        //when
//        List<String> shapeCollector = new ArrayList<>();
//        ShapeCollector.removeFigure(triangle);
//        ShapeCollector.removeFigure(square);
//        ShapeCollector.removeFigure(circle);
//
//        //then
//        Assertions.assertEquals(shapeCollector.size() == 3, shapeCollector.isEmpty());
//    }
//
//    @Test
//        //3
//    void getFigureFromCollection() {
//        //given
//        Triangle triangle = new Triangle("Triangle", 20.5);
//        Square square = new Square("Square", 25);
//        Circle circle = new Circle("Circle", 30.5);
//
//        //when
//        List<String> shapeCollector = new ArrayList<>();
//
//        System.out.println("Element nr 2 of shapeCollector is" + shapeCollector.get(2));
//
//        //then
//        Assertions.assertEquals("circle", shapeCollector.); //dopisać/dopytać
//
//    }
//
//    @Test
//        //4
//    void showAllFigures() {
////given
//        Triangle triangle = new Triangle("Triangle", 20.5);
//        Square square = new Square("Square", 25);
//        Circle circle = new Circle("Circle", 30.5);
//
//        //when
//        List<String> shapeCollector = new ArrayList<>();
//        for (String figure : shapeCollector) {
//            System.out.println("List of figures:" + figure);
//
//            //then
//            Assertions.assertEquals("Triangle, Square, Circle", shapeCollector.contains(triangle));
//        }
//    }
//}
//
//
