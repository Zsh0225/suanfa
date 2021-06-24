package 数学;

import java.util.Arrays;

public class T191_位1的个数 {
    public static void main(String[] args) {
        int n =429496723;
//        System.out.println(Integer.MAX_VALUE);
        boolean[] nums = new boolean[32];
        int flag = 0;
        int count=0;
        String s = "";
        while(flag<nums.length){
            if (n-Math.pow(2,nums.length-flag-1)>0){
                n= (int) (n-Math.pow(2,nums.length-flag-1));
                nums[flag]=true;
            }
            flag++;
        }
        System.out.println(Arrays.toString(nums));
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]){
                count++;
            }
        }
        System.out.println(count);
    }
}
