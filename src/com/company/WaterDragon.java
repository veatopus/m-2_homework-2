package com.company;

public class WaterDragon extends AncestralDragon implements Printable {
    private int compassion;

    public WaterDragon(int wingspan, int weight, int length, int health, int damage, int compassion) {
        super(wingspan, weight, length, health, damage);
        this.compassion = compassion;
    }

    public int getCompassion() {
        return compassion;
    }

    public void setCompassion(int compassion) {
        this.compassion = compassion;
    }

    public void compassion(DragonOfSelfSacrifice dragonOfSelfSacrifice) {
        if (getHealth() > 0)
            dragonOfSelfSacrifice.setHealth(dragonOfSelfSacrifice.getHealth() * compassion);
    }

    @Override
    public void attack(AncestralDragon enemy) {
        if (getHealth() > 0) {
            enemy.setHealth(enemy.getHealth() - getDamage());
        }
    }

    public void attack(AncestralDragon enemy, Relic relic) {
        if (getHealth() > 0) {
            enemy.setHealth(enemy.getHealth() - (getDamage() * relic.getDamage()));
        }
    }

    @Override
    public void useOfSuperAbility(AncestralDragon enemy) {
        if (getHealth() > 0)
            enemy.setHealth(enemy.getHealth() - getDamage());
        setHealth(getHealth() + 10);
    }

    @Override
    public void useOfSuperAbility(AncestralDragon enemy, Relic relic) {
        if (getHealth() > 0)
            enemy.setHealth(enemy.getHealth() - (getDamage() * relic.getDamage()));
        setHealth((getHealth() + 10) * relic.getDamage());

    }

    @Override
    public void print() {
        System.out.println("" +
                "размах крыла = " + getWingspan() + " м. \n" +
                "вес = " + getWeight() + " кг. \n" +
                "длина = " + getLength() + " м. \n" +
                "очки здоровья = " + getHealth() + " \n" +
                "очки атаки = " + getDamage() + " \n" +
                "compassion = " + compassion);
    }

}