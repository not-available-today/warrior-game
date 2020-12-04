package com.company.warriorGame;

import java.util.Random;

public class Warrior implements Fightable {

    Random random = new Random();

    //region Properties
    private String name;
    private int health;
    private int damage;
    //endregion

    //region Constructors

    public Warrior() {
    }

    public Warrior(String name, int health, int damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;
    }

    //endregion

    //region Public Methods

    public void attack(Warrior opponent, Warrior activePlayer) {
        opponent.setHealth(opponent.getHealth() - opponent.takeDamage(activePlayer));
    }

    public int takeDamage(Warrior activePlayer) {
        return 0;
    }

    //endregion

    //region Setters and Getters

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDamage(int damage) {
        this.damage = damage;


    }

    //endregion

}
