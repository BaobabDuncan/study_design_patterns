package weather;

/**
 * Created by sanguk on 09/06/2017.
 */
interface Observer {
    void update(float temp, float humidity, float pressure);
}
