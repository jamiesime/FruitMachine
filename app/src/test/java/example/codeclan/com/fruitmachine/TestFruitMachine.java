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

//    @Test
//    public void testWonGame(){
//        FruitMachine spy = Mockito.spy(new FruitMachine(3));
//        Mockito.when(spy.checkResults())
//        machine.checkResults();
//        assert
//    }

}
