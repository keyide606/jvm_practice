package com.lwl.jvm.practice.classloader.load;

import java.net.URL;
import java.util.stream.Stream;

/**
 * @author liwenlong
 * @date 2021-03-23 21:06
 */
public class ClassLoaderTest {
    public static void main(String[] args) {
        getBootStrapClassLoaderUrl();
    }

    static void showClassLoader(){
        // 获取系统类加载器
        ClassLoader classLoader = ClassLoader.getSystemClassLoader();

        System.out.println("系统类加载器==>" + classLoader);
        // 扩展类加载器,它是由引导类加载器进行加载,加载jre/lib/ext子目录中的类
        // 如果用户创建的类放在jre/lib/ext下也有它加载
        ClassLoader parent = classLoader.getParent();
        System.out.println("扩展类加载器===>" + parent);

        // 引导类加载器
        ClassLoader boot = parent.getParent();
        System.out.println("引导类加载器===>" + boot);

        // 获取本类所使用的类加载器,发现他是应用类加载器加载的
        ClassLoader use = ClassLoaderTest.class.getClassLoader();
        System.out.println(use);
        // Java的核心jar包使用引导类加载器加载,比如jre/lib/rt.jar等
        // 启动类加载器加载了扩展类加载器和应用类（系统）加载器
        ClassLoader bootClassLoader = String.class.getClassLoader();
        System.out.println("根类加载器==" + bootClassLoader);
    }

    static void getBootStrapClassLoaderUrl(){
        URL[] urls = sun.misc.Launcher.getBootstrapClassPath().getURLs();
        Stream.of(urls).forEach(System.out::println);
    }
}
