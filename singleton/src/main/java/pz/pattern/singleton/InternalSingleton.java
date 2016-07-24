package pz.pattern.singleton;

/**
 * @author pzhang
 * @version v1.0.0
 * @time 2016/7/24 14:18
 */
public class InternalSingleton {

    private InternalSingleton() {

    }

    public static InternalSingleton getInstance() {
        return HolderHelp.INSTANCE;
    }


    private static class HolderHelp {
        public static InternalSingleton INSTANCE = new InternalSingleton();
    }

}
