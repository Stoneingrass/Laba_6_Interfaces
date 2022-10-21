package carshop.cars;

public class Sedan extends Car{
    private int length;

    public Sedan(int speed, boolean isSellOut, double regularPrice, String color, int length) {
        super(speed, isSellOut, regularPrice, color);
        this.length = length;
    }
    public Sedan() {
    }


    @Override
    public double getSalePrice() {
        return length>20 ? regularPrice*0.95 : regularPrice;
    }

    @Override
    public String outputCarInfo() {
        return String.format("Sedan, price: %.2f$, color: %s, speed: %d, length: %d.", getSalePrice(), color, speed, length);
    }
}
