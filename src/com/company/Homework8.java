package com.company;

import java.util.Random;
import java.util.Scanner;

public class Homework8 {

    public static void main(String[] args) {
        int min = 1;
        int max = 6;
        Scanner intScanner = new Scanner(System.in);
        Random myRandom = new Random();
        int borderRandom = myRandom.nextInt(max-min)+min;


        System.out.println("Введіть число від 1 до 6: ");
        int number = intScanner.nextInt();

        if (borderRandom == number) {
            System.out.println("You have won!");
        } else if (borderRandom != number) {
            System.out.println("You haven't guessed, needed number is:  " + borderRandom);
        }

    }
}
