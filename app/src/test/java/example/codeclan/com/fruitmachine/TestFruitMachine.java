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
        machine = new FruitMachine(symEnum, 3);
    }

    @Test
    public void testAddToSymbols(){
        assertEquals(4, machine.getNoOfSymbols());
    }

    @Test
    public void testGetRandomInt(){
        FruitMachine spy = Mockito.spy(new FruitMachine(symEnum, 3));
        Mockito.when(spy.getRandomInt()).thenReturn(1);
        assertEquals(1, spy.getRandomInt());
    }

}
