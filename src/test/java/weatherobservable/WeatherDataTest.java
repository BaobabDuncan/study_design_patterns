package weatherobservable;

import junit.framework.TestCase;

/**
 * Created by sanguk on 09/06/2017.
 */
public class WeatherDataTest extends TestCase {
    public void testInit(){
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);

        weatherData.setMeasurements(10,20,30);
    }
}
