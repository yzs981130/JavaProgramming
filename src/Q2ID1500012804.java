/**
 * Created by yzs on 2017/3/13.
 */
import java.util.Scanner;
public class Q2ID1500012804 {
    static int[] v = {1, 2, 5};
    public static long solve(int amount){
        long a = amount / 2 + 1;
        long b = (amount - 5) / 2 + 1;
        long c = (amount - 10) / 2 + 1;
        long d = (amount - 15) / 2 + 1;
        long e = amount / 10;
        long f = c + d - a - b;
        return (a + b) * e + e * (e - 1) * f / 2 + 1;
    }
    public static void main(String args[]) {
        int amount = 0;
        Scanner sc = new Scanner(System.in);
        amount = sc.nextInt();
        System.out.println(solve(amount));
    }
}
