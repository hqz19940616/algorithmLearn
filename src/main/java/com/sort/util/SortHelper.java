package com.sort.util;

import java.lang.reflect.Type;
import java.util.Random;

/**
 * @Author:hqz
 * @Description  //TODO 排序工具类
 * @Date:Create in 2017/12/13 下午5:28
 * @Version:v1.0
 */
public class SortHelper {

    //生成有n个元素的随机数组,每个元素的随机范围为[rangeL,rangeR]
    public static int[] createRandomArray(int n,int rangeL,int rangeR){
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            Random random = new Random();
            array[i] = random.nextInt(rangeR) % (rangeR - rangeL + 1) + rangeL;
        }
        return  array;
    }

    public static int createRandom(int rangeL,int rangeR){
            Random random = new Random();
            int i = random.nextInt(rangeR) % (rangeR - rangeL + 1) + rangeL;

        return  i;
    }

    public static void printArray(int array[]){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static int min(int a,int b){
        if(a >b){
            return b;
        }else{
            return a;
        }
    }


    public static  void  swap ( int [] Data,  int  a,  int  b) {
        int  t = Data[a];
        Data[a] = Data[b];
        Data[b] = t;
    }
}
