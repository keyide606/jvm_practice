package com.lwl.jvm.practice.oom;

import java.util.ArrayList;
import java.util.List;

/**
 * -Xms8m 堆大小8m
 * -Xmx8m 堆最大8m
 * -XX:+HeapDumpOnOutOfMemoryError
 * 使用profiler分析
 * @author liwenlong
 * @date 2021-05-16 13:15
 */
public class HeapOOM {
    // 1M
    private byte[] bytes = new byte[1 * 1024 * 1024];

    public static void main(String[] args) {
        List<HeapOOM> list = new ArrayList<>();
        int count = 0;

        try{
            while (true){
                list.add(new HeapOOM());
                count++;
            }
        }catch (Throwable e){
            System.out.println("count="+count);
            e.printStackTrace();
        }
    }
}
