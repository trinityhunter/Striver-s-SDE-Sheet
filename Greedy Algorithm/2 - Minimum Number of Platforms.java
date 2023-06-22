import java.util.*;

public class Solution {

    public static int calculateMinPatforms(int arr[], int dep[], int n) {

        Arrays.sort(arr); 
        
        Arrays.sort(dep); 
  
        int platform = 1;
        
        int ans = 1; 

        int i = 1;
        
        int j = 0; 
  
        while(i<n && j<n){ 
        
            if(arr[i] <= dep[j]){ 
                platform++; 
                i++; 
            }
            else if(arr[i] > dep[j]){ 
                platform--; 
                j++; 
            } 
  
            if(platform > ans) {
                ans = platform; 
            }
                
        } 
  
        return ans; 

    }

}
