import java.util.ArrayList;

public class Solution{

	public static int helper(ArrayList<Integer> row, int mid){

		int low = 0;
		
		int high = row.size()-1;
	
		while(low<=high){

			int md = (low+high) >> 1;

			if(row.get(md)<=mid){
				low = md+1;
			}
			else{
				high = md-1;
			}

		}

		return low;

	}

	public static int getMedian(ArrayList<ArrayList<Integer>> matrix){
		
		int low = 1;

		int high = (int)1e9;
	
		int n = matrix.size();

		int m = matrix.get(0).size();
	
		while(low<=high){

			int mid = (low+high)>>1;
	
			int count = 0;
	
			for(int i=0; i<n; i++){
				count += helper(matrix.get(i), mid);
			}
	
			if(count <= (n*m)/2){
				low = mid+1;
			}
			else{
				high = mid-1;
			}

		}
	
		return low;

	}

}
