package 暴力法;

import java.util.Arrays;

public class T204_计算质数 {
    public static void main(String[] args) {
        int n = 100000000;
        int count=0;
        Object obj = new Object();
       boolean [] flag = new boolean[n];
        long l = System.currentTimeMillis();
        for (int i = 2; i < n ; i++) {
//            synchronized(obj){
            if (!flag[i]) {
                count++;
                for (int j = i; j <n ; j+=i) {
                    flag[j]=true;
                }
            }
//        }
        }
        long l1 = System.currentTimeMillis();
        System.out.println(l1-l);
        System.out.println(count);
}
}
