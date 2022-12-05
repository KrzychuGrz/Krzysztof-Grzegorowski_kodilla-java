package com.kodilla.patterns.enums.kpn;

import java.util.Scanner;

class UserDialogs {

    public static UserSelection getUserSelection() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter your choice: (S)cissors, (P)aper, (R)ock ");
            String s = scanner.nextLine().toUpperCase();
            switch (s) {
                case "S":
                    return UserSelection.SCISSORS;
                case "P":
                    return UserSelection.PAPER;
                case "R":
                    return UserSelection.ROCK;
                default:
                    System.out.println("Your selection is wrong, try again");
            }
        }
    }
}
