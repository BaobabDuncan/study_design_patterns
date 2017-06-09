package simuduck;

import junit.framework.TestCase;
import simuduck.FlyBehavior;
import simuduck.FlyNoWay;
import simuduck.FlyRocketPowered;
import simuduck.FlyWithWings;

/**
 * Created by sanguk on 09/06/2017.
 */
public class FlyTest extends TestCase {
    public void testInit(){
        FlyBehavior fly1 = new FlyWithWings();
        assertEquals("날고 있어요!!", fly1.fly());

        FlyBehavior fly2 = new FlyNoWay();
        assertEquals("저는 못 날아요", fly2.fly());

        FlyBehavior fly3 = new FlyRocketPowered();
        assertEquals("로켓 추진으로 날아갑니다.", fly3.fly());
    }
}
