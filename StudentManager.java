import java.util.HashMap;

public class StudentManager {
    private HashMap<Integer, Student> studentMap = new HashMap<>();

    public void addStudent(Student student) {
        studentMap.put(student.getID(), student);
    }

    public void SearchStudent(int ID) {
        if (studentMap.containsKey(ID)) {
            studentMap.get(ID).displayInfo();
        } else {
            System.out.println("Student not Found!");

        }
    }

}
