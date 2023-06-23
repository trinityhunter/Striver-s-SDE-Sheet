import java.util.* ;
import java.io.*; 

public class Solution {

    public static boolean helper(int[] positions, int maxSpace, int players, int n){
        
        int curr  = 1;
        
        int lastPos = positions[0];

        for(int i=0; i<n; i++){
            if(positions[i] - lastPos >= maxSpace){
                curr++;
                if(curr > players){
                    return false;
                }
                if(curr == players){
                    return true;
                }
                lastPos = positions[i];
            }
            
        }

        return false;

    }

    public static int chessTournament(int[] arr, int n,  int c){
        
        Arrays.sort(arr);

        int low = 0;

        int high = arr[n-1];

        int ans = -1;
        while(low <= high){

            int mid = low  + (high - low)/2;

            if(helper(arr, mid, c, n)){
                ans = mid;
                low = mid +1;
            }
            else{
                high = mid - 1;
            }

        }
        
        return ans;

    }

}
