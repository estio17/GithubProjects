package EmailGenerator;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private int mailboxCapacity = 400;
    private int defaultPassLength = 8;
    private String email;
    private String sufix ="company.com";
    private String alternateEmail;

    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName=lastName;
        this.department=setDepartment();
        this.password = randomPassword(defaultPassLength);
        //System.out.println("Email generated :\n"+this.firstName+" "+this.lastName+"\n"+this.department+"\n"+this.password);
        email = firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+"."+sufix;
        System.out.println(email);
    }

    private String setDepartment(){
        System.out.print("Enter department : \n1 for Sales\n2 for Development \n3 for Accounting\n0 for none\n");
        Scanner in = new Scanner(System.in);
        int department = in.nextInt();
            if (department==1){
                return "sales";
            }else if (department==2){
                return "dev";
            }else if (department==3){
                return "acct";
            }else {return "";}
    }

    private String randomPassword(int length){
        String passwordSet ="ABCDEFGHIJKLMNOPRSTUVWXYZ0123456789#@$&%";
        char [] password = new char[length];
        for (int i=0; i< length; i++){
            int rand=(int)(Math.random()*passwordSet.length());
            password[i] =passwordSet.charAt(rand);
        }
        return new String(password);
    }

    public void setMailboxCapacity(int capacity){
        this.mailboxCapacity = capacity;
    }

    public void setAlternateEmail(String altEmail) {
        this.alternateEmail = altEmail;
    }

    public void changePassword(String password){
        this.password= password;
    }

    public String getPassword() {
        return password;
    }

    public int getMailboxCapacity() {
        return mailboxCapacity;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }

    public void showInfo(){
        System.out.println("Name : "+this.firstName+" "+this.lastName+"\n"+
                "Company email : "+this.email+"\n"+
                "Mailbox capacity : "+this.mailboxCapacity);
    }
}
