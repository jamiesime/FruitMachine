package example.codeclan.com.fruitmachine;

/**
 * Created by user on 03/11/2017.
 */

public class Slot {

    private Symbol type;

    public Slot(Symbol type) {
        this.type = type;
    }

    public String getType() {
        return type.toString();
    }

    public Symbol getSymbol(){
        return this.type;
    }
}
