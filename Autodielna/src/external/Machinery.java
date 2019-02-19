package external;

import java.util.List;

/**
 * Created by estok on 05.11.2017.
 */
public class Machinery {
    private List<MachinComp> parts;

    public Machinery(List<MachinComp> parts) {

        this.parts = parts;
    }

    public List<MachinComp> getMachParts(){
        return parts;
    }

    public MachinComp getMachPart(int i){
        return parts.get(i);
    }

    public void validate(){
        for (int i=0; i<parts.size();i++){
            if (getMachPart(i)==null){
                throw new IllegalArgumentException("Mechanizmus auta musí obsahovať nejaké súčiastky");
            }
        }

    }

}
