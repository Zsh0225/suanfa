package 数据结构法.Hashmap;

import java.util.HashMap;

public class T136_只出现一次的数字 {
    public static void main(String[] args) {
        int[] nums = new int[5];
        nums[0] = 4;
        nums[1] = 1;
        nums[2] = 2;
        nums[3] = 1;
        nums[4] = 2;
      /*
       方法一
       Arrays.sort(nums);
        for (int i = 0; i < nums.length-1; i++,i++) {
            if (nums[i] != nums[i + 1])
            {
                return (nums[i]);
            }
        }
        return(nums[nums.length - 1]);*/
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.replace(nums[i],(map.get(nums[i])+1));
            }
            else map.put(nums[i],1);
        }
        for (Integer ii:map.keySet()) {
            if (map.get(ii)==1) {
                System.out.println(ii);
            }
        }


}}
