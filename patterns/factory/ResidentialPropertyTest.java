package FactoryPropertyManager;

import org.junit.Test;

import static org.junit.Assert.*;

public class ResidentialPropertyTest {

    @Test
    public void getAnnualCost() {
        ResidentialProperty rp = new ResidentialProperty(1800);
        assertEquals(21600,rp.getAnnualCost(), 0.01);
    }
}