package com.company;

public class App {
    public static void main(String[] args) {
        Character farmer = new Farmer();
        Character constable = new Constabl();
        Character warrior = new Warrior();

        farmer.setName("Frank");
        farmer.setStrength(75);
        farmer.setHealth(100);
        farmer.setSpeed(10);
        farmer.setAttackPower(1);
        farmer.setStamina(75);

        constable.setName("Richard");
        constable.setStrength(60);
        constable.setHealth(100);
        constable.setSpeed(20);
        constable.setAttackPower(5);
        constable.setStamina(60);


        warrior.setName("Elis");
        warrior.setStrength(75);
        warrior.setHealth(100);
        warrior.setSpeed(50);
        warrior.setAttackPower(10);
        warrior.setStamina(100);

    }
}
