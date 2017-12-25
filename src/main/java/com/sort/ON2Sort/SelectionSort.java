package com.sort.ON2Sort;

import com.sort.util.SortHelper;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @Author:hqz
 * @Description TODO O(n^2) 选择排序
 * @Date:Create in 2017/12/13 下午5:59
 * @Version:v1.0
 */
public class SelectionSort {

    public static SortHelper sortHelper;

    public static void main(String[] args) {
        int n =10000;
        int arr[] = SortHelper.createRandomArray(n,0,10000);
        long startTime=System.currentTimeMillis();
        selectionSort(arr,n);
        long endTime=System.currentTimeMillis();
        System.out.println("程序运行时间： "+( endTime - startTime )+"ms");
        SortHelper.printArray(arr);
//        swap(7,7);

    }

    public static int[] selectionSort(int arr[] ,int n){
        for (int i = 0; i < n; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            sortHelper.swap(arr,i,minIndex);

        }
        return arr;
    }

}
