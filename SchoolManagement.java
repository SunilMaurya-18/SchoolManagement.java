
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class SchoolManagementSystem {

    private static Student newStudent;

    public static void main(String[] args) {

        System.out.println("===== SCHOOL MANAGEMENT SYSTEM =====\n");

        // Create lists for teachers and students
        List<Teacher> teachers = new ArrayList<>();
        List<Student> students = new ArrayList<>();


        School school = new School(teachers, students);

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


        Scanner menu = new Scanner(System.in);
        while (true) {

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


            System.out.println("--------MENU---------");
            System.out.println("1. Add Student");
            System.out.println("2. Search Student");
            System.out.println("3. Show all Student");
            System.out.println("4. Remove Student");
            System.out.println("5. Search Teacher");
            System.out.println("6. Add Teacher");
            System.out.println("7. Show all Teacher");
            System.out.println("8. Exit");

            System.out.println("Enter your Choice: ");
            int choice = menu.nextInt();


            switch (choice) {
                case 1:
                    System.out.println("Enter Student ID: ");
                    int ID = menu.nextInt();
                    menu.nextLine();

                    System.out.println("Enter Student Name: ");
                    String Name = menu.nextLine();

                    System.out.println("Enter Student Grade: ");
                    int Grade = menu.nextInt();

                    Student s = new Student(ID, Name, Grade);
                    school.addStudents(s);

                    System.out.println("Student Added Successfully!");
                    break;

                case 2:
                    System.out.println("Enter Student ID: ");
                    Scanner sc = new Scanner(System.in);
                    int searchID = sc.nextInt();
                    for (Student student : school.getStudents()) {
                        if (student.getID() == searchID) {
                            student.displayInfo();
                        }
                    }
                    break;
                case 3:
                    for (Student student : school.getStudents()) {
                        student.displayInfo();
                    }
                    break;

                case 4:
                    System.out.println("Enter Student ID to delete:");
                    int deleteId = menu.nextInt();

                    school.removeStudent(deleteId);
                    break;

                case 5:
                    System.out.println("Enter Teacher ID: ");
                    Scanner t = new Scanner(System.in);
                    int searchTeacher = t.nextInt();
                    for (Teacher teacher : school.getTeachers()) {
                        if (teacher.getID() == searchTeacher) {
                            teacher.displayInfoTeacher();
                        }
                    }
                    break;
                case 6:
                    System.out.println("Enter Teacher ID: ");
                    int id = menu.nextInt();
                    menu.nextLine();

                    System.out.println("Enter Teacher Name: ");
                    String name = menu.nextLine();

                    System.out.println("Enter Salary: ");
                    double Salary = menu.nextInt();

                    Teacher T = new Teacher(id, name, Salary);
                    school.addTeachers(T);

                    break;

                case 7:
                    for (Teacher teacher : school.getTeachers()) {
                        teacher.displayInfoTeacher();
                    }
                    break;

                case 8:
                    System.out.println("Exit!");
                    return;


            }

        }
    }

}



