package com.company.pos;

import java.util.Arrays;
import java.util.Scanner;

public class IceCream {
    private int temp;
    private String[] flavor= {"Strawberry", "Chocolate", "Buttered Pecan"};
    private int customerSatsfaction;
    private boolean isSupportedByImage;

    public void keepColdTheIceCream(){
        if(this.temp >= 40){
            System.out.println("We have to find a set of materials that keeps the ice-cram room temp below 40 degree favorite.");
            temp--;
            customerSatsfaction--;
        } else {
            System.out.println(this.temp + " is suitable temp to keep the ice-cream cold");
            customerSatsfaction++;
        }
    }
    public void haveEnoughFlavors(){
        System.out.println(this.flavor + " are available to the users");
        System.out.println("Have a look on those posted pictures and come back with your choice.");
    }

    public void customerSatisfactions(){
        Scanner myScanner = new Scanner(System.in);
        System.out.println("We do have " + this.flavor + " flavored cold ice-cream.");
        System.out.println("If your favorite is not included on the list let us know we will work on it for next time.");
        String customerDemand = myScanner.nextLine();
        System.out.println("You have entered " + customerDemand + " flavor. Sorry for not fulfilling your demand. We will get you next time with your favorite.");
        customerSatsfaction--;
    }


    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public String[] getFlavor() {
        return flavor;
    }

    public void setFlavor(String[] flavor) {
        this.flavor = flavor;
    }

    public int getCustomerSatsfaction() {
        return customerSatsfaction;
    }

    public void setCustomerSatsfaction(int customerSatsfaction) {
        this.customerSatsfaction = customerSatsfaction;
    }

    public boolean isSupportedByImage() {
        return isSupportedByImage;
    }

    public void setSupportedByImage(boolean supportedByImage) {
        isSupportedByImage = supportedByImage;
    }

    @Override
    public String toString() {
        return "IceCream{" +
                "temp=" + temp +
                ", flavor=" + Arrays.toString(flavor) +
                ", customerSatsfaction=" + customerSatsfaction +
                ", isSupportedByImage=" + isSupportedByImage +
                '}';
    }
}
