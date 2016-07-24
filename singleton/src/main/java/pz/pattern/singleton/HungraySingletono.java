package pz.pattern.singleton;

/**
 * @author pzhang
 * @version v1.0.0
 * @time 2016/7/24 13:24
 */
public class HungraySingletono {
    private static final HungraySingletono INSTANCE = new HungraySingletono();

    private HungraySingletono() {
    }

    public static HungraySingletono getInstance() {
        return INSTANCE;
    }
}

