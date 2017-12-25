package com.sort.OnlognSort;

import com.sort.util.SortHelper;

/**
 * @Author:hqz
 * @Description TODO 归并排序(自底向上)
 * @Date:Create in 2017/12/22 下午4:50
 * @Version:v1.0
 */
public class MergeSortBU {



    public static void mergeSortbu(int arr[],int n){
        for (int size = 1; size <= n ; size += size) {
            for (int i = 0; i < n ; i += size + size) {
                MergeSort mergeSort = new MergeSort();
                mergeSort.__merge(arr,i,i+size-1,SortHelper.min(i+size+size-1,n-1));
            }
        }
    }



    public static void main(String[] args) {
        int n=10000000;
        int arr[] = SortHelper.createRandomArray(n,0,10000000);
//        int arr[] = {9,8,7,6,5,4,3,2};
        long startTime=System.currentTimeMillis();
        mergeSortbu(arr,n);
        long endTime=System.currentTimeMillis();
//        SortHelper.printArray(arr);
        System.out.println("程序运行时间： "+( endTime - startTime )+"ms");
    }
}
