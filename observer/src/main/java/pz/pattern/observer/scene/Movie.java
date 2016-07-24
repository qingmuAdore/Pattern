package pz.pattern.observer.scene;


import pz.pattern.observer.Observable;

/**
 * @author pzhang
 * @version v1.0.0
 * @time 7/18/2016 7:18 PM
 */
public class Movie extends Observable {

    /**
     * play movie
     */
    public void play() {
        setChanged();
        notifyObservers();
    }
}
