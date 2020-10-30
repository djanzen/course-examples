package FactoryPropertyManager;

public class PropertyManager {
  public static void main(String [] args) {
//    CommercialProperty cp = new CommercialProperty(1000,2.5);
//    ResidentialProperty rp = new ResidentialProperty(1850);
    Property cp = PropertyFactory.getProperty("C",2.5,200);
    Property rp = PropertyFactory.getProperty("R",1850,0);
    System.out.println("Rent: " + cp.getAnnualCost());
    System.out.println("Rent: " + rp.getAnnualCost());
  }
}
