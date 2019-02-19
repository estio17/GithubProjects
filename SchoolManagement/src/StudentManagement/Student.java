package StudentManagement;

import java.util.Scanner;

public class Student {

    private String firstName;
    private String lastName;
    private int grade;
    private String studentID;
    private String courses=" ";
    private int balalnce = 0;
    private static int costOfCourse = 600;
    private static int id = 1000;

    public Student(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter students first name : ");
        this.firstName= in.nextLine();
        System.out.println("Enter students last name : ");
        this.lastName = in.nextLine();
        System.out.println("Enter student grade: \n1 - Freshmen\n2 - Sophmore\n3 - Junior\n4 - Senior");
        this.grade=in.nextInt();
        setStudentID();
    }

    private void setStudentID(){
       /* id++;
        this.studentID=grade+""+id;*/
        id++;
        String key = Integer.toString(id);
        String gradeString =Integer.toString(grade);
        this.studentID=gradeString+key;
    }

    public void enroll(){
        do {
            System.out.print("Enter course to enroll (press Q to quit) : ");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("Q")) {
                courses = courses + "\n  " + course;
                balalnce = balalnce + costOfCourse;
            } else{
                break;
            }
        }while (1!=0);
    }

    public void viewBalance(){
        System.out.println("Your ballance is : $"+balalnce);
    }

    public void payBalance(){
        System.out.println("Ballance is: " +balalnce);
        Scanner in = new Scanner(System.in);
        System.out.print("How much money you want to pay? : ");
        int payment = in.nextInt();
        balalnce -=payment;
        System.out.println("Thank you for payment of : $"+payment);
        viewBalance();
    }

    public String showInfo(){
        return  "ID : "+studentID+"\n"+
                "Name: "+firstName+" "+lastName+"\n" +
                "Grade level : "+grade+"\n"+
                "Courses Enrolled:"+courses +"\n"+
                "Ballance is : $"+balalnce+"\n";
    }

}
