package simuduck;

import junit.framework.TestCase;
import simuduck.MuteQuack;
import simuduck.Quack;
import simuduck.QuackBehavior;
import simuduck.Squack;

/**
 * Created by sanguk on 09/06/2017.
 */
public class QuackTest extends TestCase {
    public void testInit(){
        QuackBehavior quack1 = new Quack();
        assertEquals("꽥꽥", quack1.quack());

        QuackBehavior quack2 = new Squack();
        assertEquals("삑삑", quack2.quack());

        QuackBehavior quack3 = new MuteQuack();
        assertEquals("..", quack3.quack());
    }

}
