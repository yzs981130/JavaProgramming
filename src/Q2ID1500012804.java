/**
 * Created by yzs on 2017/3/13.
 */
import java.util.Scanner;
public class Q2ID1500012804 {
    static int[] v = {1, 2, 5};
    public static long solve(int amount){
        int[] dp = new int[amount + 1];
        for(int i = 1; i <= amount; i++)
            dp[i] = 0;
        dp[0] = 1;
        for(int i = 0; i < 3; i++)
            for(int j = v[i]; j <= amount; j++)
                dp[j] += dp[j - v[i]];
        return dp[amount];
    }
    public static void main(String args[]) {
        int amount = 0;
        Scanner sc = new Scanner(System.in);
        amount = sc.nextInt();
        System.out.println(solve(amount));
    }
}
