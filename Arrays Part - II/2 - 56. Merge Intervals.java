class Solution {

    public int[][] merge(int[][] intervals) {

        if(intervals.length == 1){
            return intervals;
        }

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        List<int[]> ans = new ArrayList<>();

        int[] arr = intervals[0];

		ans.add(arr);

		for(int i=0; i<intervals.length; i++){
			if(intervals[i][0] <= arr[1]){
				arr[1] = Math.max(arr[1], intervals[i][1]);
            }
			else {                             
				arr = intervals[i];
				ans.add(arr);
			}
		}

		return ans.toArray(new int[ans.size()][]);

    }

}
