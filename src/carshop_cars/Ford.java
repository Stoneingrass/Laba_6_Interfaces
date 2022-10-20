package carshop_cars;

public class Ford extends Car {
    private int year;
    private int manufacturerDiscount;

    public Ford(int speed, boolean isSellOut, double regularPrice, String color, int year, int manufacturerDiscount) {
        super(speed, isSellOut, regularPrice, color);
        this.year = year;
        this.manufacturerDiscount=manufacturerDiscount;
    }
    public Ford() {
    }


    @Override
    public double getSalePrice() {
        return regularPrice-manufacturerDiscount>0 ? regularPrice-manufacturerDiscount : 0;
    }

    @Override
    public String outputCarInfo() {
        return String.format("Ford, price: %.2f$, color: %s, speed: %d, year: %d.", getSalePrice(), color, speed, year);
    }
}
