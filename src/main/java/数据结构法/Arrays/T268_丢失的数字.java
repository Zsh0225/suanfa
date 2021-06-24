package 数据结构法.Arrays;

import java.util.Arrays;

public class T268_丢失的数字 {
    public static void main(String[] args) {
        int nums[]={0,1};
        Arrays.sort(nums);
        for (int i = 0,j=0; i < nums.length; i++,j++) {
            if (nums[i]==j){
                continue;
            }
            else {
                System.out.println(j);
            }

        }

    }

}
