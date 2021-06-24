package 数据结构法.Hashmap;

import java.util.Arrays;

public class T242_有效的字母异位词 {
    public static void main(String[] args) {
        String s = "a";
        String t = "ab";
        char[] chars1 = s.toCharArray();
        char[] chars2 = t.toCharArray();
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        if (chars1.length != chars2.length) {
//            return false;
        }
        else {
            for (int i = 0; i < chars1.length; i++) {
                if (chars1[i] != chars2[i]) {
//                    return false;
                    System.out.println("false");
                }
            }
//            return true;
        }
       /* HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < chars.length; i++) {
            if (map.containsKey(chars[i])) {
                map.replace(chars[i],(map.get(chars[i])+1));
            }
            else map.put(chars[i],1);
        }
        for (Character cc : map.keySet()) {
            if () {

            }
        }*/
    }
}
