package task1;

/* Describes student and its information */

public class Student extends Person{
    //fields
    String group;
    String studentTicketNumber;

    //constructors
    public Student () {
        super();
    }
    public Student (String name, String  surname, int age, String group, String studentTicketNumber) {
        super(name, surname, age);
        this.group=group;
        this.studentTicketNumber=studentTicketNumber;
    }

    //getters
    public String getGroup() {
        return group;
    }

    public String getStudentTicketNumber() {
        return studentTicketNumber;
    }

    //setters
    public void setGroup(String group) {
        this.group = group;
    }

    public void setStudentTicketNumber(String studentTicketNumber) {
        this.studentTicketNumber = studentTicketNumber;
    }




    //prints info about student
    @Override
    public void printInfo() {
        System.out.printf("Student of %s group, %s %s, age: %d.%n", group, getSurname(), getName(), getAge());
        System.out.printf("Student ticket number: %s.%n", studentTicketNumber);
    }
}
