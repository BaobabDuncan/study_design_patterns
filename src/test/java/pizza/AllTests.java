package pizza;


import junit.framework.TestSuite;

/**
 * Created by sanguk on 09/06/2017.
 */
public class AllTests {
    public static TestSuite suite(){
        TestSuite suite = new TestSuite();
        suite.addTestSuite(PizzaTest.class);
        return suite;
    }
}
