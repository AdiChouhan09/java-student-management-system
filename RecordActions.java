public interface RecordActions {
    void addStudent(Student student);

    boolean deleteStudent(int rollNo);

    boolean updateStudent(int rollNo, double newMarks);

    void viewStudents();
}
