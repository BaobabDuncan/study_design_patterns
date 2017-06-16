package adapter;
import junit.framework.TestSuite;

/**
 * Created by sanguk on 09/06/2017.
 */
public class AllTests {
    public static TestSuite suite(){
        TestSuite suite = new TestSuite();
        suite.addTestSuite(DuckTest.class);
        suite.addTestSuite(TurkeyTest.class);
        return suite;
    }
}
