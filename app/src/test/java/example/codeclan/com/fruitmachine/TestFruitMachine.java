package example.codeclan.com.fruitmachine;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static junit.framework.Assert.assertEquals;

/**
 * Created by user on 03/11/2017.
 */

public class TestFruitMachine {

    FruitMachine machine;
    Symbol symEnum;

    @Before
    public void setUp(){;
        machine = new FruitMachine(3);
    }

//        FruitMachine spy = Mockito.spy(new FruitMachine(3));
//        Mockito.when(spy.calcWinnings(Symbol.JACKPOT));

    @Test
    public void testSpinFillsSlots(){
        machine.spin();
        assertEquals(machine.getNoOfSlots(), machine.getSlotSize());
    }



    @Test
    public void testWonPrize(){
        int result = machine.calcWinnings(Symbol.JACKPOT);
        assertEquals(100, result);
    }

    @Test
    public void testNoPrize(){
        int result = machine.calcWinnings(null);
        assertEquals(0, result);
    }




}
