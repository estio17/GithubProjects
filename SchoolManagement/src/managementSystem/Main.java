package managementSystem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String [] args){
        Teacher angela = new Teacher(1,"Angela",600);
        Teacher peter = new Teacher(2,"Peter",650);
        Teacher jana = new Teacher(1,"Jana", 650);

        List<Teacher> teachers = new ArrayList<>();
        teachers.add(angela);
        teachers.add(peter);
        teachers.add(jana);

        Student tom = new Student(1,"Tom",2);
        Student alex = new Student(2,"Alex",5);
        Student alena = new Student(3,"Alena",9);

        List<Student> students = new ArrayList<>();
        students.add(tom);
        students.add(alex);
        students.add(alena);

        School gymgir = new School(teachers,students);
        System.out.println("Gymgir earned total $"+gymgir.getTotalMoneyEarned());
        tom.payFee(15000);
        System.out.println("Tom has to pay :"+tom.getRemainingFees()+"$ more.");
        System.out.println("Gymgir earned total $"+gymgir.getTotalMoneyEarned());
        tom.payFee(15000);
        System.out.println("Tom has to pay :"+tom.getRemainingFees()+"$ more.");
        System.out.println("Gymgir earned total $"+gymgir.getTotalMoneyEarned());
        alena.payFee(30000);
        alex.payFee(30000);
        System.out.println("Gymgir earned total $"+gymgir.getTotalMoneyEarned());

        System.out.println("---------------Teacher payments ----------------");
        angela.receivePayment(angela.getSalary());
        peter.receivePayment(peter.getSalary());
        jana.receivePayment(jana.getSalary());
        System.out.println("Gymgir payed total $"+gymgir.getTotalMoneySpent());
        System.out.println("Gymgir has total $"+gymgir.getTotalMoneyEarned());
        jana.receivePayment(jana.getSalary());
        System.out.println("Gymgir payed total $"+gymgir.getTotalMoneySpent());
        System.out.println("Gymgir has total $"+gymgir.getTotalMoneyEarned());

        System.out.println(tom);
    }
}
