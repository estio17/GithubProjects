package Interpreter;

import external.Car;
import external.Component;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by estok on 16.10.2017.
 */
public class CarInterpreter {
    private List<Car> car;

    public CarInterpreter(List<Car> car) {

        this.car = car;
    }

    public void readInput() throws IOException {
        BufferedReader br;
        String brand;
        String entry;
        List<Car> foundCar= new ArrayList<>();

        String area;
        String comp;

        List<Car> foundComponent= new ArrayList<>();

        String model_name;
        List<Car> foundModel = new ArrayList<>();


        System.out.println("Zadaj špecifikácu vyhľadávania: ");
        br = new BufferedReader(new InputStreamReader(System.in));
        entry = br.readLine();
        String[] entries = entry.split(",");

        brand = entries[0];
        for (Car aCar : car) {
            if (aCar.getBrand().equals(brand)){
                foundCar.add(aCar);
                System.out.println(aCar.getBrand()+" "+aCar.getModel());
            }
        }

        model_name = entries[1];
        for (Car aFoundCar : foundCar) {
            if (aFoundCar.getModel().equals(model_name)) {
                foundModel.add(aFoundCar);
                //System.out.println(aFoundCar.getBodywork()+" "+aFoundCar.getMachinery());
            }
        }


        area = entries[2];
        if (area.equals("Bodywork")){
           String front_rear = entries[3];
            if (front_rear.equals("front")){
                for (Car aFoundModel : foundModel) {
                    for (int j = 0; j < aFoundModel.getBodywork().getFrontParts().size(); j++){
                        //System.out.println(aFoundModel.getBodywork().getFrontPart(j));
                    }
                    comp = entries[4];
                    for (int i = 0; i < aFoundModel.getBodywork().getFrontParts().size(); i++) {
                        if (aFoundModel.getBodywork().getFrontPart(i).getName().equals(comp)) {
                            foundComponent.add(aFoundModel);
                            for (int k=0; k<aFoundModel.getBodywork().getFrontPart(i).getBrands().size();k++){
                                System.out.println("Značka výrobku: " +aFoundModel.getBodywork().getFrontPart(i).getBrands().get(k).getBrand());
                                 for (int j=0; j<aFoundModel.getBodywork().getFrontPart(i).getBrands().get(i).getSupplier().size();j++){
                                     System.out.println("Dovozca: "+aFoundModel.getBodywork().getFrontPart(i).getBrands().get(k).getSupplier().get(j));
                                 }
                            }
                        }
                    }
                }
            }else {
                for (Car aFoundModel : foundModel) {
                    for (int j = 0; j < aFoundModel.getBodywork().getRearParts().size(); j++){
                        //System.out.println(aFoundModel.getBodywork().getRearPart(j));
                    }
                comp = entries[4];
                    for (int i = 0; i < aFoundModel.getBodywork().getRearParts().size(); i++) {
                        if (aFoundModel.getBodywork().getRearPart(i).getName().equals(comp)) {
                            foundComponent.add(aFoundModel);
                            for (int k=0; k<aFoundModel.getBodywork().getRearPart(i).getBrands().size();k++) {
                                System.out.println("Značka výrobku: "+ aFoundModel.getBodywork().getRearPart(i).getBrands().get(k).getBrand());
                                for (int j=0; j<aFoundModel.getBodywork().getRearPart(i).getBrands().get(i).getSupplier().size();j++){
                                    System.out.println("Dovozca: "+ aFoundModel.getBodywork().getRearPart(i).getBrands().get(k).getSupplier().get(j));
                                }
                            }
                        }
                    }
                }
            }
        }else {
            for (Car aFoundModel : foundModel) {
                for (int j = 0; j < aFoundModel.getMachinery().getMachParts().size(); j++){
                  //  System.out.println(aFoundModel.getMachinery().getMachPart(j));
                }
                comp = entries[3];
                for (int i = 0; i < aFoundModel.getMachinery().getMachParts().size(); i++) {
                    if (aFoundModel.getMachinery().getMachPart(i).getName().equals(comp)) {
                        foundComponent.add(aFoundModel);
                        for (int k=0; k<aFoundModel.getMachinery().getMachPart(i).getBrands().size();k++) {
                            System.out.println("Značka výrobku: "+ aFoundModel.getMachinery().getMachPart(i).getBrands().get(k).getBrand());
                            for (int j=0; j<aFoundModel.getMachinery().getMachPart(i).getBrands().get(i).getSupplier().size();j++){
                                System.out.println("Dovozca: " + aFoundModel.getMachinery().getMachPart(i).getBrands().get(k).getSupplier().get(j));
                            }
                        }
                    }
                }
            }
        }


       /* for (Car aFoundModel : foundModel) {
            for (int j = 0; j < aFoundModel.getComponents().size(); j++) {
                if (aFoundModel.getComponent(j).getName().equals(comp_name)) {
                    foundComponent.add(aFoundModel);
                    System.out.println(comp_name + " " + aFoundModel.getComponent(j).getCompBrand());
                }
            }
        }*/



    }


}
