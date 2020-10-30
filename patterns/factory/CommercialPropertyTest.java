package FactoryPropertyManager;

import org.junit.Test;

import static org.junit.Assert.*;

public class CommercialPropertyTest {

    @Test
    public void getAnnualCost() {
        CommercialProperty cp = new CommercialProperty(1000, 2.5);
        assertEquals(30000, cp.getAnnualCost(), 0.01);
    }
}