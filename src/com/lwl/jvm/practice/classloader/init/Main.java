package com.lwl.jvm.practice.classloader.init;

/**
 * @author liwenlong
 * @date 2021-03-23 20:24
 */
public class Main {
    /**
        类的初始化化时将类变量赋值动作和类的静态代码快，按照先后顺序合并并执行
        子类初始化之前,父类要完成初始化。
        以下情况下会导致类的初始化（类的主动使用场景）:
            1. 创建类的实例
            2. 访问类和接口的静态变量,或者给静态变量赋值
            3. 访问类的静态方法
            4. 反射调用
            5. 初始化子类
            6. 标记为启动类的类
     */
    private static int a = 1;


    {
        a = 10;
        b=20;
    }
    private static int b = 1;
    public static void main(String[] args) {
        System.out.println(a);
        System.out.println(b);
    }
}
