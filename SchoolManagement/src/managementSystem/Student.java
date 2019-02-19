package managementSystem;

/**
 * Student class with id, name, fees paid and fees total
 */
public class Student {
    private int id;
    private String name;
    private int grade;
    private int feesPaid, feesTotal;

    public Student(int id, String name, int grade){
        this.id = id;
        this.name = name;
        this.grade = grade;
        feesPaid = 0;
        feesTotal = 30000;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getGrade() {
        return grade;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void payFee(int fees) {
        this.feesPaid +=fees;
        School.addMoneyEarned(fees);
    }
    /*
    public void payFee(int fees) {
        feesPaid +=fees;
    }
     */

    public int getFeesPaid() {
        return feesPaid;
    }

    public int getFeesTotal() {
        return feesTotal;
    }

    public int getRemainingFees(){
        return feesTotal - feesPaid;
    }

    @Override
    public String toString() {
        return "Student's name : "+name+
                " Total fees paid so far $"+feesPaid;
    }
}
