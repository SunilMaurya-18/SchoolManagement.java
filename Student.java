public class Student {
    private int ID;
    private String Name;
    private int Grade;
    private double feePaid;
    private double feeTotal;

    public Student(int ID, String Name, int Grade) {
        this.feePaid = 0;
        this.feeTotal = 30000;
        this.ID = ID;
        this.Name = Name;
        this.Grade = Grade;
    }

    public void setGrade(int Grade) {
        this.Grade = Grade;
    }

    public void FeePaid(double fee) {
        feePaid += fee;
        School.updateTotalMoneyEarned(feePaid);
    }

    public void setID(int ID) {

        this.ID = ID;
    }

    public void setName(String name) {

        Name = name;
    }

    public void setFeePaid(double feePaid) {

        this.feePaid = feePaid;
    }

    public void setFeeTotal(double feeTotal) {
        this.feeTotal = feeTotal;
    }

    public int getID() {

        return ID;
    }

    public String getName() {
        return Name;
    }

    public int getGrade() {

        return Grade;
    }

    public double getFeePaid() {
        return feePaid;
    }

    public double getFeeTotal() {

        return feeTotal;

    }

    public double getRemainingFee() {

        return feeTotal - feePaid;
    }

    public void displayInfo() {
        System.out.println("ID: " + getID() + ", Name: " + getName() + ", Grade: " + getGrade() +
                ", FeePaid: " + getFeePaid() + ", FeeRemaining: " + getRemainingFee());
    }

    @Override
    public String toString() {
        return "ID: " + getID() + ", Name: " + getName() + ", Grade: " + getGrade();
    }

    public int getId() {
        return ID;
    }

    public void getFeeStatus() {
        System.out.println("Student Name" + getName());
        System.out.println("ID: " + getID());
        System.out.println("Fee paid: " + getFeePaid());
        System.out.println("Remaining Fee: " + getRemainingFee());
    }

}