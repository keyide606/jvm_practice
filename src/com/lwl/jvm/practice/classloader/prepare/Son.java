package com.lwl.jvm.practice.classloader.prepare;

/**
 * @author liwenlong
 * @date 2021-03-23 20:11
 */
public class Son extends Father{
    static {
        System.out.println("儿子类在初始化");
    }
}
