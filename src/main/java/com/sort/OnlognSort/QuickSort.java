package com.sort.OnlognSort;

import com.sort.ON2Sort.InsertionSort;
import com.sort.util.SortHelper;

/**
 * @Author:hqz
 * @Description TODO 快速排序(未优化,最差时间复杂度 O(n^2)) 解决办法:随机获取v:__partition_new
 * @Date:Create in 2017/12/25 上午10:45
 * @Version:v1.0
 */
public class QuickSort {

    private static SortHelper sortHelper;
    private static InsertionSort insertionSort;

    static int __partition(int arr[],int l,int r){
        //获取数组第一个元素
        int v = arr[l];
        //初始化j位置
        int j = l;
        //遍历数组,比v位置小的元素需要作位置交换处理
        for (int i = l+1; i <= r; i++) {
            if(arr[i] < v){
                sortHelper.swap(arr,j+1,i);
                j++;
            }
        }
        sortHelper.swap(arr,l,j);
        return j;
    }

    static int __partition_new(int arr[],int l,int r){
        int random = sortHelper.createRandom(l,r);
        sortHelper.swap(arr,l,random);
        //获取数组第一个元素
        int v = arr[l];
        //初始化j位置
        int j = l;
        //遍历数组,比v位置小的元素需要作位置交换处理
        for (int i = l+1; i <= r; i++) {
            if(arr[i] < v){
                sortHelper.swap(arr,j+1,i);
                j++;
            }
        }
        sortHelper.swap(arr,l,j);
        return j;
    }

    static void __quickSort(int[] arr, int l, int r) {
        if (l >= r){
            return;
        }
        int p = __partition_new(arr,l,r);
        __quickSort(arr,l,p-1);
        __quickSort(arr,p+1,r);

    }

    static void quickSort(int arr[],int n){
        __quickSort(arr,0,n-1);
    }


    public static void main(String[] args) {
        int n=10000000;
        int arr[] = SortHelper.createRandomArray(n,0,1000);
//        int arr[] = {9,8,7,6,5,4,3,2};
        long startTime=System.currentTimeMillis();
        quickSort(arr,n);
        long endTime=System.currentTimeMillis();
 //       SortHelper.printArray(arr);
        System.out.println("程序运行时间： "+( endTime - startTime )+"ms");
    }
}
