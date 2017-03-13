/**
 * Created by yzs on 2017/3/13.
 */
import java.util.Scanner;

public class Q1ID1500012804 {
    public static void main(String args[]) {
        int a, b, ans = 0;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        int c = a ^ b;
        for(int i = 0; c != 0; i++){
            ans += c & 1;
            c >>>= 1;
        }
        System.out.println(ans);
    }
}
