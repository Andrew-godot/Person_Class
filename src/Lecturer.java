public class Lecturer extends Person {

    private int staffID;
    private String position;

    // Constructor
    public Lecturer(String name, int age, int staffID, String position){

        super(name, age);

        this.staffID = staffID;
        this.position = position;
    }

    public Lecturer(){

        super("none", 0);

        this.staffID = 0;
        this.position = "none";
    }


    public int getStaffID() {
        return staffID;
    }

    public void setStaffID(int staffID) {
        this.staffID = staffID;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void introStaff(){
        System.out.printf("The staff member is %s who is %d and their staff ID is %d and their position is %s", this.getName(), this.getAge(), staffID, position);
    }
}
