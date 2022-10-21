package carshop.cars;

public abstract class Car {
    protected int speed;
    protected boolean isSellOut;
    protected double regularPrice;      //price without discount
    protected String color;

    public Car(int speed, boolean isSellOut, double regularPrice, String color) {
        this.speed = speed;
        this.isSellOut = isSellOut;
        this.regularPrice = regularPrice;
        this.color = color;
    }
    public Car() {
    }

    public boolean isSellOut() {
        return isSellOut;
    }
    public String getColor() {
        return color;
    }


    //sets if car is sold
    public void setSellOut(boolean sellOut) {
        isSellOut = sellOut;
    }


    //returns price with discount
    public abstract double getSalePrice();
    public abstract String outputCarInfo();
}
