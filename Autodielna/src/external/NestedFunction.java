package external;

import java.util.Arrays;
import java.util.List;

/**
 * Created by estok on 04.11.2017.
 */
public class NestedFunction {
    public static Car car(String brand, String type, Bodywork bodywork, Machinery machinery) {
        return new Car(brand, type, bodywork, machinery);
    }
    public static Component component(String name, List<Brands> brands) {
        return new Component(name, brands);
    }

    public static FrontComp frontComp(String name, List<Brands> brands) {
        return new FrontComp(name, brands);
    }

    public static RearComp rearComp(String name, List<Brands> brands) {return new RearComp(name,brands);}

    public static MachinComp machinComp(String name, List<Brands> brands) {
        return new MachinComp(name, brands);
    }

    public static Machinery machinery(List<MachinComp> parts) {
        return new Machinery(parts);
    }

    public static Brands brand(String producer, List<String> supplier){return new Brands(producer,supplier);}

    public static List<Brands> brands(Brands... brands) {return Arrays.asList(brands);}

    public static List<String>supplier(String... supplier){
        return Arrays.asList(supplier);
    }

    public static List<MachinComp> machineryParts(MachinComp... parts) {
        return Arrays.asList(parts);
    }

    public static Bodywork bodywork(List<FrontComp> front_parts, List<RearComp> rear_parts) {
        return new Bodywork(front_parts, rear_parts);
    }

    public static List<FrontComp> frontParts(FrontComp... front_parts) {
        return Arrays.asList(front_parts);
    }

    public static List<RearComp> rearParts(RearComp... rear_parts) {
        return Arrays.asList(rear_parts);
    }
}
