package adapter;

import junit.framework.TestCase;

/**
 * Created by Administrator on 2017-06-15.
 */
public class TurkeyTest extends TestCase {
    public void testInit(){
        Turkey turkey = new WildTurkey();

        assertEquals("Gobble gobble", turkey.gobble());
        assertEquals("I'm flying a short distance", turkey.fly());
    }

    public void testInitUseAdapter(){
        Duck turkey = new TurkeyAdapter(new WildTurkey());
        assertEquals("Gobble gobble", turkey.quack());
        assertEquals("I'm flying a short distance", turkey.fly());
    }
}
