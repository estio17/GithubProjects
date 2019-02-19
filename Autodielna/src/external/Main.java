package external;

import Interpreter.CarInterpreter;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static external.NestedFunction.*;
/**
 * Created by estok on 16.10.2017.
 */
public class Main {
    public static void main(String[] args) {

        Car car1 = car(
                "Škoda",
                "Rapid",
                bodywork(
                        frontParts(
                                frontComp("Žiarovka predného svetlometu",brands(brand("KRAFT AUTOMOTIVE",supplier("Aleo","Morn"))))
                        ),
                        rearParts(
                                rearComp("Žiarovka brzdového svetla",brands(brand("KRAFT AUTOMOTIVE",supplier("DS Autodiely")),
                                        brand("BOSCH",supplier("DS Autodiely"))))
                        )
                ),
                machinery(
                        machineryParts(
                                machinComp("Tesnenie pod hlavu",brands(brand("VALEO",supplier("Aleo","Morn")))),
                                machinComp("Startér",brands(brand("BOSCH",supplier("KRAFT"))))
                        )
                )
        );
        car1.validate();

        /*Car car2 = car(
                "Škoda",
                "Octavia",
                bodywork(
                        frontParts(
                                front_Comp("Žiarovka hlavného svetlometu","KRAFT AUTOMOTIVE")
                        ),
                        rearParts(
                                rear_Comp("Startér","BOSCH")
                        )
                ),
                machinery(
                        machineryParts(
                                machin_Comp("Spojková sada","VALEO")
                        )
                )
        );*/


        List<Car> carlist = new ArrayList<Car>();
        carlist.add(car1);
        //carlist.add(car2);

        CarInterpreter interpreter = new CarInterpreter(carlist);

        try {
            interpreter.readInput();
        } catch (IOException e) {
            e.printStackTrace();
        }

        /*
        Component component1 = new Component("Tesnenie pod hlavu","AJUSA");
        Component component2 = new Component("Spojková sada","VALEO");
        Component component3 = new Component("Startér","BOSCH");
        Component component4 = new Component("Žiarovka hlavného svetlometu","KRAFT AUTOMOTIVE");

        List<Component> list = new ArrayList<Component>();
        list.add(component1);
        list.add(component2);
        list.add(component3);
        list.add(component4);

        Car car1 = new Car("Škoda","Fabia",list);
        Car car2 = new Car("Škoda","Octavia",list);
        Car car3 = new Car("Škoda","Rapid",list);

        List<Car> carlist = new ArrayList<Car>();
        carlist.add(car1);
        carlist.add(car2);
        carlist.add(car3);

        CarInterpreter interpreter = new CarInterpreter(carlist);

        try {
            interpreter.readInput();
        } catch (IOException e) {
            e.printStackTrace();
        }*/



    }
}
