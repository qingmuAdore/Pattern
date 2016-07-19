package pz.pattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author pzhang
 * @version v1.0.0
 * @time 7/19/2016 2:33 PM
 */
public class Observable {
    private List<Observer> mObservers = new ArrayList<>();
    private boolean isChange = false;


    public boolean hasChanged() {
        return isChange;
    }

    public void setChanged() {
        this.isChange = true;
    }

    public void clearChanged() {
        this.isChange = false;
    }

    public void addObserver(Observer observer) {
        if (observer == null) {
            throw new NullPointerException("observer is null");
        }
        synchronized (this) {
            if (!mObservers.contains(observer)) {
                mObservers.add(observer);
            }
        }
    }

    public synchronized void deleteObserver(Observer observer) {
        mObservers.remove(observer);
    }

    public synchronized void clearObservers() {
        mObservers.clear();
    }

    public void notifyObservers() {
        notifyObservers(null);
    }

    public void notifyObservers(Object object) {
        int size;
        Observer[] observers = null;
        synchronized (this) {
            if (hasChanged()) {
                clearChanged();
                size = mObservers.size();
                observers = new Observer[size];
                mObservers.toArray(observers);
            }

        }
        if (observers != null) {
            for (Observer observer : observers) {
                observer.update(this, object);
            }
        }
    }

}
