package com.company;

public abstract class AncestralDragon {
    private int wingspan;
    private int weight;
    private int length;
    private int health;
    private int damage;

    public AncestralDragon() { }

    public AncestralDragon(int wingspan, int weight, int length, int health, int damage) {
        this.wingspan = wingspan;
        this.weight = weight;
        this.length = length;
        this.health = health;
        this.damage = damage;
    }

    public int getWingspan() {
        return wingspan;
    }

    public void setWingspan(int wingspan) {
        this.wingspan = wingspan;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    abstract public void attack(AncestralDragon enemy);
    abstract public void useOfSuperAbility(AncestralDragon enemy);
    abstract public void useOfSuperAbility(AncestralDragon enemy, Relic relic);

}
