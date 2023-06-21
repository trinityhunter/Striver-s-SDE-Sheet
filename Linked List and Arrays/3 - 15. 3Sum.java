class Solution {

    public static void helper(int[] nums, int ind, List<List<Integer>> ans){

        int low = ind + 1;

        int high = nums.length-1;

        while(low<high){

            int sum = nums[ind] + nums[low] + nums[high];

            if(sum < 0){
                low++;
            }
            else if(sum > 0){
                high--;
            }
            else{

                ans.add(Arrays.asList(nums[ind], nums[low++], nums[high--]));
                
                while(low < high && nums[low] == nums[low-1]){
                    low++;
                }

            }

        }

    }

    public List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);

        List<List<Integer>> ma = new ArrayList<>();

        for(int i=0; i<nums.length && nums[i]<=0; i++){

            if(i==0 || nums[i-1] != nums[i]){
                helper(nums, i, ma);
            }

        }

        return ma;

    }
    
}
