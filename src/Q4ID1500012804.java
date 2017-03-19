/**
 * Created by yzs on 2017/3/18.
 */
public class Q4ID1500012804 {
    int []work(int []x){
        int r[] = new int[2];
        int min, max, ans_min, ans_max;
        if(r[0] < r[1]){
            min = r[0];
            ans_min = r[1];
            max = r[1];
            ans_max = r[0];
        }
        else{
            min = r[1];
            ans_min = r[0];
            max = r[0];
            ans_max = r[1];
        }

        if(r.length == 2){
            r[0] = ans_max;
            r[1] = ans_min;
            return r;
        }
        for(int i = 2; i < r.length; i++){
            if(x[i] < ans_min){
                if(x[i] < min){
                    ans_min = min;
                    min = x[i];
                }
                else{
                    ans_min = x[i];
                }
            }
            if(x[i] > ans_max){
                if(x[i] > max){
                    ans_max = max;
                    max = x[i];
                }
                else{
                    ans_max = x[i];
                }
            }
        }
        r[0] = ans_max;
        r[1] = ans_min;
        return r;
    }
}
