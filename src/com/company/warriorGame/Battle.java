package com.company.warriorGame;

import java.util.Random;
import java.util.Scanner;

public class Battle {
    Warrior fighterOne = new Warrior(){
        public void attack(Warrior opponent, Warrior activePlayer) {
            return;
        }

        public int takeDamage(Warrior activePlayer) {
            return 0;
        }
    };

    Warrior fighterTwo = new Warrior(){
        public void attack(Warrior opponent, Warrior activePlayer) {
            return;
        }

        public int takeDamage(Warrior activePlayer) {
            return 0;
        }
    };


    public void chooseFighters() {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        Swordsman swordsman = new Swordsman("Caramon the Brave", 60, random.nextInt(11 - 5) + 5,20);
        Archer archer = new Archer("Tanis the Wise", 45, random.nextInt(16 - 7) + 7,4);
        Mage mage = new Mage("Raistlin the Dark", 30, random.nextInt(21 - 15) + 15,20);

        System.out.println("***********************THE GAME OF WAR***********************");
        System.out.println();
        System.out.println("Who will battle? Choose the first warrior " +
                "\nChoose 1 for Caramon the Brave Swordsman" +
                "\nChoose 2 for Tanis the Wise Archer" +
                "\nChoose 3 for Raistlin the Dark Mage");

        boolean choice1 = false;
        while (!choice1) {
            int fighter1 = scanner.nextInt();

            switch (fighter1) {
                case 1:
                    fighterOne = swordsman;
                    System.out.println("You chose the mighty swordsman!");
                    System.out.println();
                    choice1 = true;
                    break;
                case 2:
                    fighterOne = archer;
                    System.out.println("You chose the sharpshooting archer --->");
                    System.out.println();
                    choice1 = true;
                    break;
                case 3:
                    fighterOne = mage;
                    System.out.println("You chose the terrifying mage...");
                    System.out.println();
                    choice1 = true;
                    break;
                default:
                    System.out.println("Please choose a warrior.");
            }
        }
        System.out.println("Who will battle? Choose the second warrior " +
                "\nChoose 1 for Caramon the Brave Swordsman" +
                "\nChoose 2 for Tanis the Wise Archer" +
                "\nChoose 3 for Raistlin the Dark Mage");

        boolean choice2 = false;
        while (!choice2) {
            int fighter1 = scanner.nextInt();

            switch (fighter1) {
                case 1:
                    fighterTwo = swordsman;
                    System.out.println("You chose the mighty swordsman!");
                    System.out.println();
                    choice2 = true;
                    break;
                case 2:
                    fighterTwo = archer;
                    System.out.println("You chose the sharpshooting archer --->");
                    System.out.println();
                    choice2 = true;
                    break;
                case 3:
                    fighterTwo = mage;
                    System.out.println("You chose the terrifying mage...");
                    System.out.println();
                    choice2 = true;
                    break;
                default:
                    System.out.println("Please choose a warrior.");
            }
        }
    }

    public void battle() {

        while (true) {
            fighterOne.attack(fighterTwo, fighterOne);
            if (fighterTwo.getHealth() <= 0) {
                fighterTwo.setHealth(0);
                System.out.println(fighterTwo.getName() + "'s Health: " + fighterTwo.getHealth());
                System.out.println("The Battle is over");
                System.out.println(fighterOne.getName() + " wins!");
                System.out.println();
                break;
            }
            System.out.println(fighterTwo.getName() + " has taken damage: " + fighterTwo.getHealth());
            fighterTwo.attack(fighterOne, fighterTwo);
            if (fighterOne.getHealth() <= 0) {
                fighterOne.setHealth(0);
                System.out.println(fighterOne.getName() + "'s Health: " + fighterOne.getHealth());
                System.out.println("The Battle is over");
                System.out.println(fighterTwo.getName() + " wins!");
                System.out.println();
                break;
            }
            System.out.println(fighterOne.getName() + " has taken damage: " + fighterOne.getHealth());

        }

    }
}
