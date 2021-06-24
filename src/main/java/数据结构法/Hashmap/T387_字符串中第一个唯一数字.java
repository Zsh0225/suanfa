package 数据结构法.Hashmap;

import java.util.HashMap;

public class T387_字符串中第一个唯一数字 {
    public static void main(String[] args) {
        String s ="leetcode";
        int min=s.length()-1;
        char[] chars = s.toCharArray();
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < chars.length; i++) {
            if (map.containsKey(chars[i])) {
                map.replace(chars[i],map.get(chars[i])+1);
            }
/*            else map.put(chars[i],1);*/
        }
        for (Character cc : map.keySet()) {
            if (map.get(cc)==1) {
                min=Math.min(s.lastIndexOf(cc),min);
            }
        }
   /*     if (min==s.length()-1&&s.length()>=2)
            return -1;
        else return min;*/


    }

}
