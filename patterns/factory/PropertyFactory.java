package FactoryPropertyManager;

public class PropertyFactory {
  public static Property getProperty(String type, double rate, int sf) {
    if (type.equals("C")) {
      if (sf < 400) {
        return new MicroProperty(sf, rate);
      } else {
        return new CommercialProperty(sf, rate);
      }
    } else if (type.equals("R")) {
      return new ResidentialProperty(rate);
    } else {
      return new ResidentialProperty(0.0);
    }
  } 
}
