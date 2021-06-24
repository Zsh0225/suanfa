package 数学;

public class T69_x的平方根 {
    public static void main(String[] args) {
        int x = 8;
        Integer integer = Integer.valueOf(x);
        Double pow = Math.pow(integer, 0.5);
        int i = pow.intValue();
        System.out.println(i);
    }
}
