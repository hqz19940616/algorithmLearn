package com.sort.example;

import com.sort.util.SortHelper;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author:hqz
 * @Description
 * @Date:Create in 2017/12/13 下午5:36
 * @Version:v1.0
 */
public class SortTest {

    public static void main(String[] args) {
        SortHelper s = new SortHelper();
        int n = 10000;
        int array[] = s.createRandomArray(n,20,10000);
        s.printArray(array);

//        List list1 = new ArrayList();
//        List<String>  list2 = new ArrayList<String>();
//
//        Class c1 = list1.getClass();
//        Class c2 = list2.getClass();
//
//        list2.add("hello");
//
//        try {
//            Method m = c2.getMethod("add",Object.class);
//            m.invoke(list2,100);
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//        System.out.println(list2);


//        System.out.println(c1==c2);
    }
}
