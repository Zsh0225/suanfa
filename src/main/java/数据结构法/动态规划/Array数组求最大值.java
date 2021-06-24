package 数据结构法.动态规划;

public class Array数组求最大值 {
    public static int dp_opt(int[] arr){
        int [] arrs=new int[arr.length] ;
        arrs[0]=arr[0];
        arrs[1]=Math.max(arr[0],arr[1]);
        for (int i = 2; i <arr.length ; i++) {
            arrs[i]=Math.max(arrs[i-2]+arr[i],arrs[i-1]);
        }
        return (arrs[arr.length-1]);


    }
    public static void main(String[] args) {
        int nums [] ={1,2,4,1,7,8,3};
        System.out.println(dp_opt(nums));



    }
}
