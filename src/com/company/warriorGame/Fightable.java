package com.company.warriorGame;

public interface Fightable {

    void attack(Warrior opponent, Warrior activePlayer);

    int takeDamage(Warrior activePlayer);
}
