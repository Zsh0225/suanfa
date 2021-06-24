package 数学;

import java.util.ArrayList;
import java.util.List;

public class T412_FizzBuzz {
    public static void main(String[] args) {
        int n =15;
        List<String> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (i%3==0&&i%5!=0) {
                list.add("Fizz");
            }
            else if (i%5==0&&i%3!=0) {
                list.add("Buzz");
            }
            else if(i%5==0&&i%3==0) {
                list.add("FizzBuzz");
            }
            else {
                list.add(Integer.valueOf(i).toString());
            }

        }
        System.out.println(list);
    }
}
