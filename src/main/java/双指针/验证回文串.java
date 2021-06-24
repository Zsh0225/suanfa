package 双指针;

public class 验证回文串 {
    public static void main(String[] args) {
        String s="0P";
        String s1="";
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetterOrDigit(c)){
            s1=s1+c;
            }
        }
        char[] chars = s1.toCharArray();
        for (int i = 0; i <chars.length/2 ; i++) {
            if (chars[i] != chars[chars.length-1-i]) {
                System.out.println("false");
            }
        }
        System.out.println("true");
    }

}
