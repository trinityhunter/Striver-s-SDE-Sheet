public class Solution {

    public static int helper(int a[], int n, int key){

        int l = 0;

        int h = n-1;

        while(l<=h){

            int mid = l+(h-l)/2;

            if(a[mid]<=key){
                l = mid+1;
            }
            else{
                h = mid-1;
            }

        }

        return l;

    }

    public static int ninjaAndLadoos(int row1[], int row2[], int m, int n, int k) {
        
        int low = Math.min(row1[0], row2[0]);

        int high = Math.max(row1[m-1], row2[n-1]);

        while(low <= high){

            int mid = low+(high-low)/2;

            int cnt1 = helper(row1, m, mid);

            int cnt2 = helper(row2, n, mid);

            if((cnt1 + cnt2) < k){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }

        }

        return low;
 
    }
    
}
