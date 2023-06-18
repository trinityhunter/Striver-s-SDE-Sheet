class Solution {

    public static void getReverse(int[] nums, int s, int e){

        while(s<=e){
            int temp = nums[s];
            nums[s] = nums[e];
            nums[e] = temp;
            s++;
            e--;
        }

    }

    public void nextPermutation(int[] nums) {

        int ind = -1;

        for(int i=nums.length-2; i>=0; i--){
            if(nums[i]<nums[i+1]){
                ind = i;
                break;
            }
        }

        if(ind == -1){
            getReverse(nums, 0, nums.length-1);
            return;
        }

        for(int i=nums.length-1; i>ind; i--){
            if(nums[i]>nums[ind]){
                int temp = nums[i];
                nums[i] = nums[ind];
                nums[ind] = temp;
                break;
            }
        }

        getReverse(nums, ind+1, nums.length-1);

    }

}
