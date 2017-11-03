package example.codeclan.com.fruitmachine;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * Created by user on 03/11/2017.
 */

public class FruitMachine {

    private int noOfSlots;
    private ArrayList<Slot> slots;

    public FruitMachine(int noOfSlots) {
        this.noOfSlots = noOfSlots;
        slots = new ArrayList<>();
    }

    public int getNoOfSlots() {
        return noOfSlots;
    }

    public void spin(){
        for (int i = 0 ; i < noOfSlots ; i++){
            slots.add(new Slot(Symbol.getRandom()));
            System.out.println(slots.get(i).getType());
        }
    }

    public int getSlotSize() {
        return slots.size();
    }

    public void checkResults() {
        for (Symbol sym : Symbol.values()) {
            int count = 0;
            for (Slot slot : slots) {
                if (slot.getSymbol() == sym) {
                    count ++;
                }
            }
            if (count > 2){
                Symbol matched = sym;
                calcWinnings(matched);
                return;
            }
        }
        calcWinnings(null);

    }

    public int calcWinnings(Symbol match){
        int winnings = 0;
        if (match != null) {
            winnings = match.getPayout();
            System.out.println("Your winnings are " + winnings);
            return winnings;
        }
        else{
            System.out.println("You have won absolutely nothing.");
            return winnings;
        }
    }





}
