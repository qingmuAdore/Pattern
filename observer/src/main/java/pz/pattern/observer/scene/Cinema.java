package pz.pattern.observer.scene;


/**
 * @author pzhang
 * @version v1.0.0
 * @time 7/18/2016 7:22 PM
 */
public class Cinema {
    public static void main(String[] args) {
        Movie observable = new Movie();
        People people = new People();
        people.book(observable);
        show(observable);
    }

    public static void show(Movie movie){
        movie.play();
    }

}
