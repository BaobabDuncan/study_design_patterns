package weather;

/**
 * Created by sanguk on 09/06/2017.
 */
interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();

}
