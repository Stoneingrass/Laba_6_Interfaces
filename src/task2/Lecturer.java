package task2;

/* Describes lecturer and its information */

import java.util.Locale;

public class Lecturer implements Person{
    //fields
    private String name;
    private String surname;
    private int age;
    private String cathedra;
    private double payment;

    //constructors
    public Lecturer() {
        name="";
        surname="";
        age=0;
        cathedra="";
        payment=0;
    }
    public Lecturer (String name, String  surname, int age, String cathedra, double payment) {
        this.name=name;
        this.surname=surname;
        this.age=age;
        this.cathedra=cathedra;
        this.payment=payment;
    }

    //getters
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getCathedra() {
        return cathedra;
    }

    public double getPayment() {
        return payment;
    }

    //setters
    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCathedra(String cathedra) {
        this.cathedra = cathedra;
    }

    public void setPayment(double payment) {
        this.payment = payment;
    }




    //prints info about the lecturer
    @Override
    public void printInfo() {
        System.out.printf("Lecturer of %s cathedra, %s %s, age: %d.%n", cathedra, surname, name, age);
        System.out.printf(Locale.ROOT,"Payment: $%.2f.%n", payment);
    }
}
