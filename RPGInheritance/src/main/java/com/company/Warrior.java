package com.company;

public class Warrior extends Character {
    private int shieldStrength;

    public void attackAnotherCharacter(Constabl constable, Farmer farmer) {
        if(constable.getAttackPower() > this.getAttackPower() || farmer.getAttackPower() > this.getAttackPower()){
            System.out.println(this.name + " To over come our enemies we should have to increase our shield strength, speed and stamina.");
            shieldStrength++;
            stamina++;
            speed--;
        } else{
            System.out.println("to bit" + constable.getName() + " and " + farmer.getName() + " we should increase our speed, strength and attack power.");
            strength++;
            attackPower++;
            speed++;
        }
    }

    public int getShieldStrength() {
        return shieldStrength;
    }

    public void setShieldStrength(int shieldStrength) {
        this.shieldStrength = shieldStrength;
    }


}
