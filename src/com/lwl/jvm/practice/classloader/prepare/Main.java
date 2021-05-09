package com.lwl.jvm.practice.classloader.prepare;

/**
 * @author liwenlong
 * @date 2021-03-23 20:03
 */
public class Main {
    // 类加载准备阶段为类的变量内配内存和初始值,准备阶段a=0,到类的初始化时候才会分配初始值
    private static int a = 2;
    // 在编译阶段就能确定值的类常量,在类加载的准备阶段时候,就会初始化
    private static final int DEFAULT_VALUE=2;

    public static void main(String[] args) {
        System.out.println(Son.FATHER_DEFAULT_VALUE);
    }
}
