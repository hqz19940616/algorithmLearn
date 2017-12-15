package com.sort.ON2Sort;

import com.sort.util.SortHelper;

/**
 * @Author:hqz
 * @Description O(n^2) 插入排序
 * @Date:Create in 2017/12/14 上午11:39
 * @Version:v1.0
 */
public class InsertionSort {

    public static void main(String[] args) {
        int n =10000;
        int arr[] = SortHelper.createRandomArray(n,0,10000);
        long startTime=System.currentTimeMillis();
        insertSort(arr,n);
        long endTime=System.currentTimeMillis();
        System.out.println("程序运行时间： "+( endTime - startTime )+"ms");
        long startTime2=System.currentTimeMillis();
        insertSort2(arr,n);
        long endTime2=System.currentTimeMillis();
        System.out.println("程序运行时间： "+( endTime2 - startTime2 )+"ms");

        SortHelper.printArray(arr);

    }

    public static int[] insertSort(int arr[],int n){
        for (int i = 0; i < n; i++) {
            //寻找元素arr[i]合适的插入位置
            for (int j = i; j >0 ; j--) {
                if(arr[j] < arr[j-1]){
                    arr[j] ^= arr[j-1];
                    arr[j-1] ^= arr[j];
                    arr[j] ^= arr[j-1];
                }else{
                    break;
                }
            }
        }
        return arr;
    }

    //插入排序的优化算法
    public static int[] insertSort2(int arr[],int n){
        for (int i = 0; i < n; i++) {
            int e = arr[i];
            int j;
            //寻找元素arr[i]合适的插入位置
            for (j = i; j >0 && arr[j-1] > e; j--) {
                      arr[j] = arr[j-1];
            }
            arr[j] = e;
        }
        return arr;
    }
}
