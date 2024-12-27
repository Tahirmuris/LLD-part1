package designPattern.prototypeAndRegistory;

import java.util.HashMap;
import java.util.Map;

public class StudentRegistry {

    private final Map<String, Student> studentsRegistry;

    private static StudentRegistry studentRegistryInstance;

    private StudentRegistry() {
        studentsRegistry = new HashMap<>();
    }



    public void addStudent(String name, Student student) {
        studentsRegistry.put(name, student);
    }

    public Student getStudent(String name) {
        return studentsRegistry.get(name);
    }

    public static StudentRegistry getInstance() {
        if (studentRegistryInstance == null) {
            synchronized (StudentRegistry.class) {
                if (studentRegistryInstance == null) {
                    studentRegistryInstance = new StudentRegistry();
                }
            }
        }
        return studentRegistryInstance;
    }
}
