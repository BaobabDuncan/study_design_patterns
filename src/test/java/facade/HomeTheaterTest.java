package facade;

import junit.framework.TestCase;

/**
 * Created by Administrator on 2017-06-17.
 */
public class HomeTheaterTest extends TestCase {

    public void testInit() {
        Amplifier amplifier = new Amplifier();
        Tuner tuner = new Tuner();
        Screen screen = new Screen();
        PopcornPopper popcornPopper = new PopcornPopper();
        TheaterLights theaterLights = new TheaterLights();
        CdPlayer cdPlayer = new CdPlayer();
        DvdPlayer dvdPlayer = new DvdPlayer();
        Projector projector = new Projector();

        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(
                amplifier, tuner, dvdPlayer, cdPlayer, projector, theaterLights, screen, popcornPopper
        );

        homeTheaterFacade.watchMovie("Raiders of the Lost Ark");
        homeTheaterFacade.endMovie();


    }
}
