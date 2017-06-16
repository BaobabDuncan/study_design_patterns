package adapter;

import junit.framework.TestCase;

/**
 * Created by Administrator on 2017-06-15.
 */
public class DuckTest extends TestCase {
    public void testInit(){
        Duck duck = new MallardDuck();
        assertEquals("Quack", duck.quack());
        assertEquals("I'm flying", duck.fly());
    }

    public void testInitUseAdapter(){
        Turkey duck = new DuckAdapter(new MallardDuck());

        assertEquals("Quack", duck.gobble());
        assertEquals("I'm flying", duck.fly());
    }
}
