package com.kodilla.stream.array;

public class numbersBoard {

    public static void main(String[] args) {


        int[] value = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        double sum = 0.0;

        int result = value.length;


        for (
                int i = 0;
                i < value.length; i++) {
            sum += value[i];
        }

        double average = sum / result;

        System.out.println("Średnia wynosi " + average + "");
    }
}
