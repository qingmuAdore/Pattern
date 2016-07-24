package pz.pattern.observer.scene;


/**
 * @author pzhang
 * @version v1.0.0
 * @time 7/18/2016 7:22 PM
 */
public class Cinema {
    public static void main(String[] args) {
        Projector observable = new Projector();
        People people = new People();
        people.book(observable);
        start(observable);
    }

    public static void start(Projector projector){
        projector.play();
    }

}
