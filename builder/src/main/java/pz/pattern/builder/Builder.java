package pz.pattern.builder;

/**
 * @author pzhang
 * @version v1.0.0
 * @time 2016/7/25 21:57
 */
public interface Builder {
    Builder partA(String a);
    Builder partB(String b);
    Product result();
}
