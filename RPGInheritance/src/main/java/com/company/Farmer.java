package com.company;

public class Farmer extends Character {
    private boolean harvesting;
    private  boolean plowing;

    @Override
    public void attackAnotherCharacter() {
        System.out.println();
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
