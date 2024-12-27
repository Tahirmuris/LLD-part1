package designPattern.prototypeAndRegistory;

public class Main {

    public static void main(String[] args) {

        Student student = new Student();
        student.setFirstName("John");
        student.setLastName("Mist");
        student.setBatch("2024");

        StudentRegistry studentRegistry = StudentRegistry.getInstance();
        StudentRegistry studentRegistry1 = StudentRegistry.getInstance();

        studentRegistry.addStudent("APR-2024", student);

        Student student2 =  studentRegistry1.getStudent("APR-2024");
        Student student3 = student2.copy();
        Student Student4 = student3.copy();
    }
}
