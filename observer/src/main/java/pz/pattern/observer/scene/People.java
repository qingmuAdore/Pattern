package pz.pattern.observer.scene;


import pz.pattern.observer.Observable;
import pz.pattern.observer.Observer;

/**
 * @author pzhang
 * @version v1.0.0
 * @time 7/18/2016 7:19 PM
 */
public class People implements Observer {

    /**
     * book the movie ticket
     *
     * @param o
     */
    public void book(Observable o) {
        o.addObserver(this);
    }

    @Override
    public void update(Observable observable, Object data) {
        System.out.println("person see movie");
    }
}
