public class Person {

    private String name;
    private int age;

    // Constructor with parameters
    public Person(String name, int age) {

        this.name = name;
        this.age = age;

    }
    // Constructor without parameters
    public Person() {

        this.name = "none";
        this.age = 0;

    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void intro() {
        System.out.printf("The name is %s and the age is %d %n", name, age); // string %s, number %d, double %f, next line %n
    }

    public void testInheritance(){
        System.out.println("Subclass inherits from person class");
    }
}