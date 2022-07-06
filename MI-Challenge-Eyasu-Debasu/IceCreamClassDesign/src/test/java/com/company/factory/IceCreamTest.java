package com.company.factory;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IceCreamTest {

    private IceCream iceCream;

    @Before
    public void setUp() {
        iceCream = new IceCream();
    }

    @Test
    public void ShouldBlendingTheMixturesWhenItHaveEnoughMilkNecessaryEquipmentsAndIsflavord() {
        int input = 700;
        boolean isFlavored = false;
        boolean hasEquipment = false;

        iceCream.blendingTheMixtures();

        assertEquals(input, iceCream.getMilk());
        assertEquals(isFlavored, iceCream.isFlavored());
        assertEquals(hasEquipment, iceCream.isHasNecessaryEquipments());
    }

    @Test
    public void blendedMixturesShouldpasteurizingToKillBacterias() {
        int expectedTemp = 400;
        boolean hasexpectedAnEquipment = false;

        iceCream.pasteurizingToKillBacterias();

        assertEquals(expectedTemp, iceCream.getTemp());
        assertEquals(hasexpectedAnEquipment, iceCream.isHasNecessaryEquipments());

    }

    @Test
    public void customersFeedbackAndProfitShouldBeEvaluated() {
        int expectedCustomerSatsfaction = 5;
        int expectedProfitInDollars = 28000;

        iceCream.feedBackAndResults();

        assertEquals(expectedCustomerSatsfaction, iceCream.getCustomerSatsfaction());
        assertEquals(expectedProfitInDollars, iceCream.getProfit());
    }


}