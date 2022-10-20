package carshop_impl;

import carshop_cars.Ford;
import carshop_cars.Sedan;
import carshop_cars.Track;
import carshop_interface.Admin;
import carshop_interface.Customer;
import carshop_cars.Car;

public class MyOwnAutoShop implements Admin, Customer {
    protected Car[] cars;
    protected double totalIncome;

    public MyOwnAutoShop() {
        cars = new Car[] {
                new Sedan(),
                new Ford(),
                new Ford(),
                new Track(),
                new Track()
        };
        totalIncome=0;
    }

    public Car[] getCars() {
        return cars;
    }


    @Override
    public double[] getCarsPrices() {
        double[] prices = new double[cars.length];
        for (int i=0; i<prices.length; i++) {
            prices[i]=cars[i].getSalePrice();
        }
        return prices;
    }

    @Override
    public String[] getCarsColors() {
        String[] colors = new String[cars.length];
        for (int i=0; i<colors.length; i++) {
            colors[i]=cars[i].getColor();
        }
        return colors;
    }

    @Override
    public double getCarPrice(int id) {
        return cars[id].getSalePrice();
    }

    @Override
    public String getCarColor(int id) {
        return cars[id].getColor();
    }

    @Override
    public boolean purchaseCar(int id) {
        if (!cars[id].isSellOut())
        {
            cars[id].setSellOut(true);
            totalIncome+=cars[id].getSalePrice();
            return true;
        }
        else {
            return false;
        }
    }

    @Override
    public double getIncome() {
        return totalIncome;
    }
}
