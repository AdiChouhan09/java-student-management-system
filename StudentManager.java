import java.util.ArrayList;
import java.util.List;

public class StudentManager implements RecordActions {
    private List<Student> students = new ArrayList<>();

    private boolean existsRollNo(int rollNo) {
        for (Student s : students) {
            if (s.getRollNo() == rollNo) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void addStudent(Student student) {
        if (existsRollNo(student.getRollNo())) {
            System.out.println("Student with roll no " + student.getRollNo() + " already exists.");
            return;
        }
        students.add(student);
        System.out.println("Student added successfully.");
    }

    @Override
    public boolean deleteStudent(int rollNo) {
        for (Student s : students) {
            if (s.getRollNo() == rollNo) {
                students.remove(s);
                System.out.println("Student with roll no " + rollNo + " deleted.");
                return true;
            }
        }
        System.out.println("Student with roll no " + rollNo + " not found.");
        return false;
    }

    @Override
    public boolean updateStudent(int rollNo, double newMarks) {
        for (Student s : students) {
            if (s.getRollNo() == rollNo) {
                s.setMarks(newMarks);
                System.out.println("Marks updated for roll no " + rollNo + ".");
                return true;
            }
        }
        System.out.println("Student with roll no " + rollNo + " not found.");
        return false;
    }

    @Override
    public void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No student records available.");
            return;
        }
        for (Student s : students) {
            s.displayInfo();
        }
    }
}
