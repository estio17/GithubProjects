package external;

import java.util.List;

/**
 * Created by estok on 05.11.2017.
 */
public class Bodywork {
    private List<FrontComp> front_parts;
    private List<RearComp> rear_parts;


    public Bodywork(List<FrontComp> front_parts, List<RearComp> rear_parts){
        this.front_parts = front_parts;
        this.rear_parts = rear_parts;
    }

    public List<FrontComp> getFrontParts(){
        return front_parts;
    }

    public FrontComp getFrontPart(int i){
        return front_parts.get(i);
    }

    public String getFrontCompNAME(){
        String name =" ";
        for (int i=0; i<front_parts.size();i++){
            name=getFrontPart(i).getName();
        }
        return name;
    }

    public String getRearCompNAME(){
        String name =" ";
        for (int i=0; i<rear_parts.size();i++){
            name=getRearPart(i).getName();
        }
        return name;
    }

    public List<RearComp> getRearParts(){
        return rear_parts;
    }

    public RearComp getRearPart(int i){
        return rear_parts.get(i);
    }

    public void validate(){
    for (int i=0; i<front_parts.size();i++){
        if (getFrontPart(i)==null){
            throw new IllegalArgumentException("Predná karoséria musí obsahovať nejaké súčiastky");
        }
    }
    for (int j=0; j<rear_parts.size();j++){
        if (getRearPart(j)==null){
            throw new IllegalArgumentException("Zadná karoséria musí obsahovať nejaké súčiastky");
        }
    }
    if (getFrontCompNAME().isEmpty()){
        throw new IllegalArgumentException("Zadaj názov komponentu prednej karosérie");
    }
        if (getFrontCompNAME().isEmpty()){
            throw new IllegalArgumentException("Zadaj názov komponentu zadnej karosérie");
        }
    }

}
