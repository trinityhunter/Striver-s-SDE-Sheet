public class Solution {

    public static int NthRoot(int n, int m) {
    
        if(m == 1 || n == 1){
            return m;
        }
            
        int low = 2;
        
        int high = m - 1;
        
        int mid = 0;

        while(low<=high){

            mid = low + (high - low)/2;

            if(Math.pow(mid, n) == m){
                return mid;
            }
            else if(Math.pow(mid, n) > m){
                high = mid-1;
            }
            else{
                low = mid + 1;
            }  
            
        }

        return -1;
    
    }

}
