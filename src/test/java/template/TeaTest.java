package template;

import junit.framework.TestCase;

/**
 * Created by Administrator on 2017-06-17.
 */
public class TeaTest extends TestCase {
    public void testInit(){
        Tea tea = new Tea();
        tea.prepareRecipe();
    }
}
