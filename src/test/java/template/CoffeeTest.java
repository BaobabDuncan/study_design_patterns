package template;

import junit.framework.TestCase;

/**
 * Created by Administrator on 2017-06-17.
 */
public class CoffeeTest extends TestCase {
    public void testInit(){
        Coffee coffee = new Coffee();
        coffee.prepareRecipe();
    }
}
