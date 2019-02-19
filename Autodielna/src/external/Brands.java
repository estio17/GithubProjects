package external;

import java.util.List;

/**
 * Created by estok on 06.11.2017.
 */
public class Brands {
    private String producer;
    List<String> supplier;


    public Brands(String producer, List<String> supplier){
        this.producer = producer;
        this.supplier = supplier;
    }

    public List<String> getSupplier(){
        return supplier;
    }

    public String getBrand(){
        return producer;
    }

    public void validate(){
        if (getBrand().isEmpty()){
            throw new IllegalArgumentException("Komponent musí mať výrobcu");
        }
        if (getSupplier().isEmpty()){
            throw new IllegalArgumentException("Komponent musí mať jedného alebo viacerých dodávateľov");
        }
    }

}
