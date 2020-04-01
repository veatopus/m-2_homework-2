package com.company;

public class DragonOfSelfSacrifice extends AncestralDragon implements Printable{
    private int despairPoint;

    public DragonOfSelfSacrifice(int wingspan, int weight, int length, int health, int damage, int despairPoint) {
        super(wingspan, weight, length, health, damage);
        this.despairPoint = despairPoint;
    }

    public int getDespairPoint() {
        return despairPoint;
    }

    public void setDespairPoint(int despairPoint) {
        this.despairPoint = despairPoint;
    }

    @Override
    public void attack(AncestralDragon enemy) {
        if (getHealth() > 0)
            enemy.setHealth(enemy.getHealth() - getDamage() - getWeight());
    }

    @Override
    public void useOfSuperAbility(AncestralDragon enemy) {
        if (getHealth() > 0) {
            enemy.setHealth((enemy.getHealth() * 99) / 100);
            enemy.setDamage((enemy.getDamage() * 99) / 100);
            setHealth(0);
        }
    }

    @Override
    public void useOfSuperAbility(AncestralDragon enemy, Relic relic) {
        if (getHealth() > 0) {
            enemy.setHealth((enemy.getHealth() * 99) / 100);
            enemy.setDamage((enemy.getDamage() * 99) / 100);

            enemy.setHealth(enemy.getHealth() - relic.getDamage());
            enemy.setDamage(enemy.getDamage() - relic.getDamage());

            setHealth(0);
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
                "despairPoint = " + despairPoint);
    }
}
