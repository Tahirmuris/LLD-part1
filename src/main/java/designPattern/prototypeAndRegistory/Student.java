package designPattern.prototypeAndRegistory;

public class Student extends ProtoType<Student> {

    private String name;
    private String firstName;
    private String lastName;
    private String batch;
    private int marks;

    @Override
    public Student copy() {
        Student s = new Student();
        s.setName(this.name);
        s.setFirstName(this.firstName);
        s.setLastName(this.lastName);
        s.setBatch(this.batch);
        s.setMarks(this.marks);
        return s;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        name = name;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }


}
