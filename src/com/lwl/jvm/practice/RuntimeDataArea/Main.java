package com.lwl.jvm.practice.runtime_data_area;

/**
 * @author liwenlong
 * @date 2021-05-06 20:40
 */
public class Main {
    public static void main(String[] args) {
        test();
    }

    // 看一道面试题
    static void test() {
        int i = 8;
        // i = i++; 执行此句是8,执行另外一句是9
        // 具体看反编译得到的指令,理解iload和istore指令
        // iload_1:将局部变量表1位置的数据压到操作数栈中
        // istore_1: 讲操作数栈顶数据出栈，赋值给局部变量表1位置的变量
        i = ++i;
        System.out.println(i);
    }


}
