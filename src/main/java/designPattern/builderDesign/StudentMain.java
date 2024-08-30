package designPattern.builderDesign;

public class StudentMain {

    public static void main(String[] args) {
        Student student = Student.builder()
                .id(1)
                .age(14)
                .build();

    }
}
