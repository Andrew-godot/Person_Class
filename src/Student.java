// Student class will inherit from parent Person class
public class Student extends Person {

    private int studentID;
    private double fee;

    // Constructor
    public Student(String name, int age, int studentID, double fee){

        super(name, age); // Constructor of parent class

        this.studentID = studentID;
        this.fee = fee;
    }

    // Constructor without parameter
    public Student(){

        super("none", 0);

        this.studentID = 0;
        this.fee = 0.0;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public double getFee() {
        return fee;
    }

    public void introStudent(){
        System.out.printf("The student is %s who is %d and their student ID is %d and the fee is £%.2f %n", this.getName(), this.getAge(), studentID, fee);
    }
}
