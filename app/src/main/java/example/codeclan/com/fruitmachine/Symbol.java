package example.codeclan.com.fruitmachine;

/**
 * Created by user on 03/11/2017.
 */

public enum Symbol {

    CHERRY("Cherry", 5),
    BELL("Bell", 10),
    BAR("Bar", 20),
    SEVEN("Seven", 50);

    int payout;
    String type;

    Symbol(String type, int payout){
        this.type = type;
        this.payout = payout;
    }

    public String getType(){
        return this.type;
    }

    public int getPayout(){
        return payout;
    }

    public static Symbol getRandom() {
        return values()[(int) (Math.random() * values().length)];
    }

    public int getSize(){
        return this.getSize();
    }

}
