import java.util.* ;
import java.io.*; 

public class Solution {

	public static boolean isSafe(int node, int[][] mat, int n, int currColor, int[] color){
		
		for(int i=0; i<n; i++){
			if(i!=node && mat[node][i]==1 && color[i] == currColor){
				return false;
			}	
		}

		return true;
		
	}

 	public static boolean helper(int node, int[][] mat, int m, int n, int[] color){
		
		if(node == n){
			return true;
		}
		
		for(int i=1; i<=m; i++){
			if(isSafe(node, mat, n, i, color)){
				color[node] = i;
				if(helper(node+1, mat, m, n, color)){
					return true;
				}
				color[node] = 0;
			}
		}

		return false;

	}

	public static String graphColoring(int[][] mat, int m) {
		
		int n = mat.length;

		int[] color = new int[n];
		
		if(helper(0, mat, m, n, color)){
			return "YES";
		}
		
		return "NO";

	}

}
