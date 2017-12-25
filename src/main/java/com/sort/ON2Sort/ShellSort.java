package com.sort.ON2Sort;

import com.sort.util.SortHelper;

/**
 * @Author:hqz
 * @Description TODO 希尔排序
 * @Date:Create in 2017/12/14 下午5:22
 * @Version:v1.0
 */
public class ShellSort {

    public static void main(String[] args) {
        int n =10;
//        int arr[] = SortHelper.createRandomArray(n,0,10);
        int arr[] = {2,4,7,8,6,5,9,1,0,3};
        long startTime2=System.currentTimeMillis();
        insertSort2(arr,n);
        long endTime2=System.currentTimeMillis();
        System.out.println("程序运行时间： "+( endTime2 - startTime2 )+"ms");

        SortHelper.printArray(arr);

    }

    //插入排序的优化算法
    public static int[] insertSort2(int arr[],int n){
        int j = 0;
        int temp = 0;
        //每次将步长缩短为原来的一半
        for (int increment = arr.length / 2; increment > 0; increment /= 2)
        {
            for (int i = increment; i < arr.length; i++)
            {
                temp = arr[i];
                for (j = i; j >= increment; j -= increment)
                {
                    if(temp < arr[j - increment])     //定义排序顺序
                    {
                        arr[j] = arr[j - increment];
                    }
                    else
                    {
                        break;
                    }

                }
                arr[j] = temp;
            }

        }
        return arr;
    }
}
