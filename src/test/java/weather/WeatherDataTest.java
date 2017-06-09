package weather;

import junit.framework.TestCase;

/**
 * Created by sanguk on 09/06/2017.
 */
public class WeatherDataTest extends TestCase {
    public void testInit(){
        WeatherData weatherData = new WeatherData();

        assertEquals(0.0, weatherData.getTemperature(), 0.00001);
        assertEquals(0.0, weatherData.getHumidity(), 0.00001);
        assertEquals(0.0, weatherData.getPressure(), 0.00001);

        DisplayElement currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        DisplayElement forecastDisplay = new ForecastDisplay(weatherData);
        DisplayElement statisticsDisplay = new StatisticsDisplay(weatherData);
        DisplayElement heatIndexDisplay = new HeatIndexDisplay(weatherData);

        weatherData.setMeasurements(10, 30, 50);
        weatherData.removeObserver((Observer) heatIndexDisplay);
        weatherData.setMeasurements(20, 10, 30);

    }
}
