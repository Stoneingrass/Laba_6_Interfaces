package carshop;

import carshop.cars.Ford;
import carshop.cars.Sedan;
import carshop.cars.Track;
import carshop.impl.MyOwnAutoShop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //shop creating
        MyOwnAutoShop shop = new MyOwnAutoShop();

        System.out.println("Admins mode.");
        System.out.println("Cars info input.");

        inputCarsInfo(shop);

        System.out.println("\nCustomer's mode.");
        System.out.println("Welcome to the shop!");

        customerMenu(shop);

        System.out.println("See you again!");

        System.out.println("Admins mode.");

        System.out.printf("Total shop income: %.2f.%n", shop.getIncome());
    }



    public static void inputCarsInfo(MyOwnAutoShop shop) {
        Scanner scanner = new Scanner(System.in);
        Scanner scannerString = new Scanner(System.in);

        //cars characteristics
        int speed;
        double price;
        String color;
        int length;
        int weight;
        int year;
        int discount;

        //cycle input and car creating
        for (int i=0; i<shop.getCars().length; i++) {
            System.out.println("\nCar, id: " + i + ".");
            System.out.println("Input car price:");
            price = scanner.nextDouble();
            System.out.println("Input car color:");
            color = scannerString.nextLine();
            System.out.println("Input car speed");
            speed = scanner.nextInt();

            //input by categories
            if(shop.getCars()[i] instanceof Sedan) {
                System.out.println("Input length:");
                length= scanner.nextInt();

                shop.getCars()[i] = new Sedan(speed, false, price, color, length);
            } else if (shop.getCars()[i] instanceof Ford) {
                System.out.println("Input year:");
                year=scanner.nextInt();
                System.out.println("Input manufacturer discount:");
                discount=scanner.nextInt();

                shop.getCars()[i] = new Ford(speed, false, price, color, year, discount);
            } else if (shop.getCars()[i] instanceof Track) {
                System.out.println("Input weight:");
                weight=scanner.nextInt();

                shop.getCars()[i] = new Track(speed, false, price, color, weight);
            }
        }
    }

    private static void customerMenu(MyOwnAutoShop shop) {
        Scanner scanner = new Scanner(System.in);
        int userInput;
        boolean IsInputEnded=false;

        do {
            System.out.println("\nWhat you want to do (input number)?");
            System.out.println("1. See cars prices");
            System.out.println("2. See cars colors");
            System.out.println("3. See car price by id");
            System.out.println("4. See car color by id");
            System.out.println("5. Purchase a car");
            System.out.println("0. Exit");

            userInput = scanner.nextInt();

            switch (userInput) {
                case 0:
                    IsInputEnded=true;
                    break;
                case 1:
                    System.out.println("There are these prices in the shop:");
                    double[] prices=shop.getCarsPrices();
                    for (double i: prices) {
                        System.out.println("\t" + i + "$");
                    }
                    break;
                case 2:
                    System.out.println("There are these colors in the shop:");
                    String[] colors=shop.getCarsColors();
                    for (String i: colors) {
                        System.out.println("\t" + i);
                    }
                    break;
                case 3:
                {
                    int id;
                    System.out.println("Input car id:");
                    id = scanner.nextInt();

                    if (id < 0 || id >= shop.getCars().length) {
                        System.out.println("ID is incorrect!");
                        break;
                    }

                    System.out.println("Price of this car is " + shop.getCarPrice(id) + "$");
                    break;
                }
                case 4:
                {
                    int id;
                    System.out.println("Input car id:");
                    id = scanner.nextInt();

                    if (id < 0 || id >= shop.getCars().length) {
                        System.out.println("ID is incorrect!");
                        break;
                    }

                    System.out.println("Color of this car is " + shop.getCarColor(id));
                    break;
                }
                case 5:
                {
                    int id;
                    System.out.println("Input car id:");
                    id = scanner.nextInt();

                    if (id < 0 || id >= shop.getCars().length) {
                        System.out.println("ID is incorrect!");
                        break;
                    }

                    if(shop.purchaseCar(id)) {
                        System.out.println("Purchase is success.");
                        System.out.println("Purchased: " + shop.getCars()[id].outputCarInfo());
                    }
                    else {
                        System.out.println("The car is already sold.");
                    }
                    break;
                }
                default:
                    System.out.println("Choose correct option please.");
                    break;
            }
        }while (!IsInputEnded);
    }
}