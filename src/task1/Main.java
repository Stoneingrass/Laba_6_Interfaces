package task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int N_PERSONS=10;    //maximum number of person in the array
        Person[] people = new Person[N_PERSONS];    //array of persons
        int nPersons = 0;   //number of persons in the array at the moment

        Scanner numberScanner = new Scanner(System.in);

        int menuInput;  //contains user choice in menu
        boolean isExit=false;    //if true then menu cycle ends


        //menu cycle
        do {
            //available operations with persons
            System.out.println("\nChoose operation you need:");
            System.out.printf("1. Add a person (now: %d; max: %d).%n", nPersons, people.length);
            System.out.printf("2. Remove a person (now: %d).%n", nPersons);
            System.out.printf("3. Print info about all persons.%n");
            System.out.println("0. Exit.");
            menuInput= numberScanner.nextInt();

            switch (menuInput) {
                case 0:
                    //exit
                    isExit=true;
                    break;
                case 1:
                    //add a person
                    if (nPersons==N_PERSONS) {    //if person list is full
                        System.out.printf("People list is full (%d max)!%n", N_PERSONS);
                        break;
                    }

                    if (!addPerson(people, nPersons)) {
                        nPersons++;
                    }
                    break;
                case 2:
                    //delete a person
                    if (nPersons==0) {    //if person list is empty
                        System.out.println("People list is empty!");
                        break;
                    }
                    deletePerson(people, nPersons);
                    nPersons--;
                    break;
                case 3:
                    //output persons' info
                    if (nPersons==0) {    //if person list is empty
                        System.out.println("People list is empty!");
                        break;
                    }
                    outputInfo(people, nPersons);
                    break;
                default:
                    //error
                    System.out.println("You choose incorrect option, retry please.");
            }
        } while (!isExit);
    }




    //adds a person to array; returns 'true' if exit chosen, else returns 'false'
    static boolean addPerson(Person[] people, int nPersons) {
        Scanner numberScanner = new Scanner(System.in);
        Scanner stringScanner = new Scanner(System.in);

        int menuInput;  //contains user choice in menu
        boolean isExit=false;    //if true then the function returns 'true'
        boolean isExit0;    //if true then menu cycle ends

        do {
            //choice of person type
            System.out.println("\nChoose a type of person you want to add:");
            System.out.println("1. Student");
            System.out.println("2. Lecturer");
            System.out.println("0. Exit.");
            menuInput= numberScanner.nextInt();

            isExit0=true;

            switch (menuInput) {
                case 0:
                    //if exit chosen
                    isExit=true;
                    continue;
                case 1:
                    //adding a student
                    people[nPersons]=new Student();
                    break;
                case 2:
                    //adding a lecturer
                    people[nPersons]=new Lecturer();
                    break;
                default:
                    //error
                    isExit0=false;
                    System.out.println("You choose incorrect option, retry please.");
                    continue;
            }

            //input data (common)
            System.out.print("Input a name: ");
            people[nPersons].setName(stringScanner.nextLine());
            System.out.print("Input a surname: ");
            people[nPersons].setSurname(stringScanner.nextLine());
            System.out.print("Input a age (integer number): ");
            people[nPersons].setAge(numberScanner.nextInt());

            //input data if person is student or lecturer
            if (people[nPersons] instanceof Student) {
                System.out.print("Input a group: ");
                ((Student)people[nPersons]).setGroup(stringScanner.nextLine());
                System.out.print("Input a student ticket number: ");
                ((Student)people[nPersons]).setStudentTicketNumber(stringScanner.nextLine());
            } else if(people[nPersons] instanceof Lecturer) {
                System.out.print("Input a cathedra: ");
                ((Lecturer)people[nPersons]).setCathedra(stringScanner.nextLine());
                System.out.print("Input a payment: ");
                ((Lecturer)people[nPersons]).setPayment(numberScanner.nextDouble());
            }
        } while (!isExit0);

        return isExit;
    }

    //deletes a person from person list
    static void deletePerson(Person[] people, int nPersons) {
        Scanner numberScanner = new Scanner(System.in);
        int index;

        //index input
        do {
            System.out.printf("Input person number which you want to delete (1...%d): ", nPersons);
            index=numberScanner.nextInt()-1;

            if(index<0 || index >=nPersons) {
                System.out.println("Enter correct number please.");
            }
        } while (index<0 || index >=nPersons);

        //deleting person
        for (int i=index; i<nPersons-1; i++) {
            people[i]=people[i+1];
        }
        people[nPersons-1]=null;
    }

    //outputs persons' info
    static void outputInfo(Person[] people, int nPersons) {
        System.out.println("\nPersons list:");
        for (int i=0; i<nPersons; i++) {
            System.out.printf("#%d%n", i+1);
            people[i].printInfo();
        }
    }
}