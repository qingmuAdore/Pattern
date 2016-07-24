package pz.pattern.singleton.scene;

/**
 * @author pzhang
 * @version v1.0.0
 * @time 2016/7/24 13:32
 */
public class Minister {

    public void report(String issue) {
        System.out.println("Minister report:"+issue);
        Emperor.getInstance().listen(issue);
    }

}
