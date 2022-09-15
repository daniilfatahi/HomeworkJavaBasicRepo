package com.company;

public class Homework7 {

    public static void main(String[] args) {

        String team1 = "Navi";

        int team1Jack = 12;
        int team1Josh = 5;
        int team1Harry = 15;
        int team1Thomas = 20;
        int team1James = 8;

        String team2 = "Fnatic";

        int team2Alfie = 8;
        int team2Jacob = 21;
        int team2Wiliam = 15;
        int team2Oscar = 3;
        int team2Lame = 11;

        int team1avg = (team1Jack + team1Josh + team1Harry + team1Thomas + team1James) / 5;
        int team2avg = (team2Alfie + team2Jacob + team2Wiliam + team2Oscar + team2Lame) / 5;


        if (team1avg > team2avg) {
            System.out.println("Team " + team1 + " won and got " + team1avg + " points ");

        } else if (team2avg > team1avg) {
            System.out.println("Team " + team2 + " won and got " + team2avg + " points ");
        }


    }
}
