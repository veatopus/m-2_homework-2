package com.company;

import java.util.Objects;

public class Main {

    public static void main(String[] args) {
        System.out.println("_____________________________");
        Objects.requireNonNull(crateObject(Dragon.RedDragon)).print();
        System.out.println("_____________________________");
        Objects.requireNonNull(crateObject(Dragon.WaterDragon)).print();
        System.out.println("_____________________________");
        Objects.requireNonNull(crateObject(Dragon.DragonOfSelfSacrifice)).print();
        System.out.println("_____________________________");
    }

    public static Printable crateObject(Dragon dragon) {
        RedDragon redDragon = new RedDragon(30, 8000, 25,10000,999,100);
        DragonOfSelfSacrifice dragonOfSelfSacrifice = new DragonOfSelfSacrifice(25, 6600, 20,10000,999,100);
        WaterDragon waterDragon = new WaterDragon(30, 8000, 20,10500,999,100);

        switch (dragon){
            case RedDragon:
                return redDragon;
            case WaterDragon:
                return waterDragon;
            case DragonOfSelfSacrifice:
                return dragonOfSelfSacrifice;
            default:
                return null;
        }



    }

}
