package com.company;

public class Farmer extends Character {
    private boolean harvesting;
    private  boolean plowing;


    public void attackAnotherCharacter(Constabl constable, Warrior warrior) {
        if(constable.getAttackPower() > this.getAttackPower() && warrior.getAttackPower() < this.getAttackPower()){
            System.out.println(this.name + ":, Let's increase our attack power and stamina to over come our enemies.");
            attackPower++;
            stamina++;
        } else {
            System.out.println(this.name + ":, From farmers say: as per our plan We did it! We bit our enemies with out demanding additional strength and attack power.");
            strength++;
            attackPower++;
        }
    }

    public boolean isHarvesting() {
        return harvesting;
    }

    public void setHarvesting(boolean harvesting) {
        this.harvesting = harvesting;
    }

    public boolean isPlowing() {
        return plowing;
    }

    public void setPlowing(boolean plowing) {
        this.plowing = plowing;
    }
}
