package pz.pattern.singleton;

/**
 * @author pzhang
 * @version v1.0.0
 * @time 2016/7/24 14:24
 */
public class DoubleCheckSingleton {
    private static DoubleCheckSingleton INSTANCE;

    private DoubleCheckSingleton() {
        if (INSTANCE != null) {
            throw new IllegalStateException("Already initialized.");
        }
    }

    public static DoubleCheckSingleton getInstance() {
        DoubleCheckSingleton result = null;
        if (result == null) {
            synchronized (DoubleCheckSingleton.class) {
                result = INSTANCE;
                if (result == null) {
                    INSTANCE = result = new DoubleCheckSingleton();
                }
            }
        }
        return result;
    }


}
