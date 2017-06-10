package chocolate;

import junit.framework.TestCase;

/**
 * Created by Administrator on 2017-06-10.
 */
public class ChocolateBoilerTest extends TestCase {
    public void testInit(){
        ChocolateBoiler chocolateBoiler = ChocolateBoiler.getInstance();

        assertEquals(true, chocolateBoiler.isEmpty());
        assertEquals(false, chocolateBoiler.isBoiled());

        chocolateBoiler.fill();

        assertEquals(false, chocolateBoiler.isEmpty());
        assertEquals(false, chocolateBoiler.isBoiled());

        chocolateBoiler.boil();

        assertEquals(false, chocolateBoiler.isEmpty());
        assertEquals(true, chocolateBoiler.isBoiled());

        chocolateBoiler.drain();

        assertEquals(true, chocolateBoiler.isEmpty());
        assertEquals(true, chocolateBoiler.isBoiled());


        ChocolateBoiler chocolateBoiler1 = ChocolateBoiler.getInstance();

        assertEquals(true, chocolateBoiler1.isEmpty());
        assertEquals(true, chocolateBoiler1.isBoiled());

    }

}
