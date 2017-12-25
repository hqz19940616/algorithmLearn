package com.sort.OnlognSort;

import com.sort.ON2Sort.InsertionSort;
import com.sort.util.SortHelper;

/**
 * @Author:hqz
 * @Description TODO 归并排序(自顶向下)
 * @Date:Create in 2017/12/20 下午3:21
 * @Version:v1.0
 */
public class MergeSort {

    private static InsertionSort insertionSort ;

    public static void __merge(int arr[],int l,int mid,int r){
        int[] aux = new int[r-l+1];
        for (int i = l; i <= r; i++) {
            aux[i-l] = arr[i];
        }
        int i =l ,j=mid+1;
        for (int k = l; k <= r; k++) {
            if(i > mid){
                arr[k] = aux[j-l];
                j++;
            }else if(j > r){
                arr[k] = aux[i-l];
                i++;
            }else if(aux[i-l] < aux[j-l]){
                arr[k] = aux[i-l];
                i++;
            }else{
                arr[k] = aux[j-l];
                j++;
            }
        }
    }

    public static void __mergeSort(int arr[],int l,int r){

//        if(l >= r){
//            return ;
//        }
        //在数组范围小于一个常量的时候,可以优化使用插入排序
        if( r - l <= 15){
            insertionSort.insertSort3(arr,l,r);
            return ;
        }

        int mid = (l + r)/2;
        __mergeSort(arr,l,mid);
        __mergeSort(arr,mid+1,r);
        //__merge(arr,l,mid,r);
        //?对于近乎有序的数组,归并排序浪费大量时间进行__merge操作
        //优化:
        if(arr[mid] > arr[mid+1]){
            __merge(arr,l,mid,r);
        }
    }


    public static void mergeSort(int arr[],int n){
        __mergeSort(arr,0,n-1);
    }





    public static void main(String[] args) {
        int n=1000;
        int arr[] = SortHelper.createRandomArray(n,0,1000);
//        int arr[] = {9,8,7,6,5,4,3,2};
        long startTime=System.currentTimeMillis();
        mergeSort(arr,n);
        long endTime=System.currentTimeMillis();
        SortHelper.printArray(arr);
        System.out.println("程序运行时间： "+( endTime - startTime )+"ms");
    }
}
