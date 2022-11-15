package com.kodilla.exception.test;

public class ExceptionHandling {

    public static void main(String[] args) throws Exception {

        try {
            SecondChallenge secondChallenge = new SecondChallenge();
            secondChallenge.probablyIWillThrowException(1.2, 1.5);
        } catch (Exception e) {
            throw new Exception();
        } finally {
            System.out.println("Something is not-yes");
        }
    }
}
