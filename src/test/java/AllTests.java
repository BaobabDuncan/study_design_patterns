import junit.framework.TestSuite;

/**
 * Created by sanguk on 09/06/2017.
 */
public class AllTests {
    public static TestSuite suite(){
        TestSuite suite = new TestSuite();
        suite.addTest(simuduck.AllTests.suite());
        suite.addTest(weather.AllTests.suite());
        suite.addTest(beverage.AllTests.suite());
        suite.addTest(pizza.AllTests.suite());
        suite.addTest(chocolate.AllTests.suite());
        return suite;
    }
}