package com.sort.ON2Sort;

import com.sort.util.SortHelper;

/**
 * @Author:hqz
 * @Description
 * @Date:Create in 2017/12/14 下午4:16
 * @Version:v1.0
 */
public class BubbleSort {

    public static void main(String[] args) {
        int n =10000;
        int arr[] = SortHelper.createRandomArray(n,0,10000);
        long startTime=System.currentTimeMillis();
        bubbleSort(arr,n);
        long endTime=System.currentTimeMillis();
        System.out.println("程序运行时间： "+( endTime - startTime )+"ms");
        SortHelper.printArray(arr);
    }

    public static int[] bubbleSort(int arr[], int n){
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
