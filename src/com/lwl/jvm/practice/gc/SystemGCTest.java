package com.lwl.jvm.practice.gc;

/**
 * @author liwenlong
 * @date 2021-05-16 13:59
 */
public class SystemGCTest {
    public static void main(String[] args) {
        new SystemGCTest();
        // 调用之后,触发fullGC 但是不会立刻触发
        System.gc();
        // 强制失去引用的对象调用finalize方法
        System.runFinalization();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        System.out.println("重写finalize....");
    }
}
