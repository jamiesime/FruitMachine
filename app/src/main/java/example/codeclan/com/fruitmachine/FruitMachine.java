package example.codeclan.com.fruitmachine;

import java.util.ArrayList;
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

//
//    public int getNoOfSymbols(){
//        return symEnum.getSize();
//    }
//
//    public int getRandomInt(){
//        Random rand = new Random();
//        int noOfSymbols = getNoOfSymbols();
//        int random = rand.nextInt(noOfSymbols);
//        return random;
//    }

    public void spin(){
        for (int i = 0 ; i < noOfSlots ; i++){
            slots.add(new Slot(Symbol.getRandom().getType()));
            System.out.println(slots.get(i).getType());
        }
    }



}
