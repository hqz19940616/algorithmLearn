package com.sort.ON2Sort;

import com.sort.util.SortHelper;

/**
 * @Author:hqz
 * @Description TODO 冒泡排序
 * @Date:Create in 2017/12/14 下午4:16
 * @Version:v1.0
 */
public class BubbleSort {

    public static SortHelper sortHelper;

    public static void main(String[] args) {
        int n =50000;
        int arr[] = SortHelper.createRandomArray(n,0,50000);
        long startTime=System.currentTimeMillis();
        bubbleSort(arr,n);
        long endTime=System.currentTimeMillis();
        SortHelper.printArray(arr);
        System.out.println("程序运行时间： "+( endTime - startTime )+"ms");
    }

    public static int[] bubbleSort(int arr[], int n){
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if(arr[i] > arr[j]){
                    sortHelper.swap(arr,i,j);
                }
            }
        }
        return arr;
    }
}
