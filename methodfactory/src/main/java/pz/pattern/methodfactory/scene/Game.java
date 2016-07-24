package pz.pattern.methodfactory.scene;

/**
 * @author pzhang
 * @version v1.0.0
 * @time 2016/7/24 18:23
 */
public class Game {
    public static void main(String[] args){
        ISystem system = new System();
        IRole knight = system.generate(Knight.class);
        knight.charm();

        IRole minister = system.generate(Minister.class);
        minister.charm();

        IRole enchanter = system.generate(Enchanter.class);
        enchanter.charm();
    }
}
