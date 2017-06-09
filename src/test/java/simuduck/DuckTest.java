package simuduck;

import junit.framework.TestCase;
import simuduck.*;

/**
 * Created by sanguk on 09/06/2017.
 */
public class DuckTest extends TestCase {
    public void testInit(){

        Duck mallard_duck = new MallardDuck();
        assertEquals("swim", mallard_duck.swim());
        assertEquals("물오리 모양", mallard_duck.display());
        assertEquals("꽥꽥", mallard_duck.performQuack());
        assertEquals("날고 있어요!!", mallard_duck.performFly());

        Duck red_head_duck = new RedheadDuck();
        assertEquals("swim", red_head_duck.swim());
        assertEquals("붉은머리 오리 모양", red_head_duck.display());
        assertEquals("삑삑", red_head_duck.performQuack());
        assertEquals("날고 있어요!!", red_head_duck.performFly());

        Duck rubber_duck = new RubberDuck();
        assertEquals("swim", rubber_duck.swim());
        assertEquals("고무 오리 모양", rubber_duck.display());
        assertEquals("..", rubber_duck.performQuack());
        assertEquals("저는 못 날아요", rubber_duck.performFly());

        Duck model_duck = new ModelDuck();
        assertEquals("swim", model_duck.swim());
        assertEquals("모델 오리 모양", model_duck.display());
        assertEquals("꽥꽥", model_duck.performQuack());
        assertEquals("저는 못 날아요", model_duck.performFly());
        model_duck.setFlyBehavior(new FlyRocketPowered());
        assertEquals("로켓 추진으로 날아갑니다.", model_duck.performFly());

    }
}
