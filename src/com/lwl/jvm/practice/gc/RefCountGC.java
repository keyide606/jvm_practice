package com.lwl.jvm.practice.gc;

/**
 * -XX:+PrintGCDetails 打印GC细节
 * @author liwenlong
 * @date 2021-05-16 12:44
 */
public class RefCountGC {
    // 占用5M内存的数组
    private byte[] bigSize = new byte[5 * 1024 * 1024];
    Object reference = null;

    public static void main(String[] args) {
        RefCountGC one = new RefCountGC();
        RefCountGC two = new RefCountGC();
        // 造成循环引用
        one.reference = two;
        two.reference = one;

        one = null;
        two = null;
        // 显示调用垃圾回收
        System.gc();
    }
}
