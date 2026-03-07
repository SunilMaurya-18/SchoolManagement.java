public class Teacher {
    private int id;
    private String name;
    private double Salary;
    private double salaryEarned;

    public Teacher(int ID, String name, double salary) {
        this.id = ID;
        this.name = name;
        this.Salary = salary;
        this.salaryEarned = 0;

    }

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return Salary;
    }

    public void setSalary(double salary) {
        this.Salary = salary;
    }

    public void receiveSalary(double salary) {

        salaryEarned += salary;
        School.updateTotalMoneySpent(salary);
    }

    public void setSalaryEarned(double salaryEarned) {
        this.salaryEarned = salaryEarned;
    }


    public double getSalaryEarned() {
        return salaryEarned;

    }

    @Override
    public String toString() {
        return "Teacher ID: " + id +
                ", Name: " + name +
                ", Salary: $" + Salary;
    }

    public void displayInfoTeacher() {
        System.out.println("ID: " + getID() + ", Name: " + getName() + ", Salary Received: " + getSalaryEarned());
    }
}
