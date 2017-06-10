package beverage;

import junit.framework.TestCase;

/**
 * Created by Administrator on 2017-06-10.
 */
public class BeverageTest extends TestCase {
    public void testInit(){
        Beverage beverage = new Espresso(Beverage.TALL);
        assertEquals("에스프레소", beverage.getDescription());
        assertEquals(Beverage.TALL, beverage.getSize());
        assertEquals(1.99, beverage.cost());
        Beverage beverage1 = new HouseBlend(Beverage.TALL);
        assertEquals("하우스 블렌드 커피", beverage1.getDescription());
        assertEquals(.89, beverage1.cost());
        beverage1 = new Mocha(beverage1);
        assertEquals("하우스 블렌드 커피, 모카", beverage1.getDescription());
        assertEquals(1.09, beverage1.cost());
        beverage1 = new Mocha(beverage1);
        assertEquals("하우스 블렌드 커피, 모카, 모카", beverage1.getDescription());
        assertEquals(1.29, beverage1.cost());
        beverage1 = new Whip(beverage1);
        assertEquals("하우스 블렌드 커피, 모카, 모카, 휘핑 크림", beverage1.getDescription());
        assertEquals(1.39, beverage1.cost(), 0.000001);
        beverage1 = new Soy(beverage1);
        assertEquals("하우스 블렌드 커피, 모카, 모카, 휘핑 크림, 듀유", beverage1.getDescription());
        assertEquals(1.49, beverage1.cost(), 0.000001);

    }
}
