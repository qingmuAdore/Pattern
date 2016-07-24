package pz.pattern.singleton;

/**
 * @author pzhang
 * @version v1.0.0
 * @time 2016/7/24 13:22
 */
public class LazySingleton {
    private static LazySingleton INSTANCE = null;
    private LazySingleton() {

    }

    public static synchronized LazySingleton getInstance() {
        if(INSTANCE == null){
            INSTANCE = new LazySingleton();
        }
        return INSTANCE;
    }
}
