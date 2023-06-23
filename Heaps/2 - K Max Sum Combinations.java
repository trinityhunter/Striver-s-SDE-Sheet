import java.util.* ;
import java.io.*; 

public class Solution{
	
	public static ArrayList<Integer> kMaxSumCombination(ArrayList<Integer> a, ArrayList<Integer> b, int n, int k){
		
		PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

		for(int i=0; i<a.size(); i++){
			for(int j=0; j<a.size(); j++){
				pq.add(a.get(i) + b.get(j));
			}
		}

		ArrayList<Integer> ans = new ArrayList<>();

		while(pq.size()>0 && k>0){
			ans.add(pq.peek());
			pq.remove();
			k--;
		}

		return ans;
		
	}
	
}
