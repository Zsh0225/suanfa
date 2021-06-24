package 数学;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

public class T190_颠倒二进制数 {
    public static void main(String[] args) throws UnsupportedEncodingException {
        int n =424967293;        //00000010100101000001111010011100
        int temp=0;
        for (int i = 0 ;i<32;i++) {
            temp=temp<<1;
            temp+=n&1;
            n=n>>1;
        }
        System.out.println(temp);

    }
}
