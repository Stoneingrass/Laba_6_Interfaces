package task1;

/* Describes lecturer and its information */

import java.util.Locale;

public class Lecturer extends Person{
    //fields
    String cathedra;
    double payment;

    //constructors
    public Lecturer () {
        super();
    }
    public Lecturer (String name, String  surname, int age, String cathedra, double payment) {
        super(name, surname, age);
        this.cathedra=cathedra;
        this.payment=payment;
    }

    //getters
    public String getCathedra() {
        return cathedra;
    }

    public double getPayment() {
        return payment;
    }

    //setters
    public void setCathedra(String cathedra) {
        this.cathedra = cathedra;
    }

    public void setPayment(double payment) {
        this.payment = payment;
    }




    //prints info about the lecturer
    @Override
    public void printInfo() {
        System.out.printf("Lecturer of %s cathedra, %s %s, age: %d.%n", cathedra, getSurname(), getName(), getAge());
        System.out.printf(Locale.ROOT,"Payment: $%.2f.%n", payment);
    }
}
