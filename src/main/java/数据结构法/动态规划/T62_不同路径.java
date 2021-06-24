/*
package 技巧法.动态规划;

public class T62_不同路径 {
    public static void main(String[] args) {
        int m=3;
        int n = 7;
        //此处放代码
        int [][] dp_nums = new int[m][n];

        for( int i=0;i<m;i++)
        {
            dp_nums[i][0]=1;
        }
        for( int i=0;i<n;i++)
        {
            dp_nums[0][i]=1;
        }
        dp_nums[1][1]=2;
        dp_nums[0][0]=1;
        for (int i = 2; i <m ; i++) {
            for (int j = 2; j <n ; j++) {
                dp_nums[i][j]=dp_nums[i-1][j]+dp_nums[i][j-1];
            }
        }
        return dp_nums[m-1][n-1];
    }
}
*/
