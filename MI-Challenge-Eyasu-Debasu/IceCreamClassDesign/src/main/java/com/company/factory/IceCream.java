package com.company.factory;

public class IceCream {
    public int milk;
    public int time;
    public boolean isFlavored;
    public int temp;
    public boolean isHomogenized;
    public boolean hasNecessaryEquipments;
    public int ammonia;
    public int customerSatsfaction;
    public int profit;

    public void blendingTheMixtures(){
        if(this.milk < 600 || isFlavored || hasNecessaryEquipments){
            System.out.println("Necessary equipments are not complete. In addition the amount of milk and flavor add is not enough. Make sure required equipments are ready and 600 or more gallons of milk is added to the blender and necessary flavors are incorporated.");
        } else{
            System.out.println(this.milk + " gallons of milk and those flavors are enough to start blending. Turn on the machine for " + this.time + " minutes to blend it.");
        }
    }

    public void pasteurizingToKillBacterias(){
        if(this.temp < 350 || hasNecessaryEquipments){
            System.out.println("Necessary equipments are not complete. " + this.temp + " degree Faranite is not enough for pasteurization. Make sure required equipments are ready and tempreture is set at 360 degree fanranite to start parteurize it.");
        } else{
            System.out.println("Homoginizing started. ");
            ammonia++;
            System.out.println("To softened the Ice-Cream use a tempreture less that " + this.temp + " degree faranite.");
        }

    }

    public void feedBackAndResults(){
        customerSatsfaction++;
        profit++;

    }

    public boolean isFlavored() {
        return isFlavored;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public void setFlavored(boolean flavored) {
        isFlavored = flavored;
    }

    public boolean isHomogenized() {
        return isHomogenized;
    }

    public void setHomogenized(boolean homogenized) {
        isHomogenized = homogenized;
    }

    public int getMilk() {
        return milk;
    }

    public void setMilk(int milk) {
        this.milk = milk;
    }

    public boolean isFlavors() {
        return isFlavored;
    }

    public void setFlavors(boolean flavors) {
        isFlavored = flavors;
    }

    public int getCustomerSatsfaction() {
        return customerSatsfaction;
    }

    public void setCustomerSatsfaction(int customerSatsfaction) {
        this.customerSatsfaction = customerSatsfaction;
    }

    public int getProfit() {
        return profit;
    }

    public void setProfit(int profit) {
        this.profit = profit;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public boolean isHasNecessaryEquipments() {
        return hasNecessaryEquipments;
    }

    public void setHasNecessaryEquipments(boolean hasNecessaryEquipments) {
        this.hasNecessaryEquipments = hasNecessaryEquipments;
    }

    public int getAmmonia() {
        return ammonia;
    }

    public void setAmmonia(int ammonia) {
        this.ammonia = ammonia;
    }

    @Override
    public String toString() {
        return "IceCream{" +
                "milk=" + milk +
                ", time=" + time +
                ", isFlavored=" + isFlavored +
                ", temp=" + temp +
                ", isHomogenized=" + isHomogenized +
                ", hasNecessaryEquipments=" + hasNecessaryEquipments +
                ", ammonia=" + ammonia +
                ", customerSatsfaction=" + customerSatsfaction +
                ", profit=" + profit +
                '}';
    }
}
