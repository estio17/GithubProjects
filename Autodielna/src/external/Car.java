package external;

/**
 * Created by estok on 15.10.2017.
 */
public class Car {
    private String brand;
    private String type;
    Machinery machinery;
    Bodywork bodywork;

        public Car(String brand, String type, Bodywork bodywork, Machinery machinery){
            this.brand = brand;
            this.type = type;
            this.bodywork = bodywork;
            this.machinery = machinery;
        }

    public String getBrand(){
        return brand;
    }

    public String getModel(){
        return type;
    }

    public Machinery getMachinery(){
        return machinery;
    }

    public Bodywork getBodywork(){
        return bodywork;
    }

    public void validate(){
        if (getBrand().isEmpty()){
         throw new IllegalArgumentException("Auto musí mať značku(výrobcu)");
        }
        if (getBrand()==null){
            throw new IllegalArgumentException("Auto musí mať značku(výrobcu)");
        }
        if (getModel().isEmpty()){
         throw new IllegalArgumentException("Auto musí mať definovaný model");
        }
        if (getBodywork().getFrontParts().isEmpty()){
            throw new IllegalArgumentException("Autodiel prednej karosérie musí mať značku(výrobcu)- Zadal si prázdny reťazec ! ");
        }
        if (getBodywork().getRearParts().isEmpty()){
            throw new IllegalArgumentException("Autodiel zadnej karosérie musí mať značku(výrobcu)- Zadal si prázdny reťazec ! ");
        }
        if (getMachinery().getMachParts().isEmpty()){
            throw new IllegalArgumentException("Autodiel mechanizmu musí mať značku(výrobcu)- Zadal si prázdny reťazec ! ");
        }
        machinery.validate();
        bodywork.validate();
    }
/*
    public Car(){
        private String brand;
        private String type;
        Machinery Machinery;
        Bodywork Bodywork;

        public Car setBrand(String brand){
            this.brand = brand;
            return this;
        }

        public Car setType(String type){
            this.type = type;
            return this;
        }

        public Car setMachinery(Machinery Machinery){
            this.Machinery = Machinery;
            return this;
        }

        public Car setBodywork(Bodywork Bodywork){
            this.Bodywork = Bodywork;
            return this;
        }

    }*/
}
