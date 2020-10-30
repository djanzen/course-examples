package FactoryPropertyManager;

import org.junit.Test;

import static org.junit.Assert.*;

public class MicroPropertyTest {

    @Test
    public void getAnnualCost() {
        MicroProperty mp = new MicroProperty(200,2.5);
        assertEquals(7200, mp.getAnnualCost(), 0.01);
    }
}