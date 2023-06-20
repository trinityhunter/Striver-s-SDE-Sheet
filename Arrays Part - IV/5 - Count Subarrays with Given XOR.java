import java.io.*;
import java.util.* ;

import java.util.ArrayList;

public class Solution {
    
	public static int subarraysXor(ArrayList<Integer> a, int k) {

		int n = a.size();

        int m = 0;

        Map<Integer, Integer> hm = new HashMap<>();

        hm.put(m, 1);

        int count = 0;

        for(int i=0; i<n; i++){
			
            m = m ^ a.get(i);
			
            int x = m ^ k;
			
            if(hm.containsKey(x)){
                count += hm.get(x);
            }
			
            if(hm.containsKey(m)){
                hm.put(m, hm.get(m) + 1);
            } 
			else{
                hm.put(m, 1);
            }

        }
		
        return count;	
		
	}

}
