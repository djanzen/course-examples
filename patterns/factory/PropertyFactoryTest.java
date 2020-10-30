package FactoryPropertyManager;

import org.junit.Test;

import static org.junit.Assert.*;

public class PropertyFactoryTest {

    @Test
    public void getResidentialProperty() {
        Property p = PropertyFactory.getProperty("R",1800,0);
        assertEquals("ResidentialProperty",p.getClass().getSimpleName());
    }
    @Test
    public void getCommercialProperty() {
        Property p = PropertyFactory.getProperty("C", 2.5, 1000);
        assertEquals("CommercialProperty", p.getClass().getSimpleName());
    }
    @Test
    public void getMicroProperty() {
        Property p = PropertyFactory.getProperty("C", 2.5, 200);
        assertEquals("MicroProperty", p.getClass().getSimpleName());
    }
}
