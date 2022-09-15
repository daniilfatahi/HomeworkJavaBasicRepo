package com.company;

public class Main {

    public static void Homework6(String[] args) {

        int LiWarriorStat = 13;
        int LiArcherStat = 24;
        int LiRiderStat = 46;

        int MinWarriorStat = 9;
        int MinArcherStat = 35;
        int MinRiderStat = 12;


        int LiTotalTroops = 860 * 3;
        int MinTotalTroops = (int) ((860 * (double) 1.5) * 3);
        int LiTotalTroopsStats = LiTotalTroops * (LiWarriorStat + LiArcherStat + LiRiderStat);
        int MinTotalTroopsStats = MinTotalTroops * (MinWarriorStat + MinArcherStat + MinRiderStat);

        System.out.println("Загальний показник атаки династії Лі: " + LiTotalTroopsStats);
        System.out.println("Загальний показник атаки династії Мінь: " + MinTotalTroopsStats);

    }
}
