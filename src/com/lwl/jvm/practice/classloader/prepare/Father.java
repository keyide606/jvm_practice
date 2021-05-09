package com.lwl.jvm.practice.classloader.prepare;

/**
 * @author liwenlong
 * @date 2021-03-23 20:12
 */
public class Father   {
    public static final int FATHER_DEFAULT_VALUE=2;

    static {
        System.out.println("父亲类在初始化");
    }
}
