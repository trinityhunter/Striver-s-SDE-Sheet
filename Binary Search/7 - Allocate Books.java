import java.util.* ;
import java.io.*; 

public class Solution {

    public static boolean helper(int[] A, int pages, int students){

        int count = 0;

        int sum = 0;

        for(int i=0; i<A.length; i++){

            if(sum + A[i] > pages){
                count++;
                sum = A[i];
                if(sum > pages){
                    return false;
                }
            } 
            else{
                sum += A[i];
            }

        }

        if(count < students){
            return true;
        }

        return false;

    }

    public static long ayushGivesNinjatest(int B, int m, int[] A) {
        
        if(B > A.length){
            return -1;
        }

        int low = A[0];

        int high = 0;

        for(int i=0; i<A.length; i++) {
            high = high + A[i];
            low = Math.min(low, A[i]);
        }

        int res = -1;

        while(low <= high){

            int mid = (low + high) >> 1;

            if(helper(A, mid, B)){
                res = mid;
                high = mid - 1;
            } 
            else{
                low = mid + 1;
            }

        }
        
        return low;

    }

}
