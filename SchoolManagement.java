import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class SchoolManagementSystem {
    public static void main(String[] args) {
        // Create lists for teachers and students
        List<Teacher> teachers = new ArrayList<>();
        List<Student> students = new ArrayList<>();


        // Create School instance
        School school = new School(teachers, students);

        System.out.println("===== SCHOOL MANAGEMENT SYSTEM =====\n");

        // Add Teachers
        System.out.println("--- Adding Teachers ---");
        Teacher t1 = new Teacher(101, "John Smith", 5000);
        Teacher t2 = new Teacher(102, "Sarah Johnson", 5500);
        Teacher t3 = new Teacher(103, "Michael Brown", 5200);
        Teacher t4 = new Teacher(104, "Michael Jackson", 5200);


        school.addTeachers(t1);
        school.addTeachers(t2);
        school.addTeachers(t3);
        school.addTeachers(t4);

        System.out.println("Teachers added successfully!");
        for (Teacher teacher : school.getTeachers()) {
            System.out.println(teacher);
        }

        // Add Students
        System.out.println("\n--- Adding Students ---");
        Student s1 = new Student(201, "Alice Williams", 10);
        Student s2 = new Student(202, "Bob Davis", 9);
        Student s3 = new Student(203, "Carol Martinez", 10);
        Student s4 = new Student(204, "David Garcia", 9);
        Student s5 = new Student(205, "Arpit Jaiswal", 12);

        school.addStudents(s1);
        school.addStudents(s2);
        school.addStudents(s3);
        school.addStudents(s4);
        school.addStudents(s5);

        System.out.println("Students added successfully!");
        for (Student student : school.getStudents()) {
            System.out.println(student);
        }

        // Process Student Fee Payments
        System.out.println("\n--- Processing Student Fee Payments ---");
        s1.FeePaid(15000);
        System.out.println(s1.getName() + " paid: $15000, Remaining: $" + s1.getRemainingFee());

        s2.FeePaid(30000);
        System.out.println(s2.getName() + " paid: $30000, Remaining: $" + s2.getRemainingFee());

        s3.FeePaid(20000);
        System.out.println(s3.getName() + " paid: $20000, Remaining: $" + s3.getRemainingFee());

        s4.FeePaid(10000);
        System.out.println(s4.getName() + " paid: $10000, Remaining: $" + s4.getRemainingFee());

        // Process Teacher Salaries
        System.out.println("\n--- Processing Teacher Salaries ---");
        t1.receiveSalary(5000);
        System.out.println(t1.getName() + " received salary: $5000, Total earned: $" + t1.getSalaryEarned());

        t2.receiveSalary(5500);
        System.out.println(t2.getName() + " received salary: $5500, Total earned: $" + t2.getSalaryEarned());

        t3.receiveSalary(5200);
        System.out.println(t3.getName() + " received salary: $5200, Total earned: $" + t3.getSalaryEarned());
        s5.FeePaid(10000);
        System.out.println(s5.getName() + " paid: $10000, Remaining: $" + s5.getRemainingFee());

        // Print Financial Report
        System.out.println("\n");
        school.printFinancialReport();

        // Summary Statistics
        System.out.println("\n--- Summary Statistics ---");
        System.out.println("Total Teachers: " + school.getTeachers().size());
        System.out.println("Total Students: " + school.getStudents().size());
        System.out.println("Total Fees Collected: $" + school.getTotalMoneyEarned());
        System.out.println("Total Salaries Paid: $" + school.getTotalMoneySpent());
        System.out.println("Net Balance: $" + (school.getTotalMoneyEarned() - school.getTotalMoneySpent()));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Student ID :");

        int SearchID = scanner.nextInt();
        boolean Found = false;
        for (Student s : students) {
            if (s.getID() == SearchID) {
                s.displayInfo();
                Found = true;
                break;


            } else {
                if (!Found) {
                    System.out.println("Student not found!");
                }
            }

        }
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter Teacher ID: ");

        int SearchTeacherID = scanner1.nextInt();
        boolean TeacherFound = false;
        for (Teacher t : teachers) {
            if (t.getID() == SearchTeacherID) {
                t.displayInfoTeacher();
                TeacherFound = true;
                break;
            } else {
                if (!TeacherFound) {
                    System.out.println("Teacher not Found!");

                }
            }
        }

    }


}