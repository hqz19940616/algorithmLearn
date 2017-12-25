package com.sort.OnlognSort;

import com.sort.ON2Sort.InsertionSort;
import com.sort.util.SortHelper;

/**
 * @Author:hqz
 * @Description TODO 3路快速排序的实现(数组分为<v,=v,>v三块)
 * @Date:Create in 2017/12/25 下午3:02
 * @Version:v1.0
 */
public class QuickSort3 {
    private static SortHelper sortHelper;
    private static InsertionSort insertionSort;



    static void __quickSort3(int[] arr, int l, int r) {
        if (l >= r){
            return;
        }
        int random = sortHelper.createRandom(l,r);
        sortHelper.swap(arr,l,random);
        //获取数组第一个元素
        int v = arr[l];
        int lt = l,gt = r + 1, i = l+1;
        while(i < gt){
            if(arr[i] < v){
                sortHelper.swap(arr,i,lt+1);
                lt++;
                i++;
            }else if (arr[i] > v){
                sortHelper.swap(arr,i,gt-1);
                gt--;
            }else{
                i++;
            }
        }
        sortHelper.swap(arr,l,lt);
        __quickSort3(arr,l,lt-1);
        __quickSort3(arr,gt,r);
    }

    static void quickSort3(int arr[],int n){
        __quickSort3(arr,0,n-1);
    }


    public static void main(String[] args) {
        int n=10000000;
        int arr[] = SortHelper.createRandomArray(n,0,1000);
//        int arr[] = {9,8,7,6,5,4,3,2};
        long startTime=System.currentTimeMillis();
        quickSort3(arr,n);
        long endTime=System.currentTimeMillis();
//        SortHelper.printArray(arr);
        System.out.println("程序运行时间： "+( endTime - startTime )+"ms");
    }
}
