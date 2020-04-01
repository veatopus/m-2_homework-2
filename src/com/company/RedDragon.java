package com.company;

public class RedDragon extends AncestralDragon implements Printable {
    private int firePoint;

    public RedDragon(int wingspan, int weight, int length, int health, int damage, int firePoint) {
        super(wingspan, weight, length, health, damage);
        this.firePoint = firePoint;
    }

    public int getFirePoint() {
        return firePoint;
    }

    public void setFirePoint(int firePoint) {
        this.firePoint = firePoint;
    }

    @Override
    public void attack(AncestralDragon enemy) {
        if (getHealth() > 0)
            enemy.setHealth(enemy.getHealth() - getDamage());
    }

    @Override
    public void useOfSuperAbility(AncestralDragon enemy) {
        if (getHealth() > 0) {
            setHealth(getHealth() + 50);
            enemy.setHealth(enemy.getHealth() - (firePoint * 10));
            enemy.setDamage(enemy.getDamage() - (firePoint * 10));
        }
    }

    @Override
    public void useOfSuperAbility(AncestralDragon enemy, Relic relic) {
        if (getHealth() > 0) {
            setHealth((getHealth() + 50) * relic.getDamage());
            enemy.setHealth((enemy.getHealth() - (firePoint * 10)) - (relic.getDamage() * 10));
            enemy.setDamage((enemy.getDamage() - (firePoint * 10)) - (relic.getDamage() * 10));
        }
    }

    @Override
    public void print() {
        System.out.println("" +
                "размах крыла = " + getWingspan() + " м. \n" +
                "вес = " + getWeight() + " кг. \n" +
                "длина = " + getLength() + " м. \n" +
                "очки здоровья = " + getHealth() + " \n" +
                "очки атаки = " + getDamage() + " \n" +
                "firePoint = " + firePoint);
    }
}
