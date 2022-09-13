package com.company;


import java.util.Scanner;

public class Homework5 {

    public static void main(String[] args) {

        Scanner textscan = new Scanner(System.in);

        System.out.println("Введіть перше число для додавання: ");
        int a = textscan.nextInt();
        System.out.println("Введіть друге число для додавання: ");
        int b = textscan.nextInt();

        int sum = a + b;

        System.out.println("Сумма чисел " + a + " + " + b + " = " + sum);

    }
}
