import java.util.* ;
import java.io.*; 
import java.util.ArrayList;

public class Solution {

    public static int[] missingAndRepeating(ArrayList<Integer> a, int n) {

        int xr = 0;
        
        for(int i=0; i<n; i++){
            xr = xr ^ a.get(i);
            xr = xr ^ (i + 1);
        }
        
        int number = (xr & ~(xr - 1));
        
        int zero = 0;

        int one = 0;

        for(int i=0; i<n; i++) {
            if((a.get(i) & number)!=0){
                one = one ^ a.get(i);
            }
            else{
                zero = zero ^ a.get(i);
            }
        }

        for(int i=1; i<=n; i++){
            if((i & number)!=0) {
                one = one ^ i;
            }
            else{
                zero = zero ^ i;
            }
        }

        int cnt = 0;

        for(int i=0; i<n; i++){
            if(a.get(i) == zero){
                cnt++;
            }
        }

        if(cnt == 2){
            return new int[]{one, zero};
        }

        return new int[]{zero, one};

    }

}
