import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Update Student Marks");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter roll no: ");
                    int roll = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter email: ");
                    String email = scanner.nextLine();
                    System.out.print("Enter course: ");
                    String course = scanner.nextLine();
                    System.out.print("Enter marks: ");
                    double marks = scanner.nextDouble();

                    Student student = new Student(roll, name, email, course, marks);
                    manager.addStudent(student);
                    break;

                case 2:
                    manager.viewStudents();
                    break;

                case 3:
                    System.out.print("Enter roll no to update: ");
                    int rno = scanner.nextInt();
                    System.out.print("Enter new marks: ");
                    double newMarks = scanner.nextDouble();
                    manager.updateStudent(rno, newMarks);
                    break;

                case 4:
                    System.out.print("Enter roll no to delete: ");
                    int dno = scanner.nextInt();
                    manager.deleteStudent(dno);
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

            System.out.println();
        } while (choice != 5);

        scanner.close();
    }
}
