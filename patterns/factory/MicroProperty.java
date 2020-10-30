package FactoryPropertyManager;

public class MicroProperty extends CommercialProperty{
    public MicroProperty(int sf, double rate) {
      super(sf, rate);
    }
    public double getAnnualCost() {
        return (100 + (rate * sf)) * 12;
    }
}
