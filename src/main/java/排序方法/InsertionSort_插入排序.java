package 排序方法;

import java.util.Arrays;
/*
*插入排序也叫原地排序
* 空间复杂度 o(1)
* 并且是稳定排序
* 最坏时间复杂度 O(n^2)
* 最好是 n
* 平均是 n^2
**/
public class InsertionSort_插入排序 {
    public static void main(String[] args) {
        int[] arrays = new int[]{6,3,1,4,2,5};
        for (int i = 1; i < arrays.length; i++) {
            int current = arrays[i];
            int preindex = i-1;
            while(preindex>=0&&arrays[preindex]>current){
                arrays[preindex+1] = arrays[preindex];
                preindex--;
            }
            arrays[preindex+1]=current;
        }
        System.out.println(Arrays.toString(arrays));
    }
}
