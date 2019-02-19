public class Car {
    private String brand,model, fuel;
    private int year;

    public Car(){
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.fuel = fuel;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getFuel() {
        return fuel;
    }

    public int getYear() {
        return year;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void CarDetails(){
        System.out.println("Brand: "+this.brand+" Model: "+this.model+" Year: "+this.year+" Fuel: "+this.fuel);
    }

    public static void main(String[] args){
        Car car = new Car();

        car.setBrand("Lamborghini");
        car.setModel("Aventador");
        car.setYear(2015);
        car.setFuel("petrol");

        car.CarDetails();

    }


}
