import javax.xml.stream.FactoryConfigurationError;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Training {

    protected void sayHello(){
        System.out.println("Hello mate ! ");
    }

    public List<Integer> Primes(Integer[] numbers){
        List<Integer> primes = new ArrayList<>();
        for (Integer n: numbers) {
            if(n != 1 &&((n == 2) || ((n % 2) != 0))){
                primes.add(n);
            }
        }
        return primes;
    }

    protected void WhatDay(){
        Random random = new Random();
        int day = random.nextInt(7)+1;
        switch (day){
            case 1 :
                System.out.println("Dnes je Pondelok.");
                break;
            case 2:
                System.out.println("Dnes je Utorok.");
                break;
            case 3:
                System.out.println("Dnes je Streda.");
                break;
            case 4:
                System.out.println("Dnes je Stvrtok.");
                break;
            case 5:
                System.out.println("Dnes je Piatok.");
                break;
            case 6:
                System.out.println("Dnes je Sobota.");
                break;
            case 7:
                System.out.println("Dnes je Nedela.");
        }
    }

    public static void main(String[] args){
    }

}
