package com.sort.example;

import com.sort.util.SortHelper;

/**
 * @Author:hqz
 * @Description
 * @Date:Create in 2017/12/13 下午5:36
 * @Version:v1.0
 */
public class SortTest {

    public static void main(String[] args) {
        SortHelper s = new SortHelper();
        int n = 10000;
        int array[] = s.createRandomArray(n,20,10000);
        s.printArray(array);
    }
}
