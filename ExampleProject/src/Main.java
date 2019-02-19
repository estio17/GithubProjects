import java.lang.reflect.Array;
import java.util.*;

public class Main {

    /*
    static void Welcome(String name, int age ){
        System.out.println("Welcome "+name+" happy birthday to yours "+age+" th.");
    }*/

    public static void main(String[] args){
        /*Random random = new Random();
        int number = random.nextInt(4)+1;
        System.out.println(number);

        switch(number){
            case 1 : System.out.println("Its Monday!");
            break;
            case 2: System.out.println("Its Tuesday!");
            break;
            case 3 : System.out.println("Its Wednesday!");
            break;
            case 4 : System.out.println("Its Thursday!");
            break;
        }*/

        /*
        int[] numbers ={1,2,3,4,5,6,7};

        for(int i=0; i< numbers.length; i++){
            numbers[i] +=2;
        }
        System.out.println(Arrays.toString(numbers));
           */
       // Welcome("John", 24);
       Integer[] nums = {1,2,3,4,5,6,7,8,9,10,11,12,13};

        Training training = new Training();
        System.out.println(training.Primes(nums));
        training.sayHello();
        training.WhatDay();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Zadaj svoje meno: ");
        Int name = scanner.nextLine();
        System.out.println(name);

    }
}
