package com.company.warriorGame;


public class Mage extends Warrior implements Fightable {

    private int armorPercentage;
    //region Constructors
    public Mage() {
    }

    public Mage(String name, int health, int damage, int armorPercentage) {
        super(name, health, damage);
        this.armorPercentage = armorPercentage;
    }

    public Mage(String name, int health, int damage) {
        super(name, health, damage);
    }
    //endregion

    //region Public Methods
    @Override
    public void attack(Warrior opponent, Warrior activePlayer) {
            opponent.setHealth(opponent.getHealth() - opponent.takeDamage(activePlayer));
    }

    @Override
    public int takeDamage(Warrior activePlayer) {
        return (int) (activePlayer.getDamage() * (100 - armorPercentage) / 100);
    }
    //endregion
}

