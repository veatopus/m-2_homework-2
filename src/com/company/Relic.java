package com.company;

public class Relic implements Printable{
    private int endurance = 100;
    private int damage;

    public Relic(int damage) {
        this.damage = damage;
    }

    public int getDamage() {
        if (this.endurance > 0) {
            this.endurance -= 10;
            return damage;
        } else
            return 0;

    }

    @Override
    public void print() {
        System.out.println("" +
                "атака = " + damage + " \n" +
                "выносливасть = " + endurance + " из 100");
    }
}
