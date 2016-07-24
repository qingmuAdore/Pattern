package pz.pattern.methodfactory.scene;


import java.lang.*;
import java.lang.System;

/**
 * @author pzhang
 * @version v1.0.0
 * @time 2016/7/24 18:23
 */
public class Knight implements IRole{
    @Override
    public void charm() {
        System.out.println("high attach and defense");
    }
}
