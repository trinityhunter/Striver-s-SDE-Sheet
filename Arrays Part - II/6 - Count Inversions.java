import java.util.* ;
import java.io.*; 
public class Solution {

    public static long merge(long[] arr, int low, int mid, int high){

        ArrayList<Long> temp = new ArrayList<>();

        int left = low;

        int right = mid + 1;
        
        long count = 0;

        while(left <= mid && right <= high){

            if(arr[left] <= arr[right]){
                temp.add(arr[left]);
                left++;
            } 
            else{
                temp.add(arr[right]);
                count += (mid - left + 1); 
                right++;
            }

        }

        while(left <= mid){
            temp.add(arr[left]);
            left++;
        }
        
        while(right <= high){
            temp.add(arr[right]);
            right++;
        }
        
        for(int i=low; i<=high; i++){
            arr[i] = temp.get(i-low);
        }

        return count; 
        
    }

    public static long mergeSort(long[] arr, int low, int high){

        long count = 0;

        if(low>=high){
            return count;
        }

        int mid = (low+high)/2 ;

        count += mergeSort(arr, low, mid);

        count += mergeSort(arr, mid + 1, high); 

        count += merge(arr, low, mid, high);  

        return count;

    }

    public static long getInversions(long a[], int n) {

        return mergeSort(a, 0, n - 1);

    }

}
