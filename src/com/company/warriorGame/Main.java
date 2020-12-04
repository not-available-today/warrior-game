package com.company.warriorGame;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exitTime = false;
        while(!exitTime){
            System.out.println("Choose 1 for Battle" +
                    "\nChoose 2 to run away like a coward");

            int userChoice = scanner.nextInt();
            switch (userChoice){
                case 1:
                    Battle battle = new Battle();
                    battle.chooseFighters();
                    battle.battle();
                    continue;
                case 2:
                    exitTime = true;
                    System.out.println("Run on home, weakling.");
                default:
                    System.out.println("Make a real choice");

            }

        }
    }
}
