package pz.pattern.singleton.scene;

/**
 * @author pzhang
 * @version v1.0.0
 * @time 2016/7/24 13:32
 */
public class Emperor {

    private static final Emperor INSTANCE = new Emperor();

    private Emperor() {

    }

    public static Emperor getInstance() {
        return INSTANCE;
    }

    public void listen(String issue) {
        System.out.println("Emperor listen the report:" + issue);
    }

}
