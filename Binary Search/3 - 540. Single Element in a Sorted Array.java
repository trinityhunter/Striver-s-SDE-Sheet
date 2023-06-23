class Solution {

    public static int helper(int[] nums, int low, int high){

        if(low<high){

            int mid = (low+high)/2;

            if((mid%2==0 && nums[mid] == nums[mid+1]) || (mid%2==1 && nums[mid] == nums[mid-1])){
                return helper(nums, mid+1, high);
            }
            else{
                return helper(nums, low, mid);
            }

        }
        
        return nums[low];

    }

    public int singleNonDuplicate(int[] nums) {
        
        int ans = helper(nums, 0, nums.length-1);

        return ans;

    }

}
