package task2;

/* Describes student and its information */

public class Student implements Person{
    //fields
    private String name;
    private String surname;
    private int age;
    private String group;
    private String studentTicketNumber;

    //constructors
    public Student() {
        name="";
        surname="";
        age=0;
        group="";
        studentTicketNumber="";
    }
    public Student (String name, String  surname, int age, String group, String studentTicketNumber) {
        this.name=name;
        this.surname=surname;
        this.age=age;
        this.group=group;
        this.studentTicketNumber=studentTicketNumber;
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

    public String getGroup() {
        return group;
    }

    public String getStudentTicketNumber() {
        return studentTicketNumber;
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

    public void setGroup(String group) {
        this.group = group;
    }

    public void setStudentTicketNumber(String studentTicketNumber) {
        this.studentTicketNumber = studentTicketNumber;
    }




    //prints info about student
    @Override
    public void printInfo() {
        System.out.printf("Student of %s group, %s %s, age: %d.%n", group, surname, name, age);
        System.out.printf("Student ticket number: %s.%n", studentTicketNumber);
    }
}
