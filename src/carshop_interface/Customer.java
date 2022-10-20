package carshop_interface;

public interface Customer {
    //return cars' (or car's) info
    double[] getCarsPrices();
    String[] getCarsColors();
    double getCarPrice(int id);
    String getCarColor(int id);
    //makes a car purchase; return true if purchase is success
    boolean purchaseCar(int id);
}
