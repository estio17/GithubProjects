package external;

import java.util.List;

/**
 * Created by estok on 15.10.2017.
 */

public class Component {
    private String name;
    private List<Brands> brands;

    public Component(String name, List<Brands> brands) {
        this.name = name;
        this.brands =brands;
    }

    public String getName() {
        return name;
    }

    public List<Brands> getBrands(){
        return brands;
    }

    public void validate(){
        if (getName()==null){
            throw new IllegalArgumentException("Autodiel musí mať názov");
        }
        if (getBrands()==null){
            throw new IllegalArgumentException("Autodiel musí mať značku(výrobcu)");
        }
        if (getBrands().isEmpty()){
            throw new IllegalArgumentException("Autodiel musí mať značku(výrobcu)- Zadal si prázdny reťazec");
        }
    }
    /*public List<String> getCompBrand() {
        return brand;
    }*/

    /*
    public Component setName(String name) {
        this.name = name;
        return this;
    }

    public Component setBrand(String brand) {
        this.brand = brand;
        return this;
    }
    */

}
