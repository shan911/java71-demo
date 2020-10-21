package com.kgc;

import java.util.Arrays;

public class Test45 {
    public static void main(String[] args) {
        System.out.println("----equals(arr1,arr2)方法-------");
        int[] arr1 ={20,60,40,30};
        int[] arr2 ={20,60,40,30};
        int[] arr3 ={30,50,70};
        System.out.println("判断两个数组元素是否相等");
        System.out.println("判断arr1数组与arr2数组中元素是否相等："+Arrays.equals(arr1,arr2));
        System.out.println("判断arr1数组与arr3数组中元素是否相等："+Arrays.equals(arr1,arr3));

        System.out.println("---toString（arr1）方法----");
        System.out.println("将arr1数组转换成一个字符串："+Arrays.toString(arr1));

        System.out.println("---fill（array,val）方法----");
        int[] arr4 ={10,50,30,40};
        Arrays.fill(arr4,1,2,88);
        System.out.println("将arr4数组中的元素替换成新的内容："+Arrays.toString(arr4));

        System.out.println("---copyOf(array,length)方法----");
        int[] arr5 ={20,60,40,30};
        int[] arr6=Arrays.copyOf(arr5,4);
        System.out.println("将arr5数组中的元素复制到arr6新的数组中："+Arrays.toString(arr6));
        int[] arr7=Arrays.copyOf(arr5,6);
        System.out.println("将arr5数组中的元素复制到arr6新的数组中："+Arrays.toString(arr7));
        int[] arr8=Arrays.copyOf(arr5,3);
        System.out.println("将arr5数组中的元素复制到arr6新的数组中："+Arrays.toString(arr8));

        System.out.println("---binarySearch(array, val)方法----");
        int[] arr9 ={20,60,40,30};
        Arrays.sort(arr9);//[20,30,40,60]
        int index = Arrays.binarySearch(arr9,40);
        System.out.println("查询元素值40在数组arr9中的下标是："+index);
        int index1 = Arrays.binarySearch(arr9,80);
        System.out.println("查询元素值80在数组arr9中的下标是："+index1);
    }
}
