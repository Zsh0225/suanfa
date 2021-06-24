package 数据结构法.Arrays;

public class T53_最大子序和 {
    public static void main(String[] args) {
        int nums[]={31,-41,59,26,-53,58,97,-93,-23,84};
        //代码此处
        int sum=0;
        int max_sum=0;
/*        if (nums.length == 1) {
            return nums[0];
        }*/
/*        int[] clone = nums.clone();
        Arrays.sort(clone);

        if(clone[clone.length-1]<0 ){
            return clone[clone.length-1];
        }*/
        for (int i = 0; i < nums.length; i++) {
            if (sum+nums[i]<=0)
            {
                sum=0;
                continue;
            }
            else {
                if (nums[i]<0&&max_sum==sum){
                    max_sum=sum;
                }
                sum=sum+nums[i];
                max_sum = Math.max(sum, max_sum);
            }
        }
        System.out.println(max_sum);

    }
}
