package FactoryPropertyManager;

public class ResidentialProperty implements Property {
    private double rent; //monthly rent

    public ResidentialProperty(double rent) {
        this.rent = rent;
    }

    public double getAnnualCost() {
        return rent * 12;
    }
}
