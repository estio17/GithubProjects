package CarManagement;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Car {

    private String brand;
    private String model;
    private int rv;
    private String spz;
    private Date stk, emisna;
    private Date expStk, expEmisna;
    private int km;
    private String fuel;


    public Car(){
        Scanner in = new Scanner(System.in);
        System.out.println("Zadajte nasledujúce parametre oddelené medzerou: 1.Značka  2.Model 3.Palivo 4.Rok vyroby " +
                "5.Spz 6.km 7.STK 8.Emisna 9.exp STK 10.exp Emisna");
        this.brand = in.next();
        this.model = in.next();
        this.fuel = in.next();
        this.rv = in.nextInt();
        this.spz = in.next();
        this.km = in.nextInt();

        String dateSpz = in.next();
        SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");
        try {
            this.stk = format.parse(dateSpz);
        } catch (ParseException e) {
            System.out.println("Invalid format");
        }

        String dateEms = in.next();
        try {
            this.emisna = format.parse(dateEms);
        }catch (ParseException e) {
            System.out.println("Invalid format");
        }

        String expS = in.next();
        try {
            this.expStk = format.parse(expS);
        }catch (ParseException e) {
            System.out.println("Invalid format");
        }

        String expE = in.next();
        try {
            this.expEmisna = format.parse(expE);
        }catch (ParseException e) {
            System.out.println("Invalid format");
        }

        System.out.println("Car was registered.");

        do {
            System.out.println("\nWhat do you wish to do ? \nWrite: \n1 for getting information. \n" +
                    "2 for modify details \n3 for showing all info \nQ for quitting");
            Scanner input = new Scanner(System.in);
            String userChoice = input.nextLine();
            if(!userChoice.equals("Q")){
                if (userChoice.equals("1")){
                    System.out.println("Which information you want to get ? : \n " +
                            "Type 1 for Brand \n 2 for Model \n 3 for SPZ \n 4 for STK and EMS" );
                    Scanner input2 = new Scanner(System.in);
                    String choice1 = input2.nextLine();
                    if (choice1.equals("1")){
                        getBrand();
                    }else if(choice1.equals("2")){
                        getModel();
                    }else if (choice1.equals("3")){
                        getSpz();
                    }else {
                        getStk();
                        getEmisna();
                    }
                }else if (userChoice.equals("2")){
                    System.out.println("Which information you want to change ? : \n" +
                            "Type 1 for Brand \n2 for Model \n3 for SPZ" );
                    Scanner input3 = new Scanner(System.in);
                    String choice2 = input3.nextLine();
                    switch (choice2){
                        case "1": System.out.println("Type new brand: ");
                            Scanner input4 = new Scanner(System.in);
                            String newBrand = input4.nextLine();
                            setBrand(newBrand);
                            getBrand();
                            break;
                        case "2": System.out.println("Type new model: ");
                            Scanner input5 = new Scanner(System.in);
                            String newModel = input5.nextLine();
                            setModel(newModel);
                            getModel();
                            break;
                        case "3": System.out.println("Type new SPZ: ");
                            Scanner input6 = new Scanner(System.in);
                            String newSpz = input6.nextLine();
                            setSpz(newSpz);
                            getSpz();
                            break;
                    }
                    System.out.println("Try again your choice.");
                }else if (userChoice.equals("3")){
                    getDetails();
                }else {System.out.println("Opakuj volbu : ");}
            }else{
                System.out.println("GoodBye");
                break;
            }
        }while (1!=0);

    }

    private void getDetails(){
        System.out.println("\n Detaily auta : \n" +
                "Znacka : "+brand+"\n" +
                "Model : "+model+"\n" +
                "Palivo : "+fuel+"\n" +
                "Rok vyroby : "+rv+"\n" +
                "SPZ a kilometre : "+spz+" "+km+"\n" +
                "STK a Emisna kontrola : "+stk+" "+emisna+"\n" +
                "Expiracia STK a Emisnej : "+expStk+" "+expEmisna);
    }

    public void getBrand() {
        System.out.println("Brand of Car is :"+brand);
    }

   private void setBrand(String brand) {
        this.brand = brand;
    }

    public void getModel() {
        System.out.println("Model of Car is :"+model);
    }

    private void setModel(String model) {
        this.model = model;
    }

    public int getRv() {
        return rv;
    }

    public void setRv(int rv) {
        this.rv = rv;
    }

    public void getSpz() {
        System.out.println("SPZ of Car is :"+spz);
    }

    private void setSpz(String spz) {
        this.spz = spz;
    }

    public void getStk() {
        System.out.println("STK of Car is :"+stk.toString());
    }

    public void setStk(Date stk) {
        this.stk = stk;
    }

    public void getEmisna() {
        System.out.println("Emisna of Car is :"+emisna.toString());
    }

    public void setEmisna(Date emisna) {
        this.emisna = emisna;
    }

    public Date getExpStk() {
        return expStk;
    }

    public void setExpStk(Date expStk) {
        this.expStk = expStk;
    }

    public Date getExpEmisna() {
        return expEmisna;
    }

    public void setExpEmisna(Date expEmisna) {
        this.expEmisna = expEmisna;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }
}
