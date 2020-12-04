package com.company.warriorGame;


public class Archer extends Warrior implements Fightable {

    //region Properties
    private int criticalHitVector;
    //endregion

    //region Constructors;
    public Archer() {
    }

    public Archer(String name, int health, int damage) {
        super(name, health, damage);
    }

    public Archer(String name, int health, int damage, int criticalHitVector) {
        super(name, health, damage);
        this.criticalHitVector = criticalHitVector;
    }
    //endregion

    //region Public Methods
    @Override
    public void attack(Warrior opponent, Warrior activePlayer) {

        if (criticalHitVector == 0) {
            int temp = activePlayer.getDamage();
            int tempCriticalHitVector = this.criticalHitVector;

            activePlayer.setDamage(activePlayer.getDamage() * 2);
            opponent.setHealth(opponent.getHealth() - opponent.takeDamage(activePlayer));
            activePlayer.setDamage(temp);

            criticalHitVector --;
            criticalHitVector = tempCriticalHitVector;
        } else {
            opponent.setHealth(opponent.getHealth() - opponent.takeDamage(activePlayer));
        }
    }

    @Override
    public int takeDamage(Warrior activePlayer) {
        return activePlayer.getDamage();
    }


    //endregion

    //region Setters and Getters

    public int getCriticalHitVector() {
        return criticalHitVector;
    }

    public void setCriticalHitVector(int criticalHitVector) {
        this.criticalHitVector = criticalHitVector;
    }

    //endregion
}

