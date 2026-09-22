import java.util.ArrayList;

public class Main {

    static void main(String[] args) {

        // define objects of person

        Person p1 = new Person("John", 23);
        Person p2 = new Person();

        p1.intro();
        p2.intro();

        p2.setName("Paul");
        p2.setAge(16);

        p2.intro();

        // Creates new ArrayList of class Person named persons
        ArrayList<Person> persons = new ArrayList<>();

        // Add a person with name David, age 50 to the ArrayList
        persons.add(new Person("David", 50));

        // Get function return the element of array list by index number
        Person p = persons.get(0);

        p.intro();

        // Add another person using my information
        persons.add(new Person("Andrew", 20));

        p = persons.get(1);

        p.intro();



        Student stu1 = new Student("Ben", 20, 1234, 400.70);
        stu1.introStudent();

        Student stu2 = new Student();
        stu2.setName("Danny");
        stu2.setAge(67);

        stu2.intro();

        ArrayList<Lecturer> lecturers = new ArrayList<>();
        lecturers.add(new Lecturer("John", 34, 7353, "Head Manager"));
        lecturers.add(new Lecturer("Christopher", 25, 1634, "Manager"));

        Lecturer l = lecturers.get(0);
        System.out.println("");
        System.out.println("------------------------------------------");
        l.introStaff();

        System.out.println("");
        l = lecturers.get(1);
        l.introStaff();
    }
}
