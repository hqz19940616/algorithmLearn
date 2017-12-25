package com.sort.OnlognSort;

import com.sort.ON2Sort.InsertionSort;
import com.sort.util.SortHelper;

/**
 * @Author:hqz
 * @Description TODO 面对重复数据量很大的数组,快速排序退化成O(n^2)的解决办法
 * @Date:Create in 2017/12/25 下午2:31
 * @Version:v1.0
 */
public class QuickSort2 {


    private static SortHelper sortHelper;
    private static InsertionSort insertionSort;

    static int __partition2(int arr[],int l,int r){
        int random = sortHelper.createRandom(l,r);
        sortHelper.swap(arr,l,random);
        //获取数组第一个元素
        int v = arr[l];
        //初始化i,j位置
        int i=l+1,j=r;
        //双向遍历数组,i端比v大的交换,j端比v小的交换
        while(true){
            while(i < r && arr[i] < v){
                i++;
            }
            while (j > l+1 && arr[j] > v){
                j--;
            }
            if(i > j){
                break;
            }
            sortHelper.swap(arr,i,j);
            i++;
            j--;
        }
        sortHelper.swap(arr,l,j);
        return j;
    }


    static void __quickSort2(int[] arr, int l, int r) {
        if (l >= r){
            return;
        }
        int p = __partition2(arr,l,r);
        __quickSort2(arr,l,p-1);
        __quickSort2(arr,p+1,r);

    }

    static void quickSort2(int arr[],int n){
        __quickSort2(arr,0,n-1);
    }


    public static void main(String[] args) {
        int n=10000000;
        int arr[] = SortHelper.createRandomArray(n,0,1000);
//        int arr[] = {9,8,7,6,5,4,3,2};
        long startTime=System.currentTimeMillis();
        quickSort2(arr,n);
        long endTime=System.currentTimeMillis();
//        SortHelper.printArray(arr);
        System.out.println("程序运行时间： "+( endTime - startTime )+"ms");
    }
}
