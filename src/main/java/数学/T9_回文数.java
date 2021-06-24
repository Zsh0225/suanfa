package 数学;

public class T9_回文数 {
    public static boolean isPalindrome(int x) {
        if (x<0) {
            return false;
        }
        if (x==0) {
            return true;
        }
        int n =0;
        int temp=x;
        while (temp != 0) {
           n=n*10+temp%10;
            temp=temp/10;
        }
        return (n==x)?true:false;

    }

    public static void main(String[] args) {
        isPalindrome(121);
    }
}
