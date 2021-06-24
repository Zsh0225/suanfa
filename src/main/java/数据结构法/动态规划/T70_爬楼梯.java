package 数据结构法.动态规划;

public class T70_爬楼梯 {
    public static void main(String[] args) {

        int n= 5;
        int[] arr = new int[n+1];

        arr[0]=0;
        arr[1]=1;
        arr[2]=2;
        for (int i = 3; i <=n ; i++) {
            arr[i]=arr[i-1]+arr[i-2];
        }
        System.out.println(arr[n]);

    }



}
