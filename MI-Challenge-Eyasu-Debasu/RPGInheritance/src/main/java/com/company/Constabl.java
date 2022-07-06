package com.company;

public class Constabl extends Character {
    private String jurisdiction = "Inspector";

    public void attackAnotherCharacter(Warrior warrior, Farmer farmer) {
        if(warrior.getStrength() > this.getStrength() || farmer.getStrength() > this.getStrength()){
            System.out.println(this.name + " : To over come our enemies we need to decrease our speed and increase stamina and attack power");
            stamina++;
            speed--;
        } else{
            System.out.println(this.name + ", from constables team say, to bit" + warrior.getName() + " and " + farmer.getName() + " we should increase our speed, strength and attack power.");
            strength++;
            speed++;
            health++;
            System.out.println("That is what we need! Congratulations, we bit our enemies as per our plan.");
        }
    }

    public void arrestAnotherCharacter(Farmer farmer, Warrior warrior){
        System.out.println(this.jurisdiction + " " + this.name + ", ordered " + farmer.getName() + " and " + warrior.getName() + " to get arrested.");

    }

    public String getJurisdiction() {
        return jurisdiction;
    }

    public void setJurisdiction(String jurisdiction) {
        this.jurisdiction = jurisdiction;
    }

}
