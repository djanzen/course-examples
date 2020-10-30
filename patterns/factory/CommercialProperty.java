package FactoryPropertyManager;

public class CommercialProperty implements Property {
    protected int sf; //square footage
    protected double rate; //$ per square footage per month

    public CommercialProperty(int sf, double rate) {
        this.sf = sf;
        this.rate = rate;
    }

    public double getAnnualCost() {
        return (rate * sf) * 12;
    }
}
